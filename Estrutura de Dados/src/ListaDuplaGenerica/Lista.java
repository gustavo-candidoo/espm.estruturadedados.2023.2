package ListaDuplaGenerica;

public class Lista<T> {
    No<T> inicio;
    No<T> fim;
    int tamanho;

    // inserir um aluno no início da lista
    public void inserirInicio(T dado){
        No<T> aux = new No<>(dado);

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
    public void inserirFinal(int ra, String nome) {

    }

    // metódo para imprimir os elementos da lista
    public void imprimir() {
        No<T> aux = inicio;
        while(aux != null){
            System.out.println(aux.dado);
            aux = aux.dir;
        }
    }

    // metódo para pesquisar um elemento e retornar endereco do objeto
    public No<T> pesquisar(T dado) {
        No<T> aux = inicio;
        while(aux != null) {
            if(aux.dado == dado) {
                return aux;
            }
            aux = aux.dir;
        }
        return null;
    }
}
