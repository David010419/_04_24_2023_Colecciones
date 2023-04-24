package com.hedima.presentacion;

import java.util.ArrayList;
import java.util.List;

public class ProbarList {

    public static void main(String[] args) {
        //1, Definir List
        List lista = new ArrayList();
        System.out.println("La lista está vacía ->" + lista.isEmpty());
        //2 Añadir elementos
        lista.add("Hola");
        lista.add(5);
        lista.add(3.15);
        lista.add("Hola");
        lista.add(true);

        System.out.println(lista);
        System.out.println("...Recorrer la lista...");
        //Recorrer la lista
        for (Object elemento: lista
             ) {
            System.out.println(elemento.toString());
        }

        System.out.println("La lista está vacía ->" + lista.isEmpty());
        System.out.println("La lista contiene el elemento Hola ->" + lista.contains("Hola"));
        System.out.println("La lista contiene el elemento Buenos ->" + lista.contains("Buenos"));
        System.out.println("Dame el índice del elemento Hola-> " + lista.indexOf("Hola"));
        System.out.println("Dame el índice del último Hola-> " + lista.lastIndexOf("Hola"));

        System.out.println("Obtener el elemento por posición la 3 ->"+ lista.get(3));
        System.out.println(lista.set(3, "Buenos días"));
        System.out.println(lista);
        System.out.println("Elementos de la lista ->"+ lista.size());

    }
}
