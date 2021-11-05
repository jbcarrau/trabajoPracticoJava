package com.company.gestionproj;

import com.company.gestionproj.exception.RequerimientoYaTieneProyecto;
import com.company.gestionproj.project.Proyecto;
import com.company.gestionproj.project.RequerimientoFuncional;
import com.company.gestionproj.project.RequerimientoNoFuncional;
import com.company.gestionproj.team.Integrante;
import com.company.gestionproj.team.IntegranteXproyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    String nombre, cad, funcion, tipo;
    Double presu, estimacion;

    public Object readProyect(String archivo) throws FileNotFoundException, RequerimientoYaTieneProyecto {

        Scanner scanner = new Scanner(new File(archivo));

        Proyecto proj = null;
        RequerimientoFuncional reqF = null;
        RequerimientoNoFuncional reqNF = null;
        Integrante in = null;

        while (scanner.hasNextLine()) {
            cad = scanner.nextLine().toLowerCase();
            switch (cad) {
                case "proyecto":
//                    if (proj != null) {
//                        System.out.println(proj);
//                        proj.muestraRequerimientos();
//                        proj.muestraIntegrantes();
//                    }
                    nombre = scanner.nextLine();
                    presu = Double.parseDouble(scanner.nextLine());
                    proj = new Proyecto(nombre, presu);
                    break;
                case "requerimiento funcional":
                    nombre = scanner.nextLine();
                    estimacion = Double.parseDouble(scanner.nextLine());
                    reqF = new RequerimientoFuncional(nombre, proj, estimacion);
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
                    //in.registraHoras(30.0);
                    break;
            }
        }
//        System.out.println(proj);
//        proj.muestraRequerimientos();
//        proj.muestraIntegrantes();
        scanner.close();
        return proj;
    }
    public void readHs(String archivo){

    }
}


