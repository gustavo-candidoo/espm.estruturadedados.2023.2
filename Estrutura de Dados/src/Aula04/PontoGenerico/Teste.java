package Aula04.PontoGenerico;

public class Teste {
    public static void main(String[] args) {

        Ponto<Integer> p = new Ponto<>(2, 3);
        System.out.println(p);

        Ponto<Double> p2 = new Ponto<>(2.2, 4.6);
        System.out.println(p);
    }
}
