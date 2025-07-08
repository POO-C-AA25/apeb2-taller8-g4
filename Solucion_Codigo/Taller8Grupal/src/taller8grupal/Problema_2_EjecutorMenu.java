package taller8grupal;

import java.util.ArrayList;

public class Problema_2_EjecutorMenu {

    public static void main(String[] args) {
        

    }

    class Cuenta {

        public String nombreCliente;
        ArrayList<Menu> listadoMenus = new ArrayList<>();
        public double valorCancelar;
        public double subtotal;
        public int IVA;

        public Cuenta() {

        }

        @Override
        public String toString() {
            return "cuenta{" + "nombreCliente=" + nombreCliente + ", listadoMenus=" + listadoMenus + ", valorCancelar=" + valorCancelar + ", subtotal=" + subtotal + ", IVA=" + IVA + '}';
        }

    }

    abstract class Menu {

        public String nombrePlato;
        public double valorMenu;
        public double valorInicialMenu;

        public Menu() {
        }

        public Menu(String nombrePlato, double valorMenu, double valorInicialMenu) {
            this.nombrePlato = nombrePlato;
            this.valorMenu = valorMenu;
            this.valorInicialMenu = valorInicialMenu;
        }

        public abstract double calcularValorPlato(Menu menu);

        @Override
        public String toString() {
            return "Menu{" + "nombrePlato=" + nombrePlato + ", valorMenu=" + valorMenu + ", valorInicialMenu=" + valorInicialMenu + '}';
        }
    }

    class MenuCarta extends Menu {

        public double valorPorcionGuarnicion;
        public double valorBebida;
        public int porcentajeAdicional;

        public MenuCarta() {
        }

        public MenuCarta(double valorPorcionGuarnicion, double valorBebida, int porcentajeAdicional, String nombrePlato, double valorMenu, double valorInicialMenu) {
            super(nombrePlato, valorMenu, valorInicialMenu);
            this.valorPorcionGuarnicion = valorPorcionGuarnicion;
            this.valorBebida = valorBebida;
            this.porcentajeAdicional = porcentajeAdicional;
        }

        public double calcularValorPlato(Menu menu) {

            return 0;
        }

        @Override
        public String toString() {
            return "MenuCarta{" + "valorPorcionGuarnicion=" + valorPorcionGuarnicion + ", valorBebida=" + valorBebida + ", porcentajeAdicional=" + porcentajeAdicional + '}';
        }
    }

    class MenuDelDia extends Menu {

        public double valorPostre;
        public double valorBebida;

        public MenuDelDia() {
        }

        public MenuDelDia(double valorPostre, double valorBebida, String nombrePlato, double valorMenu, double valorInicialMenu) {
            super(nombrePlato, valorMenu, valorInicialMenu);
            this.valorPostre = valorPostre;
            this.valorBebida = valorBebida;
        }

        public double calcularValorPlato(Menu menu) {

            return 0;
        }

        @Override
        public String toString() {
            return "MenuDelDia{" + "valorPostre=" + valorPostre + ", valorBebida=" + valorBebida + '}';
        }

    }

    class MenuNinos extends Menu {

        public double valorPorcionHelado;
        public double valorPorcionPastel;

        public MenuNinos() {
        }

        public MenuNinos(double valorPorcionHelado, double valorPorcionPastel, String nombrePlato, double valorMenu, double valorInicialMenu) {
            super(nombrePlato, valorMenu, valorInicialMenu);
            this.valorPorcionHelado = valorPorcionHelado;
            this.valorPorcionPastel = valorPorcionPastel;
        }

        public double calcularValorPlato(Menu menu) {

            return 0;
        }

        @Override
        public String toString() {
            return "MenuNinos{" + "valorPorcionHelado=" + valorPorcionHelado + ", valorPorcionPastel=" + valorPorcionPastel + '}';
        }

    }

    class MenuEconomico extends Menu {

        public int porcentajeDescuento;

        public MenuEconomico() {
        }

        public MenuEconomico(int porcentajeDescuento, String nombrePlato, double valorMenu, double valorInicialMenu) {
            super(nombrePlato, valorMenu, valorInicialMenu);
            this.porcentajeDescuento = porcentajeDescuento;
        }

        public double calcularValorPlato(Menu menu) {

            return 0;
        }

        @Override
        public String toString() {
            return "MenuEconomico{" + "porcentajeDescuento=" + porcentajeDescuento + '}';
        }

    }

}
