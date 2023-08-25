package Aula01;

public class Professor {
    String nome;
    int totalDeAulas;
    double valorAula; 

    //metódo construtor
    public Professor(String nome, int totalDeAulas, double valorAula){
        this.totalDeAulas = totalDeAulas;
        this.nome = nome;
        this.valorAula = valorAula;
    }

    public double calcularSalario(){
        double salarioBase, horaAtividade, descanso;

        salarioBase = valorAula * totalDeAulas * 4.5;
        horaAtividade = salarioBase * 0.05;
        descanso = (salarioBase + horaAtividade) / 6;

        return (salarioBase + horaAtividade + descanso);
    }

    @Override
    public String toString(){
        return nome;
    }
}
