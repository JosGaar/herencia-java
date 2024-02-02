package com.josuegarcia.ejemplo;

import com.josuegarcia.pooherencia.*;

public class EjemploHerenciaConstructores {
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
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona) {
        System.out.println("Imprimiendo datos en comun del tipo Persona");
        System.out.println("Nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del tipo Alumno: ");
            System.out.println("Institucion: " + ((Alumno)persona).getColegio());
            System.out.println("Nota matematicas: " + ((Alumno)persona).getNotaMatematica());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo los datos del alumno internacional: ");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }

            System.out.println("\n=== Sobreescritura metodo promedio ===");
            System.out.println(((Alumno) persona).calcularPromedio());
            System.out.println("=====================================");
        }

        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo los datos del profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println();
        System.out.println("=== Sobreescritura metodo saludar ===");
        System.out.println(persona.saludar());
        System.out.println("=====================================");
        System.out.println();
    }
}
