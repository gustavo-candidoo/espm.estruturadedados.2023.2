import java.util.Collection;

public class Funcionario implements Comparable<Funcionario>{
    private int id;
    private String nome;
    private double salario;
    Cargo cargo;


    @Override
    public String toString() {
        return "ID: " + getId() + ", Nome: " + getNome() + ", Salário: " + getSalario() + ", Cargo: " + getCargo();
    }

    @Override
    public int compareTo(Funcionario f){
        if(f.getId() == this.id)
            return 0;
        else if (f.getId() > this.getId())
            return -1;
        else{
            return 1;
        }
    }

    public Funcionario(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Cargo getCargo() {
        return cargo;
    }
    public Funcionario(int id, String nome, double salario, Cargo cargo) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Collection<Funcionario> getVendas() {
        return null;
    }
    
}
