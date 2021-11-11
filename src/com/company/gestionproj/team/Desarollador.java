package com.company.gestionproj.team;


import java.util.ArrayList;
import java.util.List;

public class Desarollador extends IntegranteXproyecto {
    List<String> lenguajes = new ArrayList<>();
    private final Double horaBase = 5000.0;
    private Double valorHora;
    private int antiguedad;
    String categoria;

    public Desarollador(){}

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {return antiguedad;}

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void addLenguajes(String[] arr) {
        for(int i = 0 ; i < arr.length ; i ++){
            lenguajes.add(arr[i]);
        }
    }

    public List<String> getLenguajes() {
        return lenguajes;
    }

    public void setValorHora() {
        valorHora = getHorasTrabajadas() * (0.5*getAntiguedad()) ;
        System.out.println(getHorasTrabajadas());
        //this.valorHora = valorHora;
    }
}
