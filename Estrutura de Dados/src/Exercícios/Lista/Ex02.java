/* 2. Cada novo termo na sequência de Fibonacci é gerado adicionando os dois termos anteriores. Ao
começar com 1 e 2, os 10 primeiros termos serão: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, .... Considerando
os termos da sequência de Fibonacci cujos valores não excedem quatro milhões, escreva um
programa em Java que encontre a soma dos termos de valor par. (resposta = 4613732). */

package Exercícios.Lista;

public class Ex02 {
    public static void main(String[] args) {
        int limite = 4000000;
        int a = 1; 
        int b = 2;
        int soma = 0;

        while(a <= limite){
            if(a % 2 == 0){
                soma += a;
            }

            int proxTermo = a + b;
            a = b;
            b = proxTermo;  
        }

        System.out.println(soma);

    }
    
}
