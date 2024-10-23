package Ejercicio1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CargarNotas {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        boolean salirAl = true;
        boolean salirNot;
        do {
            Alumno alumno = new Alumno();
            System.out.println("INGRESE DATOS DEL ALUMNO");
            do {
                System.out.println("INGRESE NOMBRE COMPLETO");
                alumno.setNombreCompleto(sc.nextLine());
                System.out.println("INGRESE LEGAJO");
                alumno.setLegajo(sc.nextLong());
                sc.nextLine();
                if (alumno.getNombreCompleto().isEmpty() || alumno.getLegajo()<=0){
                    System.out.println("ERROR uno o más datos mal ingresados");
                }
            }while (alumno.getNombreCompleto().isEmpty() || alumno.getLegajo()<=0);
            do {
                Nota nota = new Nota();
                do {
                    System.out.print("INGRESE NOMBRE CATEDRA: ");
                    nota.setCatedra(sc.nextLine());
                    System.out.print("Nota: ");
                    nota.setNotaExamen(sc.nextDouble());
                    sc.nextLine();
                    if(nota.getCatedra().isEmpty() || nota.getNotaExamen()<=0){
                        System.out.println("ERROR uno o mas valores incorrectos!");
                    }else {
                        alumno.setNotas(nota);
                    }
                }while (nota.getCatedra().isEmpty() || nota.getNotaExamen()<=0);
                System.out.println("DESEA CARGAR OTRA NOTA?");
                System.out.println("SI O NO");
                String salirNota = sc.nextLine();
                if(salirNota.toLowerCase().equals("no")){
                    salirNot = false;
                }else {
                    salirNot = true;
                }

            } while (salirNot);
            alumnos.add(alumno);
            System.out.println("DESEA CARGAR OTRO ALUMNO?");
            System.out.println("SI O NO");
            String salirAlumno = sc.nextLine();
            if (salirAlumno.toLowerCase().equals("no")) {
                salirAl = false;
            }
        } while (salirAl);
        for(Alumno alumno:alumnos){
            System.out.println("---------------------------");
            System.out.println("        Datos Alumno       ");
            System.out.println("---------------------------");
            System.out.println("Nombre: "+alumno.getNombreCompleto());
            System.out.println("Legano: "+alumno.getLegajo());
            for(Nota nota:alumno.getNotas()){
                System.out.println("---------------------------");
                System.out.println("Catedra: "+nota.getCatedra());
                System.out.println("Nota: "+nota.getNotaExamen());
                System.out.println("---------------------------");
            }
            Alumno.promedioNotas(alumno);

        };

    }
}