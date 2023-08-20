package Quizzes;

public class Ex07 {

     private String nome;

     public Ex07(String nome) {

         this.nome = nome;

     }

     public static void main(String[] args) {

         Ex07 d1 = new Ex07("Boi");

         Ex07 d2 = new Ex07("Tyri");

         System.out.print((d1 == d2) + " ");

         Ex07 d3 = new Ex07("Boi");

         d2 = d1;

         System.out.print((d1 == d2) + " ");

         System.out.print((d1 == d3) + " ");

     }

}

