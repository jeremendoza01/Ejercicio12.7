import java.io.*;
import java.util.Scanner;

class App {
    // TablaDispersaEnlazada tabla = new TablaDispersaEnlazada();

    //// MAIN
    public static void main(String[] a) throws IOException {

        // No se para que usar el sgte osea se q hace pero no se como usarlo
        // TipoSocio sgte;
        Scanner input = new Scanner(System.in);
        int x, control, menu;
        TablaDispersaEnlazada tabla = new TablaDispersaEnlazada();
        control = 1;

        do {

            System.out.println(
                    "\n 1 - Añanir un nuevo socio \n 2 - Buscar un socio \n 3 - Eliminar socio");
            menu = input.nextInt();
            input.nextLine();
            // System.out.println("La clave es " + x);

            switch (menu) {
                case 1:
                    // Insertar un socio

                    TipoSocio socio = new TipoSocio();
                    tabla.insertar(socio);

                    break;

                case 2:
                    // Buscar un socio
                    System.out.println("Ingrese la clave para buscar el mismo ");
                    int busqueda = input.nextInt();
                    tabla.Buscar(busqueda).socio.muestra();

                    break;

                case 3:
                    // Eliminar un socio

                    break;

                case 0:
                    break;
            }
            // int y = tabla.dispersion(x);
            // System.out.println("la clave dispersa es " + y);

            // tabla.Insertar();

            // System.out.println("ingresa la clave para borrar el elemento");
            // int buscarr = input.nextInt();

            // tabla.Eliminar(buscarr);
            // System.out.println("se elimino pa");

            // System.out.println("ingresa la clave para buscar el elemento");
            // int busca = input.nextInt();

            // TipoSocio aux = tabla.Buscar(busca);
            // System.out.println("El elemento que estas buscando es " + aux);
        } while (control != 0);
    }
}
