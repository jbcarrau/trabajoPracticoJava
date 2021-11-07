package com.company.gestionproj.team;
//package com.company.gestionproj.project;

import com.company.gestionproj.project.Proyecto;

public abstract class IntegranteXproyecto {
    private int HorasTrabajadas;

    public IntegranteXproyecto(){}

    public void sumaHoras(int h, Proyecto pr){
        this.HorasTrabajadas += h;
        System.out.println(HorasTrabajadas);
        exportaHoras(pr);//Todo: tiene que exportar las horas cuando haya sumando todas las horas trabajadas
    }

    public void exportaHoras(Proyecto pr) {
        pr.totalHs(HorasTrabajadas);
    }
}