import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        
        Stack<Vinho> pilha = new Stack<>();
        Stack<Vinho> aux = new Stack<>();

        // inserir 
        pilha.push(new Vinho("Romaneé Conti", 15000));
        pilha.push(new Vinho("Crose Hermitage", 500));
        pilha.push(new Vinho("Petrus",50000));
        pilha.push(new Vinho("Mouton",50000));
        pilha.push(new Vinho("Alberone",89));

        // imprimir os 3 vinhos mais antigos
        for(int i = 1; i <= pilha.size() - 3; i++) {
            aux.push(pilha.pop());
        }
        
        // listar os vinhos da adega
        for(Vinho v : pilha) {
            System.out.println(v);
        }

        // retornar os vinhos para a adega
        while(!aux.isEmpty()) {
            pilha.push(aux.pop());
        }

    }
}
