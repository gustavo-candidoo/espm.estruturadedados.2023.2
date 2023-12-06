package Exercício03;
import java.util.Scanner;

public class Main {
    private static <T extends Comparable<T>> int arvoreAltura(No<T> raiz) {
        if (raiz == null) {
            return 0;
        } else {
            int alturaDir = arvoreAltura(raiz.getDir());
            int alturaEsq = arvoreAltura(raiz.getEsq());
            return 1 + Math.max(alturaEsq, alturaDir);
        }
    }
    
    public static void main(String[] args) {
        Lista<Integer> arv = new Lista<>();
        Scanner scn = new Scanner(System.in);

        System.out.println("Quantos valores serão inseridos na árvore?");
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um valor: ");
            int x = scn.nextInt();
            arv.inserir(x);
        }

        System.out.println("Valores que estão armazenados na árvore: ");
        arv.preOrdem();
        System.out.println("\nA altura da árvore é: " + arvoreAltura(arv.raiz));
        scn.close();
    }

    
}
