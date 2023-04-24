package com.hedima.presentacion;

import java.util.HashSet;
import java.util.Set;

public class EjercicioSet {

    public static void main(String[] args) {

        //1 definir el set
        Set buenasNoches = new HashSet();
        //2 elementos
        buenasNoches.add("Buenas noches");
        buenasNoches.add(5);
        buenasNoches.add(8.5);
        buenasNoches.add(5);
        buenasNoches.add("Calificación");

        System.out.println(buenasNoches);

        for (Object elemento : buenasNoches
        ) {
            System.out.println(elemento.toString() + " es del tipo: " + elemento.getClass());
        }
    }
}
