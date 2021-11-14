package com.company;

import com.company.gestionproj.exception.RequerimientoYaTieneProyecto;
import com.company.gestionproj.project.Proyecto;
import com.company.gestionproj.project.Requerimiento;
import com.company.gestionproj.project.RequerimientoFuncional;
import com.company.gestionproj.project.RequerimientoNoFuncional;
import com.company.gestionproj.team.Integrante;
import com.company.gestionproj.ReadFile;
import com.company.gestionproj.team.IntegranteXproyecto;

import java.io.IOException;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws IOException, RequerimientoYaTieneProyecto {

        //LECTURA DESDE TXT / CREACION DE PROYECTOS CON SUS REQUERIMIENTOS E INTEGRANTES
        ReadFile rf = new ReadFile();
        Proyecto projA = (Proyecto)rf.readProyect("ProyectoA.txt");
        Proyecto projB = (Proyecto)rf.readProyect("ProyectoB.txt");

        //INGRESO DE HORAS POR INTEGRANTE
        System.out.println("Ingrese horas por Integrante: ");
        projB.registraHoras();
        System.out.println("Ingrese horas por Integrante: ");
        projA.registraHoras();

        //MUESTRA PROYECTOS
        System.out.println(projA);
        projA.muestraRequerimientos();
        projA.muestraIntegrantes();
        System.out.println("Total de horas: " + projA.getTotalHs());
        projA.calculaPresOriginal();
        System.out.println("Presupuesto Estimado: " + projA.getPresupuesto());
        System.out.println("Presupuesto Real: " + projA.getPresupuestoReal());

        System.out.println("---------------------------------------------------------------");

        System.out.println(projB);
        projB.muestraRequerimientos();
        projB.muestraIntegrantes();
        System.out.println("Total de horas: " + projB.getTotalHs());
        projB.calculaPresOriginal();
        System.out.println("Presupuesto Estimado: " + projB.getPresupuesto());
        System.out.println("Presupuesto Real: " + projB.getPresupuestoReal());

    }
/*
    public static void main(String[] args) {
        try {
            Proyecto proj = new Proyecto("GestionProyectos", 30000D);
            Proyecto proj1 = new Proyecto("GestionJoaq1", 38000D);
            Proyecto proj2 = new Proyecto("GestionProyectos2", 60000D);

            Requerimiento req1 = new RequerimientoFuncional("CU1", proj, 3.1);
            Requerimiento req2 = new RequerimientoFuncional("CU2", proj, 5.5);
            Requerimiento req3 = new RequerimientoFuncional("CU3", proj, 2.4);

            RequerimientoNoFuncional reqNo1 = new RequerimientoNoFuncional("CUNF1", proj);
            RequerimientoNoFuncional reqNo2 = new RequerimientoNoFuncional("CUNF2", proj2);
            Requerimiento reqNo3 = new RequerimientoNoFuncional("CUNF3", proj1);

            reqNo1.agregarSubRequerimientoNF("CUNF1_A");
            reqNo1.agregarSubRequerimientoNF("CUNF1_B");
            reqNo1.agregarSubRequerimientoNF("CUNF1_C");

            reqNo2.agregarSubRequerimientoNF("CUNF1_A");
            reqNo2.agregarSubRequerimientoNF("CUNF1_B");


            Requerimiento req11 = new RequerimientoFuncional("CU11", proj1, 3.1);
            Requerimiento req21 = new RequerimientoFuncional("CU21", proj1, 3.1);

            List<Proyecto> proyectos = List.of(proj, proj1);

            System.out.println(proyectos);

            proj.addRequerimiento(req11); // Pone a prueba la exception requerimientoYaTiene...

            System.out.println(proyectos);

        } catch (RequerimientoYaTieneProyecto e) {
            e.printStackTrace();
        }

    }
*/
}
