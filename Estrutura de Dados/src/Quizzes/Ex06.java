package Quizzes;

public class Ex06 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        meuMetodo(a, b, c);
        System.out.println("B = " +b);
    }

    public static void meuMetodo(int a, int b, int c){
        int x = 0; 

        if(a + 2 > b - 3){
            x = c * 2; 
        }

        if(c / 4 < b * 3){
            x = x * 5;
        }

        if(x < a + b){
            c = a - b;
        }
        else{
            b = c * a;
        }
        x = a + b - c;
    }
}
