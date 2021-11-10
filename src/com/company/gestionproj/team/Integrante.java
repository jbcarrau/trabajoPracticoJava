package com.company.gestionproj.team;

import com.company.gestionproj.project.Proyecto;

import java.util.Scanner;


public class Integrante extends IntegranteXproyecto {

    private String Nombre;
    private String Rol;
    private int Antiguedad;

    public Integrante(Proyecto proy, String nombre, String rol, int antiguedad) {
        Nombre = nombre;
        Rol = rol;
        Antiguedad = antiguedad;
        rol = rol.toLowerCase();

        Scanner sc = new Scanner(System.in);

        switch(rol) {
            case "analista":
                Analista analist = new Analista();
                //System.out.println("Ingrese Antiguedad de " + nombre);
                //analist.setAntiguedad(sc.nextInt());
                //setTipo();
                break;
            case "tester":
                Tester test = new Tester();
                //setTipo();
                break;
            case "lider" :
                Lider lid = new Lider();
                break;
            case "desarrollador":
                Desarollador dev = new Desarollador();
                //setCategoria();
                break;
        }
        proy.addIntegranteProy(this);
    }

    public String getNombre(){
        return Nombre;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public String getRol() {
        return Rol;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "nombre='" + Nombre + "' Rol='" + Rol + "' Antiguedad='" + Antiguedad +
                '}';
    }
}
