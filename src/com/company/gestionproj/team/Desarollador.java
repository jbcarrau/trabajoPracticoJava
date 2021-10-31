package com.company.gestionproj.team;


import java.util.ArrayList;
import java.util.List;

public class Desarollador {
    List<String> lenguajes = new ArrayList<>();

    public Desarollador(String[] arr) {
        for(int i = 0 ; i < arr.length ; i ++){
            lenguajes.add(arr[i]);
        }
    }
}
