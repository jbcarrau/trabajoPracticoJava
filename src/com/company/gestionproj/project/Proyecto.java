package com.company.gestionproj.project;

import com.company.gestionproj.team.IntegranteXproyecto;
import com.company.gestionproj.team.Integrante;
import com.company.gestionproj.exception.RequerimientoYaTieneProyecto;
import com.company.gestionproj.tiempo.Estimable;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Proyecto implements Estimable {
    List<Requerimiento> requerimientos = new ArrayList<>();
    List<Integrante> integrantes = new ArrayList<Integrante>();


    String nombre;
    private Double presupuesto;

    public Proyecto(String nombre, Double presu) { //Discriminar presupuesto por Area
        this.nombre = nombre;
    }

    @Override
    public Double estimate() {
        Double total = 0D;//es un double
        Iterator<Requerimiento> it = requerimientos.iterator();
        while(it.hasNext()){
            total += it.next().estimate();
        }
        return total;
    }

    public void muestraRequerimientos() {
        Iterator<Requerimiento> it = requerimientos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());;
        }
    };
    public void muestraIntegrantes(){
        Iterator<Integrante> it = integrantes.iterator();
        while(it.hasNext()){
            System.out.println(it.next());;
        }
    };

    @Override
    public Double estimatePresupuesto(){ //
        return null;
    };

    public List<Requerimiento> getRequerimientos() {
        return requerimientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void addRequerimiento(Requerimiento req) throws RequerimientoYaTieneProyecto {

        //Validar el requerimiento que llega como parametro, si esta en un proyecto.
        if( req.getProyecto() != null ) {
            throw new RequerimientoYaTieneProyecto( req );
        }
        //Si el requerimiento no tiene proyecto, asignarlo
        req.setProyecto(this);

        this.requerimientos.add(req);

    }

    public boolean verificaSiExiste(Requerimiento req){
        Iterator<Requerimiento> it = requerimientos.iterator();
        while(it.hasNext()) {
            if (it.next().getNombre() != req.getNombre()) {
                return true;
            }
            else{return false;}
        }
        return false;
    }

    public void addIntegranteProy(Integrante nuevo){
        integrantes.add(nuevo);
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                "tiempo='" + this.estimate() + '\'' +
                '}';
    }
}
