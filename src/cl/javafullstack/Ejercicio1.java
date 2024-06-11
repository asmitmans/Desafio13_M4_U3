package cl.javafullstack;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<String> marcas = new ArrayList<>();

        marcas.add("Ladeco");
        marcas.add("Hit 40");
        marcas.add("Banco de Santiago");
        marcas.add("Alamac");
        marcas.add("Ekono");
        marcas.add("Metrópolis");
        marcas.add("Nextel");
        marcas.add("Feria Mix");
        marcas.add("Machasa");
        marcas.add("Salo");
        System.out.println(marcas);

        marcas.add("Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");
        System.out.println(marcas);

        marcas.set(marcas.indexOf("Blokbaster"),"Blockbuster");
        System.out.println(marcas);

        if(marcas.remove("Carrefour")) {
            System.out.println("Carrefour fue eliminado de manera correcta");
        } else {
            System.out.println("No se pudo borrar Carrefour del listado");
        }
        System.out.println(marcas);

        ArrayList<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("Compaq");
        posiblesMarcas.add("Palm");
        marcas.addAll(posiblesMarcas);

        System.out.println(marcas);
        System.out.println("Cantidad de elementos en el listado: " + marcas.size());

    }
}
