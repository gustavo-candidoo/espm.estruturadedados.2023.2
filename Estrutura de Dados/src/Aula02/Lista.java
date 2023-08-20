package Aula02;

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

    //Método para colocar os elementos da lista em ordem crescente
    public void ordenar() {
        No aux = inicio;
        int temp;

        for(int j = 0; j <= tamanho; j++){
            aux = inicio;
            for(int i = 1; i < tamanho; i++){
                if(aux.idade > aux.prox.idade) {
                    temp = aux.idade;
                    aux.idade = aux.prox.idade;
                    aux.prox.idade = temp;
                }
                aux = aux.prox;
            }
        }
       
    }

    public void removerPrimeiro(){
        if(inicio != null){
            No aux = inicio;
            inicio = aux.prox;
            aux.prox = null;
            aux = null;
            tamanho--;
        }
    }

    
}