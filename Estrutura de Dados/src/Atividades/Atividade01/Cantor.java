package Atividades.Atividade01;

public class Cantor {
    String nome;
    String nacionalidade;

    public Cantor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString(){
        return "Nome: " +nome+ ", Nacionalidade: " +nacionalidade;
    }
}
