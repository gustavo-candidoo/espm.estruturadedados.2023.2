public class Lista {
    No inicio, fim;
    int tamanho;

    // método para inserir um elemento no final da lista
    public void inserir(int dado) {
        No aux = new No();
        aux.dado = dado;
        if(inicio == null) {
            inicio = aux;
        } else {
            fim.prox = aux;
        }
        fim = aux;
        tamanho++;
    }

    // método para imprimir os valores da lista
    public void imprimir() {
        No aux = inicio;
        while(aux != null) {
            System.out.println(aux.dado);
            aux = aux.prox;
        }
    }

    // método para colocar os elementos da lista em ordem crescente
    public void ordenar() {
        No aux = inicio;
        int temp;

        for(int j = 0; j <= tamanho; j++) {
            aux = inicio;
            for(int i = 1; i < tamanho; i++) {
                if(aux.dado > aux.prox.dado) {
                    temp = aux.dado;
                    aux.dado = aux.prox.dado;
                    aux.prox.dado = temp;
                }
                aux = aux.prox;
            }
        }

    }    

    // método para remover o primeiro elemento
    public void removerPrimeiro() {
        if(inicio != null) {
            No aux = inicio;
            inicio = aux.prox;
            aux.prox = null;
            aux = null;
            tamanho--;
        }
    }

    // método para concatenar duas listas --> exercício 1
    public Lista concatenar(Lista lista) {
        No aux = lista.inicio;
        while(aux != null) {
            this.inserir(aux.dado);
            aux = aux.prox;
        }
        return this;
    }

    // método para remover n elementos da lista --> exercício 4
    public boolean removerElementos(int n) {
        System.out.println("n = " + n + "\ntamanho = " + tamanho);
        if(n > tamanho) {
            return false;
        }
        for(int i = 1; i <= n; i++) {
            removerPrimeiro();
        }
        return true;
    }

    // método para gerar uma cópia da lista recebida por parâmetro --> exercício 5
    public Lista copiar() {
        Lista aux = this;
        return aux;
    }

    // método para inverter e retorna a lista --> exercicio 6
    // para resolver esse exercício eu criei o método inserirNoInicio
    public Lista inverter() {
        Lista listaInvertida = new Lista();
        No aux = inicio;
        for(int i = 1; i <= tamanho; i++) {
            listaInvertida.inserirInicio(aux.dado);
            aux = aux.prox;
        }
        return listaInvertida;
    }

    // método para inserir elementos no início da lista (será utilizado pelo método inverter)
    public void inserirInicio(int dado) {
        No aux = new No();
        aux.dado = dado;
        if(inicio == null) {
            fim = aux;
        } else {
            aux.prox = inicio;            
        }
        inicio = aux;
        tamanho++;
    }
}
