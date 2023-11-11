package ProjetoVinho;

import java.util.Stack;

import Pilha.Pilha;

public class Main {
    
    public static void main(String[] args) throws Exception{
        
        Stack<Vinho> pilha = new Stack<>();
        Stack<Vinho> aux = new Stack<>();
        
        //inserir
        pilha.push(new Vinho("Romanee Conti", 15000));
        pilha.push(new Vinho("Crose Hermitage", 500));
        pilha.push(new Vinho("Petrvs", 50000));
        pilha.push(new Vinho("Mouton", 50000));
        pilha.push(new Vinho("Alberone", 89));

        //imprimir os 3 vinhos mais antigos
        for(int i = pilha.size(); i > pilha.size() - 3; i--) {
            aux.push(pilha.pop());
        }

        //listar os vinhos da adega
        for(Vinho v : pilha) {
            System.out.println(v);
        }

        //retornar os vinhos para a adega
        while(!aux.isEmpty()) {
            pilha.push(aux.pop());
        }
    }

}
