package taller8grupal;

public class Problema_3_EjecutorJugador {

    public static void main(String[] args) {
        Atacante atacante = new Atacante(20, 5, "Messi", 10, "12345678-9", 30);
        Defensor defensor = new Defensor(15, 10, "Piqué", 3, "98765432-1", 5);
        Portero portero = new Portero(25, "Neuer", 1, "10293847-5", 0);

        System.out.println(atacante);
        System.out.println("Goles marcados: " + atacante.golesMarcados(atacante));
        System.out.println();

        System.out.println(defensor);
        System.out.println("Goles marcados: " + defensor.golesMarcados(defensor));
        System.out.println();

        System.out.println(portero);
        System.out.println("Goles marcados: " + portero.golesMarcados(portero));
        System.out.println();
    }
}


abstract class Jugador {
    public String nombre;
    public int numeroDorsal;
    public String Rut;
    public int goles;

    public Jugador() {
    }

    public Jugador(String nombre, int numeroDorsal, String Rut, int goles) {
        this.nombre = nombre;
        this.numeroDorsal = numeroDorsal;
        this.Rut = Rut;
        this.goles = goles;
    }

    public abstract int golesMarcados(Jugador jugador);

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", numeroDorsal=" + numeroDorsal +
                ", Rut='" + Rut + '\'' +
                ", goles=" + goles +
                '}';
    }
}

class Atacante extends Jugador {
    public int pasesRealizados;
    public int balonesRecuperados;

    public Atacante() {
    }

    public Atacante(int pasesRealizados, int balonesRecuperados, String nombre, int numeroDorsal, String Rut, int goles) {
        super(nombre, numeroDorsal, Rut, goles);
        this.pasesRealizados = pasesRealizados;
        this.balonesRecuperados = balonesRecuperados;
    }

    public int pasesCompletados() {
        return (int) (pasesRealizados * 0.85); // 85% éxito
    }

    public int recuperacionesConExito() {
        return (int) (balonesRecuperados * 0.7); // 70% éxito
    }

    @Override
    public int golesMarcados(Jugador jugador) {
        return this.goles;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAtacante{" +
                "pasesRealizados=" + pasesRealizados +
                ", balonesRecuperados=" + balonesRecuperados +
                ", pasesCompletados=" + pasesCompletados() +
                ", recuperacionesConExito=" + recuperacionesConExito() +
                '}';
    }
}

class Defensor extends Jugador {
    public int pasesRealizados;
    public int balonesRecuperados;

    public Defensor() {
    }

    public Defensor(int pasesRealizados, int balonesRecuperados, String nombre, int numeroDorsal, String Rut, int goles) {
        super(nombre, numeroDorsal, Rut, goles);
        this.pasesRealizados = pasesRealizados;
        this.balonesRecuperados = balonesRecuperados;
    }

    public int pasesCompletados() {
        return (int) (pasesRealizados * 0.9); 
    }

    public int recuperacionesConExito() {
        return (int) (balonesRecuperados * 0.8); 
    }

    @Override
    public int golesMarcados(Jugador jugador) {
        return this.goles;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDefensor{" +
                "pasesRealizados=" + pasesRealizados +
                ", balonesRecuperados=" + balonesRecuperados +
                ", pasesCompletados=" + pasesCompletados() +
                ", recuperacionesConExito=" + recuperacionesConExito() +
                '}';
    }
}

class Portero extends Jugador {
    public int atajadasRealizadas;

    public Portero() {
    }

    public Portero(int atajadasRealizadas, String nombre, int numeroDorsal, String Rut, int goles) {
        super(nombre, numeroDorsal, Rut, goles);
        this.atajadasRealizadas = atajadasRealizadas;
    }

    public int atajadasConExito() {
        return (int) (atajadasRealizadas * 0.95); 
    }

    @Override
    public int golesMarcados(Jugador jugador) {
        return this.goles;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPortero{" +
                "atajadasRealizadas=" + atajadasRealizadas +
                ", atajadasConExito=" + atajadasConExito() +
                '}';
    }
}
   