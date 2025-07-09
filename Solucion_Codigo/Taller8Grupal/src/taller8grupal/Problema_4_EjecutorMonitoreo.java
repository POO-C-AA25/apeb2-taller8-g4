package taller8grupal;

public class Problema_4_EjecutorMonitoreo {

    public static void main(String[] args) {

    }

    abstract class MonitorieoAmbiental {

        public int temperatura;
        public int precipitacion;
        public int calidadAire;
        public int humedadSuelo;

        public MonitorieoAmbiental() {
        }

        public MonitorieoAmbiental(int temperatura, int precipitacion, int calidadAire, int humedadSuelo) {
            this.temperatura = temperatura;
            this.precipitacion = precipitacion;
            this.calidadAire = calidadAire;
            this.humedadSuelo = humedadSuelo;
        }

        public abstract String registroAnalisisDatos(MonitorieoAmbiental monitorieoAmbiental);

        @Override
        public String toString() {
            return "MonitorieoAmbiental{" + "temperatura=" + temperatura + ", precipitacion=" + precipitacion + ", calidadAire=" + calidadAire + ", humedadSuelo=" + humedadSuelo + '}';
        }
    }

    class Costa extends MonitorieoAmbiental {

        public Costa() {
        }

        public Costa(int temperatura, int precipitacion, int calidadAire, int humedadSuelo) {
            super(temperatura, precipitacion, calidadAire, humedadSuelo);
        }

        public String contaminacionAire() {
            return "";
        }

        public String registroAnalisisDatos(MonitorieoAmbiental monitorieoAmbiental) {
            return "";
        }

        @Override
        public String toString() {
            return "Costa{" + '}';
        }

    }
    class Sierra extends MonitorieoAmbiental {

        public Sierra() {
        }

        public Sierra(int temperatura, int precipitacion, int calidadAire, int humedadSuelo) {
            super(temperatura, precipitacion, calidadAire, humedadSuelo);
        }

        public String sequia() {
            return "";
        }

        public String registroAnalisisDatos(MonitorieoAmbiental monitorieoAmbiental) {
            return "";
        }

        @Override
        public String toString() {
            return "Sierra{" + '}';
        }

    }
    class Oriente extends MonitorieoAmbiental {

        public Oriente() {
        }

        public Oriente(int temperatura, int precipitacion, int calidadAire, int humedadSuelo) {
            super(temperatura, precipitacion, calidadAire, humedadSuelo);
        }

        public String deslizamientos() {
            return "";
        }

        public String registroAnalisisDatos(MonitorieoAmbiental monitorieoAmbiental) {
            return "";
        }

        @Override
        public String toString() {
            return "Oriente{" + '}';
        }

    }

}
