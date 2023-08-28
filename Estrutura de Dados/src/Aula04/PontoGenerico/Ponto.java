package Aula04.PontoGenerico;

public class Ponto<T> {
    T x;
    T y; 

    public Ponto(T x, T y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " +x+ ", y = " +y;
    }
}
