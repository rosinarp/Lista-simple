class ListaLigadaSimple {
    public Nodo cabeza;

    public ListaLigadaSimple() {
        this.cabeza = null;
    }

    // Buscar un nodo por el valor de su campo clave y devolver una referencia
    public Nodo buscarPorClave(int clave) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.clave == clave) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // Buscar un nodo por su campo clave e insertar un nuevo nodo después de él
    public void insertarDespuesDe(int claveBuscada, Nodo nuevoNodo) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.clave == claveBuscada) {
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
                return;
            }
            actual = actual.siguiente;
        }
    }

    // Intercambiar un nodo por otro buscado
    public void intercambiarNodos(int clave1, int clave2) {
        // Encontrar los nodos con las claves dadas
        Nodo nodo1 = null, nodo2 = null;
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.clave == clave1) {
                nodo1 = actual;
            } else if (actual.clave == clave2) {
                nodo2 = actual;
            }
            actual = actual.siguiente;
        }

        // Verificar si ambos nodos existen
        if (nodo1 != null && nodo2 != null) {
            // Intercambiar los nodos
            int temp = nodo1.clave;
            nodo1.clave = nodo2.clave;
            nodo2.clave = temp;
        }
    }

    // Método para imprimir la lista
    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.clave + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
