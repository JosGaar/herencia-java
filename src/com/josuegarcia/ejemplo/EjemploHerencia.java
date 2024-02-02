package com.josuegarcia.ejemplo;

import com.josuegarcia.pooherencia.Alumno;
import com.josuegarcia.pooherencia.AlumnoInternacional;
import com.josuegarcia.pooherencia.Persona;
import com.josuegarcia.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("=== Creando la instancia de la clase Alumno ===");
        Alumno alumno = new Alumno();
        alumno.setNombre("Josue");
        alumno.setApellido("Garcia");
        alumno.setColegio("Instituto Nacional");
        alumno.setNotaLenguaje(5.5);
        alumno.setNotaHistoria(10);
        alumno.setNotaMatematica(4.9);

        System.out.println("\n=== Creando la instancia de la clase AlumnoInternacional ===");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setColegio("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaLenguaje(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        System.out.println("\n=== Creando la instancia de la clase Profesor ===");
        Profesor profesor = new Profesor();
        profesor.setNombre("Lucy");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matemáticas");

        System.out.println("\n=== // ===");
        System.out.println("Alumno: "
                + alumno.getNombre() + " "
                + alumno.getApellido() + " "
                + alumno.getColegio());
        System.out.println("Profesor: "
                + profesor.getAsignatura() + " "
                + profesor.getNombre());

        System.out.println("Alumno internacional "
                + alumnoInt.getNombre() + " "
                + alumnoInt.getApellido());

        System.out.println();

        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }

    }
}
