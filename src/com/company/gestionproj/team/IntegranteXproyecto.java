package com.company.gestionproj.team;
//package com.company.gestionproj.project;

import com.company.gestionproj.project.Proyecto;

public abstract class IntegranteXproyecto {
    private Double HorasTrabajadas;

    public IntegranteXproyecto(){}

    public void registraHoras(Double h){
        HorasTrabajadas = h;
    }

    public Double getHorasTrabajadas() {
        return HorasTrabajadas;
    }
}