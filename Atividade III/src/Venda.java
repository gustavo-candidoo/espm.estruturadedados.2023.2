public class Venda {

    private int id;
    private Funcionario funcionario;
    private double valor;
    
    public Venda(Funcionario funcionario, double valor) {
        this.funcionario = funcionario;
        this.valor = valor;
    }
    
    public double calcularComissao() {
        switch (funcionario.getCargo()) {
            case ATENDENTE:
                return valor * 0.10; 
            case VENDEDOR:
                return valor * 0.15 + 50; 
            case GERENTE:
                return valor * 0.20 + 100;
            default:
                return 0; 
        }
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
