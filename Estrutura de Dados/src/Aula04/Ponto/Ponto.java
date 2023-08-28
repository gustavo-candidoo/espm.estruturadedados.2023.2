package Aula04.Ponto;

public class Ponto {
    int x; 
    int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " +x+ ", y = " +y;
    }
}


