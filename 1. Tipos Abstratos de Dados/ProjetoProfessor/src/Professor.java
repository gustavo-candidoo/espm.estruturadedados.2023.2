public class Professor {
    String nome;
    int totalDeAulas;
    double valorAula;
    
    // método construtor
    public Professor(String nome, int totalDeAulas, double valorAula) {
        this.totalDeAulas = totalDeAulas;
        this.nome = nome;
        this.valorAula = valorAula;
    }

    public double calcularSalario() {
        double salarioBase;
        double horaAtividade;
        double descanso;

        salarioBase = valorAula * totalDeAulas * 4.5;
        horaAtividade = salarioBase * 5 / 100;
        descanso = (salarioBase + horaAtividade) / 6;

        return (salarioBase + horaAtividade + descanso);

    }
      
}
