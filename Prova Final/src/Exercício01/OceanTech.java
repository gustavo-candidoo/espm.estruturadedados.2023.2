package Exercício01;

import java.util.Scanner;

public class OceanTech {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de plataformas: ");
        int nPlataformas = scanner.nextInt();

        int[][] custo = new int[nPlataformas][nPlataformas];

        for (int i = 0; i < nPlataformas; i++) {
            for (int j = 0; j < nPlataformas; j++) {
                System.out.print("Digite o custo de transporte entre a plataforma " + (i+1) + " e a plataforma " + (j+1));
                custo[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite a plataforma de origem (1 a " + nPlataformas + "): ");
        int plataformaOrigem = scanner.nextInt();
        System.out.print("Digite a plataforma de destino (1 a " + nPlataformas + "): ");
        int plataformaDestino = scanner.nextInt();

        int menorCusto = calcularMenorCusto(custo, plataformaOrigem - 1, plataformaDestino - 1);
        System.out.println("O menor custo total entre as plataformas é: " + menorCusto);

        
        scanner.close();
    }

    private static int calcularMenorCusto(int[][] custosTransporte, int origem, int destino) {
        int[] custoMinimo = new int[custosTransporte.length];
        boolean[] visitado = new boolean[custosTransporte.length];

        for (int i = 0; i < custosTransporte.length; i++) {
            custoMinimo[i] = Integer.MAX_VALUE;
            visitado[i] = false;
        }

        custoMinimo[origem] = 0;

        for (int i = 0; i < custosTransporte.length - 1; i++) {
            int indiceMinimo = encontrarIndiceMinimo(custoMinimo, visitado);
            visitado[indiceMinimo] = true;

            for (int j = 0; j < custosTransporte.length; j++) {
                if (!visitado[j] && custosTransporte[indiceMinimo][j] != 0 && custoMinimo[indiceMinimo] != Integer.MAX_VALUE
                        && custoMinimo[indiceMinimo] + custosTransporte[indiceMinimo][j] < custoMinimo[j]) {
                    custoMinimo[j] = custoMinimo[indiceMinimo] + custosTransporte[indiceMinimo][j];
                }
            }
        }

        return custoMinimo[destino];
    }

    private static int encontrarIndiceMinimo(int[] custoMinimo, boolean[] visitado) {
        int minimo = Integer.MAX_VALUE;
        int indiceMinimo = -1;

        for (int i = 0; i < custoMinimo.length; i++) {
            if (!visitado[i] && custoMinimo[i] < minimo) {
                minimo = custoMinimo[i];
                indiceMinimo = i;
            }
        }

        return indiceMinimo;
    }
}
