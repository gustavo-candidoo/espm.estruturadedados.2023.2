public class ElementoArvore {

    private Funcionario funcionario;
    private Venda venda;

    

    public ElementoArvore(Funcionario funcionario, Venda venda) {
        this.funcionario = funcionario;
        this.venda = venda;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
}
