package Exercício03;
public class No<T extends Comparable<T>> {
    private T dado;
    private No<T> esq;
    private No<T> dir;
    private No<T> pai;
    private int cor; // 0 para preto, 1 para vermelho

    public No(T dado) {
        this.dado = dado;
        this.cor = 1; // Por padrão, um novo nó é vermelho
    }

    // Métodos getters e setters para os atributos
    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getEsq() {
        return esq;
    }

    public void setEsq(No<T> esq) {
        this.esq = esq;
    }

    public No<T> getDir() {
        return dir;
    }

    public void setDir(No<T> dir) {
        this.dir = dir;
    }

    public No<T> getPai() {
        return pai;
    }

    public void setPai(No<T> pai) {
        this.pai = pai;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
}
