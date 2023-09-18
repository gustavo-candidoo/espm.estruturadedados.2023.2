package Pilha;
import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {
        Stack<String> lista = new Stack<>();
        lista.push("Gustavo");
        lista.push("Selmini");
        lista.push("Marqueti");

        System.out.println(lista);

        lista.pop();

        System.out.println(lista);
    }

   
}
