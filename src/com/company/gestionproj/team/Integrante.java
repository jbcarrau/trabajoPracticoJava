package com.company.gestionproj.team;

import com.company.gestionproj.project.Proyecto;

import java.util.ArrayList;
import java.util.List;


public class Integrante extends IntegranteXproyecto{

    private String Nombre;

    public Integrante(Proyecto proy, String nombre, String str, String tipo) {
        super(proy);
        Nombre = nombre;
        str.toLowerCase();
        System.out.println(str);
        switch(str) {
            case "analista":
                Analista analist = new Analista(tipo);
                break;
            case "tester":
                Tester test = new Tester(tipo);
                break;
            case "lider" :
                Lider lid = new Lider();
                break;
        }
    }

    public Integrante(Proyecto proy, String nombre, String[] arr) {
        super(proy);
        Nombre = nombre;
        Desarrollador dev = new Desarrollador(arr);
    }


    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + Nombre +
                '}';
    }
}
