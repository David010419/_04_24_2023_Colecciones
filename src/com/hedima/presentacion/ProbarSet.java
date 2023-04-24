package com.hedima.presentacion;

import com.hedima.modelo.Persona;

import java.util.HashSet;
import java.util.Set;

public class ProbarSet {

    public static void main(String[] args) {

        //1, Definir un Set
        Set conjunto = new HashSet();
        //2, Añadir elementos
        conjunto.add("Hola Mundo");
        conjunto.add(5);
        conjunto.add(6.6);
        System.out.println(conjunto.add(new Persona("Ana",19)));
        System.out.println(conjunto.add("Hola Mundo"));
        System.out.println(conjunto);

        for (Object elemento: conjunto
        ){
            System.out.println(elemento.toString());
        }
    }
}
