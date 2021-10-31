package com.company.gestionproj.team;

package com.company.gestionproj.project;

public abstract class IntegranteXproyecto {
    private Double HorasTrabajadas;


    public IntegranteXproyecto(Proyecto proy) {
        proy.addIntegranteProy(this);
    }

//    public Double sumaHorasXintegrante(){
//
//
//    }
}


