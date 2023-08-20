public class Ex09 {

     public static void main(String[] args) {

          int orig = 42;

          Ex09 x = new Ex09();

          int y = x.go(orig);

          System.out.print(orig+" "+y);

     }

 

     private int go(int arg) {

          arg = arg * 2;

          return arg;

     }

}

 