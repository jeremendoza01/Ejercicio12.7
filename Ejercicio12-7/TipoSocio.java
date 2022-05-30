import java.util.Scanner;

public class TipoSocio {

    int codigo;
    private String nombre;
    private int edad;
    Fecha f;

    public TipoSocio() {
        nombre = "";
        codigo = 0;
        edad = 0;
        asigna();
    }

    public void asigna() {

        Scanner input = new Scanner(System.in);
        System.out.print("\n Codigo: ");
        int codigo = input.nextInt();
        System.out.print("\n Nombre del pibe: ");
        String n = input.nextLine();
        System.out.print("\n Edad: ");
        int e = input.nextInt();
    }

    public TipoSocio(String n, int c, int e, int d, int m, int a) {
        nombre = n;
        codigo = c;
        edad = e;
        f = new Fecha(d, m, a);
    }

    // Returna la fecha en formato string
    class Fecha {
        int dia;
        int mes;
        int anno;

        Fecha(int d, int m, int a) {
            dia = d;
            mes = m;
            anno = a;
        }

        public String toString() {
            return " " + dia + "-" + mes + "-" + anno;
        }
    };
    
    public void muestra() {
        System.out.println("\n Codigo " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    
    // Codigo del loco
    public int getCodigo() {
        return codigo;
    }

}
