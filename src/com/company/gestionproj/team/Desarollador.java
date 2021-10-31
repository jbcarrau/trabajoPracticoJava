package com.company.gestionproj.team;


import java.util.ArrayList;
import java.util.List;

public class Desarrollador {
    List<String> lenguajes = new ArrayList<>();

    public Desarrollador(String[] arr) {
        for(int i = 0 ; i < arr.length ; i ++){
            lenguajes.add(arr[i]);
        }
    }
}
