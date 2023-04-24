package com.hedima.presentacion;

import com.hedima.modelo.MenorEdad;
import com.hedima.modelo.Persona;

public class Main {
    public static void main(String[] args) {

        Persona p1= new Persona("Juan Lopez", 24);
        try {
            p1.comprobarEdad();
        } catch (MenorEdad e) {
            System.out.println(e.getMessage());
        }
    }
}