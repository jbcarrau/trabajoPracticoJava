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
                System.out.println("Ingrese tipo de Analista de " + nombre);
                analist.setTipo(sc.next());
                //setear el valor de la hora
                break;
            case "tester":
                Tester test = new Tester();
                System.out.println("Ingrese tipo de Tester de " + nombre);
                test.setTipo(sc.next());
                //setear el valor de la hora
                break;
            case "lider" :
                Lider lid = new Lider();
                //setear el valor de la hora
                break;
            case "desarrollador":
                Desarollador dev = new Desarollador();
                String[] arr= new String[20];
                int i = 0;
                String lang;
                System.out.println("Ingrese la Categoria de " + nombre);
                dev.setCategoria(sc.next());
                System.out.println("Leguajes que domina: " + nombre);
                while(!(lang = sc.next()).equals("x")){
                    arr[i] = lang;
                    i++;
                }
                dev.addLenguajes(arr);
                //setear el valor de la hora
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
                "Tipo='" +
                '}';
    }
}
