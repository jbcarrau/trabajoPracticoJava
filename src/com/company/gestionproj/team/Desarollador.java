package com.company.gestionproj.team;


import java.util.ArrayList;
import java.util.List;

public class Desarollador {
    List<String> lenguajes = new ArrayList<>();
    private Double valorHora;
    private int antiguedad;
    String categoria;

    public Desarollador(){}

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //todo : ver como pasar los lenguajes a cada desarrollador
//    public Desarollador(String[] arr) {
//        for(int i = 0 ; i < arr.length ; i ++){
//            lenguajes.add(arr[i]);
//        }
//    }
}
