package cl.javafullstack;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {
    public static void main(String[] args) {

        Map<String,Integer> golosinas = new TreeMap<>();

        golosinas.put("Chocman", 100);
        golosinas.put("Trululú", 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-miti", 30);
        golosinas.put("Traga Traga", 150);
        golosinas.put("Tabletón", 5);

        for(Map.Entry<String, Integer> golsina : golosinas.entrySet()) {
            if (golsina.getValue() < 100) {
                System.out.println(golsina.getKey());
            }
        }

    }
}
