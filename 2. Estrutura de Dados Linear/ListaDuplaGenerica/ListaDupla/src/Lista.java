public class Lista<T> {
    No<T> inicio;
    No<T> fim;
    int tamanho;

    // método para inserir um elemento no início da lista
    public void inserirInicio(T dado) {
        No<T> aux = new No<>(dado);

        if(inicio == null) {
            fim = aux;
        } else {
            aux.dir = inicio;
            inicio.esq = aux;
        }
        inicio = aux;
        tamanho++;
    }

    // método para inserir um elemento no final da lista
    /*public void inserirFinal(int ra, String nome) {
        No aux = new No();
        aux.ra = ra;
        aux.nome = nome;

        if(inicio == null) {
            inicio = aux;
        } else {
            aux.esq = fim;
            fim.dir = aux;
        }
        fim = aux;
        tamanho++;

    }*/

    // método para imprimir os elementos da lista
    public void imprimir() {
        No<T> aux = inicio;
        while(aux != null) {
            System.out.println(aux.dado);
            aux = aux.dir;
        }        
    }

    // método para pesquisar um elemento e retornar endereco do objeto
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
    
    // método para remover um elemento da lista
    public void remover(T dado) {
        No<T> aux = pesquisar(dado);
        if(aux == null) {
            return;
        }

        if(tamanho == 1) {
            inicio = null;
            fim = null;
            aux = null;
        }
        else if(aux == inicio) {
            inicio = aux.dir;
            inicio.esq = null;
            aux.dir = null;
            aux = null;
        }
        else if(aux == fim) {
            fim = aux.esq;
            fim.dir = null;
            aux.esq = null;
            aux = null;
        }
        else {
            aux.esq.dir = aux.dir;
            aux.dir.esq = aux.esq;
            aux.dir = null;
            aux.esq = null;
            aux = null;
        }
        tamanho--;

    }
}
