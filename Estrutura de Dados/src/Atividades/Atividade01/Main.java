package Atividades.Atividade01;

public class Main {
    public static void main(String[] args) {
        Cantor c = new Cantor("Gustavo", "Brasil");
        Musica m = new Musica("Capivaras Mutantes", "Gospel", c, 10);

        System.out.println(c);
        System.out.println(m);
    }
    
    
}
