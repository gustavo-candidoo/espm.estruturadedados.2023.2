public class Venda implements Comparable<Venda>{
    private int id;
    private Funcionario funcionario;
    private double valor;

    public Venda(int id, Funcionario funcionario, double valor) {
        this.id = id;
        this.funcionario = funcionario;
        this.valor = valor;
    }

    public Venda(int id){
        this.id = id;
    }

    public String toString() {
        return "ID: " + getId() + ", Funcionário: " + getFuncionario().getNome() + ", Valor: " + getValor();
    }


    @Override
    public int compareTo(Venda v){
        if(v.getId() == this.id)
            return 0;
        else if (v.getId() > this.getId())
            return -1;
        else{
            return 1;
        }
    }

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
