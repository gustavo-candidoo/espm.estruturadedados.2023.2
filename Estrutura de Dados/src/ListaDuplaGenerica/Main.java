package ListaDuplaGenerica;

public class Main {
    public static void main(String[] args) {
     
        Lista<String> lista = new Lista<>();

        lista.inserirInicio("Surjan");
        lista.inserirInicio("Surian");
        lista.inserirInicio("Sandra");

        lista.imprimir();

    }
}

