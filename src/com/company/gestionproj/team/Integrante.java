package com.company.gestionproj.team;

import com.company.gestionproj.project.Proyecto;


public class Integrante extends IntegranteXproyecto {

    private String Nombre;
    private String Rol;

    public Integrante(Proyecto proy, String nombre, String rol, String tipo) {
        Nombre = nombre;
        Rol = rol;
        rol.toLowerCase();
        switch(rol) {
            case "analista":
                Analista analist = new Analista(tipo);
                break;
            case "tester":
                Tester test = new Tester(tipo);
                break;
            case "lider" :
                Lider lid = new Lider();
                break;
            case "desarrollador":
                Desarollador dev = new Desarollador();
        }
        proy.addIntegranteProy(this);
    }

    public String getNombre(){
        return Nombre;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "nombre='" + Nombre + "' Rol='" + Rol +
                '}';
    }
}
