/* 1. Se listarmos todos os números naturais abaixo de 10 que são múltiplos de 3 e 5, nós obtemos 3,
5, 6 e 9. A soma desses valores é 23. Escreva um programa em Java que encontre a soma de
todos os múltiplos de 3 e 5 abaixo de 1000. (resposta = 233168).  */

package Exercícios.Lista;

public class Ex01{
    public static void main(String[] args) {
        int soma = 0;
        for(int i = 1; i < 1000; i++){
            if(i % 5 == 0 || i % 3 == 0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}

