package com.company.gestionproj.team;


import com.company.gestionproj.project.Proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desarollador extends Integrante {
    List<String> lenguajes = new ArrayList<>();
    private final Double horaBase = 5000.0;
    private Double valorTotal;
    private String categoria;

    public Desarollador(Proyecto proy, String nombre, String rol, int antiguedad, String categoria, String[] arr){
        super(proy, nombre, rol, antiguedad);
        this.categoria = categoria;
        /*Scanner sc = new Scanner(System.in);
        String[] arr= new String[20];
        int i = 0;
        String lang;
        System.out.println("Ingrese la Categoria de " + nombre);
        setCategoria(sc.next());
        System.out.println("Leguajes que domina: " + nombre + " (x para salir)");
        while(!(lang = sc.next()).equals("x")){
            arr[i] = lang;
            i++;
        }*/
        for(int i = 0 ; i < arr.length ; i ++){
            lenguajes.add(arr[i]);
        }
        //addLenguajes(arr);
    };

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {return categoria;}

    public void addLenguajes(String[] arr) {
        for(int i = 0 ; i < arr.length ; i ++){
            lenguajes.add(arr[i]);
        }
    }

    public List<String> getLenguajes() {
        return lenguajes;
    }

    public Double getValorTotal() {
        Double sum;
        sum = horaBase * (0.5*getAntiguedad()) ;
        if(getCategoria().toLowerCase().equals("senior")){sum = sum * 1.05;}
        valorTotal = sum*getHorasTrabajadas();
        return valorTotal;
    }
}
