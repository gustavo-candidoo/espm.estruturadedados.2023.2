import java.util.UUID;

public class Funcionario {
    

    private UUID id;
    private String nome;
    private double salario;
    private Cargo cargo;

    public enum Cargo {ATENDENTE, VENDEDOR, GERENTE}

    
    public Funcionario(String nome, double salario, Cargo cargo) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
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

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }


    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    };

    
    


}
