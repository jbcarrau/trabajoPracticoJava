package com.company.gestionproj.project;

import java.util.ArrayList;
import java.util.List;

public class RequerimientoNoFuncional extends Requerimiento {

    Double costoFijo; //
    List<SubrequerimientosNF> listSubRNF = new ArrayList<>();

    public RequerimientoNoFuncional(String nombre, Proyecto proyecto) {
        super(nombre, proyecto);
    }

    @Override
    public Double estimate() {
        return 0D;
    }

    public void agregarSubRequerimientoNF( String nombre ) {
        SubrequerimientosNF subRNF = new SubrequerimientosNF(nombre, getProyecto() );
        this.listSubRNF.add(subRNF);
    }

    @Override
    public Double estimatePresupuesto() {
        return Double.valueOf(this.listSubRNF.size());
    }
}
