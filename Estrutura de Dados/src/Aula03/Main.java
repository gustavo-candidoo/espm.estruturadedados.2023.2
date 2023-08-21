package Aula03;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.inserirInicio(12, "Gustavo");
        lista.inserirInicio(30, "Sandra");
        lista.inserirInicio(50, "Flávio");

        lista.imprimir();
    }
}
