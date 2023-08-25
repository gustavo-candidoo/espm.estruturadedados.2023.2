package Aula03;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.inserirInicio(12, "Gustavo");
        lista.inserirInicio(13, "Selmini");

        No aux = lista.pesquisar(12);
        if(aux != null) {
            System.out.println(aux.nome);
        }
        else {
            System.out.println("Aluno não encotrado");
        }
    }
}
