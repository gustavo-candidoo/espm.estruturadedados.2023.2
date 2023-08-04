import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int x;

        System.out.println("Informe um valor: ");
        x = teclado.nextInt();

        if(x % 2 == 0){
            System.out.println("Par");
        }
        else{
            System.out.println("Ímpar");
        }

    }
}
