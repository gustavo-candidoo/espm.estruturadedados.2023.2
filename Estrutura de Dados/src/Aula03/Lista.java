package Aula03;

public class Lista {
    No inicio, fim;
    int tamanho;

    // inserir um aluno no início da lista
    public void inserirInicio(int ra, String nome){
        No aux = new No();
        aux.nome = nome;
        aux.ra = ra;

        if(inicio == null){
            fim = aux;
        }
        else{
            aux.dir = inicio;
            inicio.esq = aux;
        }
        inicio = aux;
        tamanho++;

    }

    // inserir um aluno no final da lista

    //metódo para imprimir os elementos da lista
    public void imprimir() {
        No aux = inicio;

        while(aux != null){
            System.out.println(aux.nome + " " + " " + aux.ra);
            aux = aux.dir;
        }
    }
}
