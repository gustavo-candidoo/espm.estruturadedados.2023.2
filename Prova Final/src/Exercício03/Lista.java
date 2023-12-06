package Exercício03;
public class Lista<T extends Comparable<T>> {
    public No<T> raiz;

    public Lista() {
        this.raiz = null;
    }
   
    public void inserir(T dado) {
        raiz = inserirRecursivo(raiz, null, new No<>(dado));
        raiz.setCor(0); // A raiz sempre deve ser preta
    }

    private No<T> inserirRecursivo(No<T> raizAtual, No<T> pai, No<T> novoNo) {
        // Inserção como em uma árvore de busca binária comum
        if (raizAtual == null) {
            novoNo.setPai(pai);
            return novoNo;
        }

        if (novoNo.getDado().compareTo(raizAtual.getDado()) < 0) {
            raizAtual.setEsq(inserirRecursivo(raizAtual.getEsq(), raizAtual, novoNo));
        } else if (novoNo.getDado().compareTo(raizAtual.getDado()) > 0) {
            raizAtual.setDir(inserirRecursivo(raizAtual.getDir(), raizAtual, novoNo));
        } else {
            // Dados iguais não são permitidos, você pode tratar conforme sua necessidade
            return raizAtual;
        }

        // Verificar e corrigir as propriedades da árvore rubro-negra
        if (ehVermelho(raizAtual.getDir()) && !ehVermelho(raizAtual.getEsq())) {
            raizAtual = rotacaoEsquerda(raizAtual);
        }
        if (ehVermelho(raizAtual.getEsq()) && ehVermelho(raizAtual.getEsq().getEsq())) {
            raizAtual = rotacaoDireita(raizAtual);
        }
        if (ehVermelho(raizAtual.getEsq()) && ehVermelho(raizAtual.getDir())) {
            inverterCores(raizAtual);
        }

        return raizAtual;
    }

    private boolean ehVermelho(No<T> no) {
        return no != null && no.getCor() == 1;
    }

    private No<T> rotacaoEsquerda(No<T> h) {
        No<T> x = h.getDir();
        h.setDir(x.getEsq());
        x.setEsq(h);
        x.setCor(h.getCor());
        h.setCor(1);
        return x;
    }

    private No<T> rotacaoDireita(No<T> h) {
        No<T> x = h.getEsq();
        h.setEsq(x.getDir());
        x.setDir(h);
        x.setCor(h.getCor());
        h.setCor(1);
        return x;
    }

    private void inverterCores(No<T> h) {
        h.setCor(1 - h.getCor());
        h.getEsq().setCor(1 - h.getEsq().getCor());
        h.getDir().setCor(1 - h.getDir().getCor());
    }

    public void preOrdem() {
        preOrdem(raiz);
    }

    private void preOrdem(No<T> no) {
        if(no == null) return;
        System.out.print(no.getDado() + "  ");
        preOrdem(no.getEsq());
        preOrdem(no.getDir());
    }
}



