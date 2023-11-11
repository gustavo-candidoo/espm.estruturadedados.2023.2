public class Venda {
    private int id;
    private Funcionario funcionario;
    private double valor;

    // método para calcular e retornar o valor da comissao
    public double calcularComissao() {
        double comissao = 0;
        Cargo cargo = funcionario.getCargo();

        comissao = cargo.calcularComissao(valor);

        return comissao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
