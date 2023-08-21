package Exercícios.Lista;

public class Ex03 {
    public static void main(String[] args) {
        int n = 12;
        int qtdDivisor = 0;
        boolean isPrime = false;
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                qtdDivisor++;
            }
        }

        if(qtdDivisor == 2){
            isPrime = true;
        }

    }
}

