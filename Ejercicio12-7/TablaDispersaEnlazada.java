public class TablaDispersaEnlazada {

    static final int M = 97;
    static final double R = 0.618034;
    private Elemento[] tabla;
    private int numElementos;

    // Inicializar la tabla
    public TablaDispersaEnlazada() {
        int M = 101;
        this.tabla = new Elemento[M];
        for (int i = 0; i < M; i++) {
            this.tabla[i] = null;
            numElementos = 0;
        }
    }

    // Funcion de dispersion para retornar el codigo del chabon
    static int dispersion(long x) {
        double t;
        int v;
        t = R * x - Math.floor(R * x); // parte decimal
        v = (int) (M * t);
        return v;
    }

    // Insertar un socio en la tabla
    public void insertar(TipoSocio s) {
        int posicion;
        Elemento nuevo;
        posicion = dispersion(s.getCodigo());
        nuevo = new Elemento(s);
        nuevo.sgte = tabla[posicion];
        tabla[posicion] = nuevo;
        numElementos++;
    }

    // Buscar un socio segun la clave
    public Elemento Buscar(int clave) {
        Elemento aux;
        int posicion = dispersion(clave);
        aux = this.tabla[posicion];
        return aux;
    }

    // Eliminar un socio en caso de necesitarlo, segun su clave
    public void eliminar(int codigo) {
        int posicion;
        posicion = dispersion(codigo);
        if (tabla[posicion] != null) // no está vacía
        {
            Elemento anterior, actual;
            anterior = null;
            actual = tabla[posicion];
            while ((actual.sgte != null) &&
                    actual.getSocio().getCodigo() != codigo) {
                anterior = actual;
                actual = actual.sgte;
            }
            if (actual.getSocio().getCodigo() != codigo)
                System.out.println("No se encuentra en la tabla el socio "
                        + codigo);
            // else if (conforme(actual.getSocio())) // se retira el nodo

            if (anterior == null) // primer nodo
                tabla[posicion] = actual.sgte;

            else
                anterior.sgte = actual.sgte;
            actual = null;
            numElementos--;
        }

    }

    // NECESITO PONER ESTE METODO PERO NO SE COMO PONERLO
    // boolean conforme(TipoSocio a){

    // };
}
