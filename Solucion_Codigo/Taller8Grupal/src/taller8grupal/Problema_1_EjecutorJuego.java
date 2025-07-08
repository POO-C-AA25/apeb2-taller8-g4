package taller8grupal;
public class Problema_1_EjecutorJuego {

    static Personaje guerrero;
    static Personaje mago;
    static Personaje arquero;

    public static void main(String[] args) {
        guerrero = new Guerrero("Gigante", "Guerrero", 3);
        mago = new Mago("Invisible", "Mago", 3);
        arquero = new Arquero("Precisión", "Arquero", 3);
        pelea(guerrero, mago);
        pelea(arquero, guerrero);
        pelea(arquero, mago);

        System.out.println("\nESTADO FINAL DE LOS PERSONAJES:");
        System.out.println("GUERRERO: " + guerrero);
        System.out.println("MAGO: " + mago);
        System.out.println("ARQUERO: " + arquero);
    }

    public static void pelea(Personaje atacante, Personaje defensor) {
        boolean gana = atacante.ataque(defensor);
        if (guerrero.ataque(mago)) {
            guerrero.experiencia++;
            guerrero.batallasGana++;
            mago.vidas = mago.defensa() - 1;
            System.out.println("Ganó: " + guerrero.getNombre());
        } else {
            mago.experiencia++;
            mago.batallasGana++;
            guerrero.vidas = guerrero.defensa() - 1;
            System.out.println("Ganó: " + mago.getNombre());
        }

        System.out.println("Ahora arquero vs guerrero:");
        if (arquero.ataque(guerrero)) {
            arquero.experiencia++;
            arquero.batallasGana++;
            guerrero.vidas = guerrero.defensa() - 1;
            System.out.println("Ganó: " + arquero.getNombre());
        } else {
            guerrero.experiencia++;
            guerrero.batallasGana++;
            arquero.vidas = arquero.defensa() - 1;
            System.out.println("Ganó: " + guerrero.getNombre());
        }

        System.out.println("arquero contra mago:");
        if (arquero.ataque(mago)) {
            arquero.experiencia++;
            arquero.batallasGana++;
            mago.vidas = mago.defensa() - 1;
            System.out.println("Ganó: " + arquero.getNombre());
        } else {
            mago.experiencia++;
            mago.batallasGana++;
            arquero.vidas = arquero.defensa() - 1;
            System.out.println("Ganó: " + mago.getNombre());
        }

        System.out.println("");
        System.out.println("Estado final:");
        System.out.println("Guerrero: " + guerrero);
        System.out.println("Mago: " + mago);
        System.out.println("Arquero: " + arquero);
    }
}

abstract class Personaje {

    protected String nombre;
    public int vidas;
    public int experiencia;
    public int batallasGana;

    public Personaje(String nombre, int vidas) {
        this.nombre = nombre;
        this.vidas = vidas;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract boolean ataque(Personaje personaje);

    public abstract int defensa();

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", vidas=" + vidas + ", experiencia=" + experiencia + ", batallasGana=" + batallasGana + '}';
    }
}

class Guerrero extends Personaje {

    public String habilidades;

    public Guerrero(String habilidades, String nombre, int vidas) {
        super(nombre, vidas);
        this.habilidades = habilidades;
    }

    @Override
    public boolean ataque(Personaje personaje) {
        int bandera = (int) (Math.random() * 2);
        return bandera == 1;
    }

    @Override
    public int defensa() {
        return 1;
    }

    @Override
    public String toString() {
        return "Guerrero{" + "habilidades=" + habilidades + '}' + super.toString();
    }
}

class Mago extends Personaje {

    public String estrategia;

    public Mago(String estrategia, String nombre, int vidas) {
        super(nombre, vidas);
        this.estrategia = estrategia;
    }

    @Override
    public boolean ataque(Personaje personaje) {
        int probabilidad = (int) (Math.random() * 2);
        return probabilidad == 1;
    }

    @Override
    public int defensa() {
        return 1;
    }

    @Override
    public String toString() {
        return "Mago{" + "estrategia=" + estrategia + '}' + super.toString();
    }
}

class Arquero extends Personaje {

    public String atributo;

    public Arquero(String atributo, String nombre, int vidas) {
        super(nombre, vidas);
        this.atributo = atributo;
    }

    @Override
    public boolean ataque(Personaje personaje) {
        int probabilidad = (int) (Math.random() * 2);
        return probabilidad == 1;
    }

    @Override
    public int defensa() {
        return 1;
    }

    @Override
    public String toString() {
        return "Arquero{" + "atributo=" + atributo + '}' + super.toString();
    }
}
