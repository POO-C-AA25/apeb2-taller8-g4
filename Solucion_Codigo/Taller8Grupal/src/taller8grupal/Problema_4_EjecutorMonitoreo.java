package taller8grupal;

public class Problema_4_EjecutorMonitoreo {

    public static void main(String[] args) {
        MonitorieoAmbiental costa = new Costa(30, 80, 50, 60);
        MonitorieoAmbiental sierra = new Sierra(15, 20, 40, 30);
        MonitorieoAmbiental oriente = new Oriente(28, 120, 35, 90);

        System.out.println(costa);
        System.out.println(costa.registroAnalisisDatos(costa));
        System.out.println();

        System.out.println(sierra);
        System.out.println(sierra.registroAnalisisDatos(sierra));
        System.out.println();

        System.out.println(oriente);
        System.out.println(oriente.registroAnalisisDatos(oriente));
        System.out.println();
    }
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

    public abstract String registroAnalisisDatos(MonitorieoAmbiental m);

    @Override
    public String toString() {
        return "Monitoreo{" +
                "temperatura=" + temperatura +
                ", precipitacion=" + precipitacion +
                ", calidadAire=" + calidadAire +
                ", humedadSuelo=" + humedadSuelo +
                '}';
    }
}

class Costa extends MonitorieoAmbiental {
    public Costa() {
    }

    public Costa(int temperatura, int precipitacion, int calidadAire, int humedadSuelo) {
        super(temperatura, precipitacion, calidadAire, humedadSuelo);
    }

    public String contaminacionAire() {
        return calidadAire > 70 ? "Alta contaminación" : "Contaminación controlada";
    }

    @Override
    public String registroAnalisisDatos(MonitorieoAmbiental m) {
        return "Costa - Análisis: " + contaminacionAire();
    }

    @Override
    public String toString() {
        return super.toString() + "\nRegión: Costa";
    }
}

class Sierra extends MonitorieoAmbiental {
    public Sierra() {
    }

    public Sierra(int temperatura, int precipitacion, int calidadAire, int humedadSuelo) {
        super(temperatura, precipitacion, calidadAire, humedadSuelo);
    }

    public String sequia() {
        return precipitacion < 30 && humedadSuelo < 40 ? "Riesgo de sequía" : "Sin riesgo de sequía";
    }

    @Override
    public String registroAnalisisDatos(MonitorieoAmbiental m) {
        return "Sierra - Análisis: " + sequia();
    }

    @Override
    public String toString() {
        return super.toString() + "\nRegión: Sierra";
    }
}

class Oriente extends MonitorieoAmbiental {
    public Oriente() {
    }

    public Oriente(int temperatura, int precipitacion, int calidadAire, int humedadSuelo) {
        super(temperatura, precipitacion, calidadAire, humedadSuelo);
    }

    public String deslizamientos() {
        return precipitacion > 100 && humedadSuelo > 80 ? "Alto riesgo de deslizamientos" : "Riesgo bajo";
    }

    @Override
    public String registroAnalisisDatos(MonitorieoAmbiental m) {
        return "Oriente - Análisis: " + deslizamientos();
    }

    @Override
    public String toString() {
        return super.toString() + "\nRegión: Oriente";
    }
}
