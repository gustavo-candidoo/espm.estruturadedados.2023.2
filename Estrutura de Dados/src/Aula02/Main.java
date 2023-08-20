package Aula02;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        lista.inserir(20);
        lista.inserir(12);
        lista.inserir(70);
        lista.inserir(15);
        lista.inserir(18);

        lista.removerPrimeiro();
        lista.imprimir();
    }
}
