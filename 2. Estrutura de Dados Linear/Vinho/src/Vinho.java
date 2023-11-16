public class Vinho {
    private String produtor;
    private double valor;
    
    public Vinho(String produtor, double valor) {
        this.produtor = produtor;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Vinho [produtor=" + produtor + ", valor=" + valor + "]";
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}