package Atividades.Atividade01;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> teste = new ArrayList<>();

        teste.add("Eu mesmo; 1197262");
        teste.add("Eu mesmooo; 11");
        teste.add("Eu mesmooo; 11262");

        int i;

        System.out.printf("Percorrendo o array \n");
        int n = teste.size();

        for(i = 0; i < n; i++) {
            System.out.println("Posição %d- %s-n", n, teste.get(i));
        }
    }
}
