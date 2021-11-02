package com.company;

import com.company.gestionproj.exception.RequerimientoYaTieneProyecto;
import com.company.gestionproj.project.Proyecto;
import com.company.gestionproj.project.Requerimiento;
import com.company.gestionproj.project.RequerimientoFuncional;
import com.company.gestionproj.project.RequerimientoNoFuncional;

import com.company.gestionproj.team.IntegranteXproyecto;
import com.company.gestionproj.team.Integrante;

import java.io.IOException;
import java.io.FileNotFoundException;

//import java.util.List;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

    public static Object readFile(String archivo) throws FileNotFoundException {
        String nombre, cad, funcion, tipo;
        Double presu, estimacion;

        Scanner scanner = new Scanner(new File(archivo));

        Proyecto proj = null;
        RequerimientoFuncional reqF = null;
        RequerimientoNoFuncional reqNF = null;
        Integrante in = null;

        while (scanner.hasNextLine()) {
            cad = scanner.nextLine().toLowerCase() ;
            switch(cad){
                case "proyecto":
                    if(proj!=null){System.out.println(proj);
                        proj.muestraRequerimientos();
                        proj.muestraIntegrantes();
                    };
                    nombre = scanner.nextLine();
                    presu = Double.parseDouble(scanner.nextLine());
                    proj = new Proyecto(nombre, presu);
                    break;
                case "requerimiento funcional":
                    nombre = scanner.nextLine();
                    estimacion = Double.parseDouble(scanner.nextLine());
                    reqF = new RequerimientoFuncional(nombre, proj, estimacion);
                    //System.out.println(req);
                    break;
                case "requerimiento no funcional":
                    nombre = scanner.nextLine();
                    reqNF = new RequerimientoNoFuncional(nombre, proj);
                    break;
                case "subrequerimiento":
                    nombre = scanner.nextLine();
                    reqNF.agregarSubRequerimientoNF(nombre);
                    break;
                case "integrante":
                    nombre = scanner.nextLine();
                    funcion = scanner.nextLine();
                    tipo = scanner.nextLine();
                    in = new Integrante(proj, nombre, funcion, tipo);
                    break;
            }
        }
        System.out.println(proj);
        proj.muestraRequerimientos();
        proj.muestraIntegrantes();
        scanner.close();
        return proj;
    };

    public static void main(String[] args) throws IOException, RequerimientoYaTieneProyecto {
        //BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
        String archivo = "NuevoProyecto.txt";

        Proyecto proj = (Proyecto)readFile(archivo); //todo : Si muestra todo en readFile, no hace falta que retorne un objeto


//        String[] arr= new String[]{"Python", "JavaScript"};
//        IntegranteXproyecto in1 = new Integrante(proj, "pepe", arr);
//        IntegranteXproyecto in2 = new Integrante(proj,"Benja", "Analista", "Funcional");
//        IntegranteXproyecto in3 = new Integrante(proj,"dwight", "Tester", "Dominio");
//        IntegranteXproyecto in4 = new Integrante(proj,"Micheal", "Lider", "Dominio");

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
