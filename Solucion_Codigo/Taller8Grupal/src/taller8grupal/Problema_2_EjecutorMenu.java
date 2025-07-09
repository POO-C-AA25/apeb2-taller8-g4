package taller8grupal;
import java.util.ArrayList;

public class Problema_2_EjecutorMenu {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Juliana", 12);

        MenuCarta menuCarta = new MenuCarta("Pollo BBQ", 5.0, 2.0, 1.5, 10);
        MenuDelDia menuDia = new MenuDelDia("Arroz con menestra", 4.0, 1.0, 1.2);
        MenuNinos menuNino = new MenuNinos("Nuggets", 3.5, 1.0, 1.0);
        MenuEconomico menuEco = new MenuEconomico("Sopa de verduras", 6.0, 15);

        cuenta.agregarMenu(menuCarta);
        cuenta.agregarMenu(menuDia);
        cuenta.agregarMenu(menuNino);
        cuenta.agregarMenu(menuEco);

        cuenta.calcularValores();

        System.out.println(cuenta);
    }

    
    static class Cuenta {
        private String nombreCliente;
        private ArrayList<Menu> listadoMenus = new ArrayList<>();
        private double subtotal;
        private double valorCancelar;
        private int IVA;

        public Cuenta(String nombreCliente, int IVA) {
            this.nombreCliente = nombreCliente;
            this.IVA = IVA;
        }

        public void agregarMenu(Menu menu) {
            listadoMenus.add(menu);
        }

        public void calcularValores() {
            subtotal = 0;
            for (Menu m : listadoMenus) {
                subtotal += m.calcularValorPlato();
            }
            valorCancelar = subtotal + (subtotal * IVA / 100.0);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Cuenta de: ").append(nombreCliente).append("\n");
            for (Menu m : listadoMenus) {
                sb.append(m).append("\n");
            }
            sb.append(String.format("Subtotal: $%.2f\nIVA: %d%%\nTotal a pagar: $%.2f\n",
                    subtotal, IVA, valorCancelar));
            return sb.toString();
        }
    }

    static abstract class Menu {
        protected String nombrePlato;
        protected double valorInicialMenu;
        protected double valorMenu;

        public Menu(String nombrePlato, double valorInicialMenu) {
            this.nombrePlato = nombrePlato;
            this.valorInicialMenu = valorInicialMenu;
        }

        public abstract double calcularValorPlato();

        @Override
        public String toString() {
            return String.format("Plato: %s | Valor final: $%.2f", nombrePlato, valorMenu);
        }
    }

    static class MenuCarta extends Menu {
        private double valorPorcionGuarnicion;
        private double valorBebida;
        private int porcentajeAdicional;

        public MenuCarta(String nombrePlato, double valorInicialMenu,
                         double valorPorcionGuarnicion, double valorBebida, int porcentajeAdicional) {
            super(nombrePlato, valorInicialMenu);
            this.valorPorcionGuarnicion = valorPorcionGuarnicion;
            this.valorBebida = valorBebida;
            this.porcentajeAdicional = porcentajeAdicional;
        }

        @Override
        public double calcularValorPlato() {
            valorMenu = valorInicialMenu + valorPorcionGuarnicion + valorBebida +
                        (valorInicialMenu * porcentajeAdicional / 100.0);
            return valorMenu;
        }

        @Override
        public String toString() {
            return super.toString() + String.format(" (Carta: guarnición $%.2f, bebida $%.2f, %d%% extra)",
                    valorPorcionGuarnicion, valorBebida, porcentajeAdicional);
        }
    }

    static class MenuDelDia extends Menu {
        private double valorPostre;
        private double valorBebida;

        public MenuDelDia(String nombrePlato, double valorInicialMenu,
                          double valorPostre, double valorBebida) {
            super(nombrePlato, valorInicialMenu);
            this.valorPostre = valorPostre;
            this.valorBebida = valorBebida;
        }

        @Override
        public double calcularValorPlato() {
            valorMenu = valorInicialMenu + valorPostre + valorBebida;
            return valorMenu;
        }

        @Override
        public String toString() {
            return super.toString() + String.format(" (Día: postre $%.2f, bebida $%.2f)",
                    valorPostre, valorBebida);
        }
    }

    static class MenuNinos extends Menu {
        private double valorPorcionHelado;
        private double valorPorcionPastel;

        public MenuNinos(String nombrePlato, double valorInicialMenu,
                         double valorPorcionHelado, double valorPorcionPastel) {
            super(nombrePlato, valorInicialMenu);
            this.valorPorcionHelado = valorPorcionHelado;
            this.valorPorcionPastel = valorPorcionPastel;
        }

        @Override
        public double calcularValorPlato() {
            valorMenu = valorInicialMenu + valorPorcionHelado + valorPorcionPastel;
            return valorMenu;
        }

        @Override
        public String toString() {
            return super.toString() + String.format(" (Niños: helado $%.2f, pastel $%.2f)",
                    valorPorcionHelado, valorPorcionPastel);
        }
    }

    static class MenuEconomico extends Menu {
        private int porcentajeDescuento;

        public MenuEconomico(String nombrePlato, double valorInicialMenu,
                             int porcentajeDescuento) {
            super(nombrePlato, valorInicialMenu);
            this.porcentajeDescuento = porcentajeDescuento;
        }

        @Override
        public double calcularValorPlato() {
            valorMenu = valorInicialMenu - (valorInicialMenu * porcentajeDescuento / 100.0);
            return valorMenu;
        }

        @Override
        public String toString() {
            return super.toString() + String.format(" (Económico: %d%% descuento)",
                    porcentajeDescuento);
        }
    }
}