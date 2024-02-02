package com.josuegarcia.ejemplo;

import com.josuegarcia.pooherencia.Alumno;
import com.josuegarcia.pooherencia.AlumnoInternacional;
import com.josuegarcia.pooherencia.Persona;
import com.josuegarcia.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Josue", "Garcia", 18, "Instituto Nacional");
        alumno.setNotaLenguaje(5.5);
        alumno.setNotaHistoria(10);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("noreply@gmail.com");

        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setColegio("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaLenguaje(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("noreply@gmail.com");

        Profesor profesor = new Profesor("Lucy", "Perez", "Matemáticas");
        profesor.setEdad(40);
        profesor.setEmail("noreply@gmail.com");

        imprimir(alumno);
        System.out.println();
        imprimir(alumnoInt);
        System.out.println();
        imprimir(profesor);
    }

    public static void imprimir(Persona persona) {
        System.out.println(persona);
    }
}
