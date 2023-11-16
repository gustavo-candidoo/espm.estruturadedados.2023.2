public class Main {
    public static void main(String[] args) {
        
        Lista l1 = new Lista();
        Lista l2 = new Lista();

        // insere 3 valores na lista 1
        l1.inserir(15);
        l1.inserir(-1);
        l1.inserir(12);

        // insere 3 valores na lista 2
        l2.inserir(55);
        l2.inserir(65);
        l2.inserir(70);
        
        // exercício 1 --> concatenar as duas listas
        //Lista l3 = l1.concatenar(l2);
        //l3.imprimir();

        // exercício 4 --> remover n elementos da lista
        //System.out.println(l1.removerElementos(2));
        //l1.imprimir();

        // exercício 5 --> fazer uma cópia da lista l2
        //Lista copia = l2.copiar();
        //copia.imprimir();

        // exercicio 6 --> inverter a lista l2 
        Lista lista = l2.inverter();
        lista.imprimir();

    }
}
