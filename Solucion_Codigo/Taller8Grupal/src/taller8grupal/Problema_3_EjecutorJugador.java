package taller8grupal;

public class Problema_3_EjecutorJugador {

    public static void main(String[] args) {

    }
    abstract public class Jugador{
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
            return "Jugador{" + "nombre=" + nombre + ", numeroDorsal=" + numeroDorsal + ", Rut=" + Rut + '}';
        }
    }
    
    class Atacante extends Jugador{
        public int pasesRealizados;
        public int balonesRecuperados;

        public Atacante() {
        }

        public Atacante(int pasesRealizados, int balonesRecuperados, String nombre, int numeroDorsal, String Rut, int goles) {
            super(nombre, numeroDorsal, Rut, goles);
            this.pasesRealizados = pasesRealizados;
            this.balonesRecuperados = balonesRecuperados;
        }
        
        public int pasesCompletados(){
            return 0;
        }
        
        public int recuperacionesConExito(){
            return 0;
        }
        
        public int golesMarcados(Jugador jugador){
            return 0;
        }

        @Override
        public String toString() {
            return "Atacante{" + "pasesRealizados=" + pasesRealizados + ", balonesRecuperados=" + balonesRecuperados + '}';
        }
    }
    
    class Defensor extends Jugador{
        public int pasesRealizados;
        public int balonesRecuperados;

        public Defensor() {
        }

        public Defensor(int pasesRealizados, int balonesRecuperados, String nombre, int numeroDorsal, String Rut, int goles) {
            super(nombre, numeroDorsal, Rut, goles);
            this.pasesRealizados = pasesRealizados;
            this.balonesRecuperados = balonesRecuperados;
        }
        
        public int pasesCompletados(){
            return 0;
        }
        
        public int recuperacionesConExito(){
            return 0;
        }
        
        public int golesMarcados(Jugador jugador){
            return 0;
        }

        @Override
        public String toString() {
            return "Defensor{" + "pasesRealizados=" + pasesRealizados + ", balonesRecuperados=" + balonesRecuperados + '}';
        }
    }
    
    class Portero extends Jugador{
        public int atajadasRealizadas;

        public Portero() {
        }

        public Portero(int atajadasRealizadas, String nombre, int numeroDorsal, String Rut, int goles) {
            super(nombre, numeroDorsal, Rut, goles);
            this.atajadasRealizadas = atajadasRealizadas;
        }
        public int atajadasConExito(){
            return 0;
        }
        public int golesMarcados(Jugador jugador){
            return 0;
        }

        @Override
        public String toString() {
            return "Portero{" + "atajadasRealizadas=" + atajadasRealizadas + '}';
        }
        
        
    }
}

   