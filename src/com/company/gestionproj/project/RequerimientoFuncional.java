package com.company.gestionproj.project;

public class RequerimientoFuncional extends Requerimiento{

    Double estimacion;  //> atributo del objeto el tiempo en que se finaliza el requerimiento
                        //> en horas

    public RequerimientoFuncional(String nombre, Proyecto proyecto, Double estimacion) {
        super(nombre, proyecto);
        this.estimacion = estimacion;
    }

    @Override
    public Double estimate() {
        return this.estimacion;
    }
}
