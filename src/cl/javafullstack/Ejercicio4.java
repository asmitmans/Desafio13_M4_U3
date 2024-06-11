package cl.javafullstack;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {
    public static void main(String[] args) {

        Queue juegos = new LinkedList();

        juegos.offer("Tombo");
        juegos.offer("Congelado");
        juegos.offer("Quemaditas");
        juegos.offer("Cachipún");
        juegos.offer("Pillarse");

        System.out.println("Cantidad de juegos en la lista: "+juegos.size());
        System.out.println(juegos);

    }
}
