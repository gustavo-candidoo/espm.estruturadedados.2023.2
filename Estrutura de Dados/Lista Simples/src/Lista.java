public class Lista {
    No inicio, fim;
    int tamanho; 

    // Metódo para inserir um elemento na lista
    public void inserir(int idade){
        No aux = new No(); 
        aux.idade = idade;

        // verifica se a lista está vazia
        if(inicio == null){
            inicio = aux;
        }
        else{
            fim.prox = aux;     
        }
        fim = aux;
        tamanho++;
    }

    //Método para imprimir os elementos da lista
    public void imprimir() {
        No aux = inicio;

        while(aux != null){
            System.out.println(aux.idade);
            aux = aux.prox;
        }
    }


    
}
