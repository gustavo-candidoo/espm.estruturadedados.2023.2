package Atividades.Atividade01;

public class Musica {
    String titulo;      
    String genero;
    Cantor cantor;
    int total;

    public Musica(String titulo, String genero, Cantor cantor, int total) {
        this.titulo = titulo;
        this.genero = genero;
        this.cantor = cantor;
        this.total = total;
    }

    public String toString(){
        return "Título: " +titulo+ ", Gênero: " +genero+ ", Cantor: " +cantor+ ", Total: " +total;
    }
}
