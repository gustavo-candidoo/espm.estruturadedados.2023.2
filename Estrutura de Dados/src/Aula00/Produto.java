package Aula00;

public class Produto{
    //atributos ou propriedades
    //variável de instância
    int codigo;
    String nome;
    double preco;

    //metódo  para imprimir os dados
    public void imprimir(){
        System.out.println(codigo);
        System.out.println(nome);
        System.out.println(preco);
    }

    public static void main(String[] args) {
        Produto p = new Produto();
        System.out.println(p);
        p.codigo = 12;
        p.nome = "arroz";
        p.preco = 5.60;

        System.out.println(p.codigo);
        System.out.println(p.nome);
        System.out.println(p.preco);

        p.imprimir();

    }
}
