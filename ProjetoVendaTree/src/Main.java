public class Main {
    public static void main(String[] args) {
        // Criar uma instância da árvore AVL para números inteiros
        AVLTree<Integer> arvore = new AVLTree<>();

        // Inserir elementos na árvore
        arvore.inserir(19);
        arvore.inserir(6);
        arvore.inserir(7);
        arvore.inserir(6);
        arvore.inserir(4);

        // Exibir a árvore em pré-ordem
        System.out.println("Árvore AVL em pré-ordem:");
        System.out.println(arvore.preOrdem());

        // Remover um elemento da árvore
        arvore.remover(19);

        // Exibir a árvore após a remoção em pré-ordem
        System.out.println("Árvore AVL após remoção em pré-ordem:");
        System.out.println(arvore.preOrdem());
    }
}
