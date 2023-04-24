package com.hedima.presentacion;

import java.util.ArrayList;
import java.util.List;

public class EjercicioLista {

    public static void main(String[] args) {

        List lista = new ArrayList();
        lista.add(7);
        lista.add(3.14);
        lista.add(false);
        lista.add("Buenos días");

        for (Object elemento: lista
             ) {
            System.out.println(elemento.toString());
        }

    }
}
