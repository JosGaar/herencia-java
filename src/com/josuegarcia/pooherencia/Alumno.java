package com.josuegarcia.pooherencia;

public class Alumno extends Persona {

    private String colegio;
    private double notaMatematica;
    private double notaLenguaje;
    private double notaHistoria;

    public Alumno() {
        super();
        System.out.println("Alumno: inicializando alumno");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String colegio) {
        this(nombre, apellido, edad);
        this.colegio = colegio;
    }

    public Alumno(String nombre, String apellido, int edad,
                  String colegio, double notaMatematica,
                  double notaHistoria, double notaLenguaje) {
        this(nombre, apellido, edad, colegio);
        this.notaMatematica = notaMatematica;
        this.notaHistoria = notaHistoria;
        this.notaLenguaje = notaLenguaje;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLenguaje() {
        return notaLenguaje;
    }

    public void setNotaLenguaje(double notaLenguaje) {
        this.notaLenguaje = notaLenguaje;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncolegio='" + colegio + '\'' +
                ", notaMatematica='" + notaMatematica + "'" +
                ", notaLenguaje='" + notaLenguaje + "'" +
                ", notaHistoria='" + notaHistoria + "'" +
                ", promedio='" + this.calcularPromedio() + "'";
    }

    @Override
    public String saludar() {
        String saludar = super.saludar(); // Llamada al metodo saludar del padre.
        return saludar + " soy alumno y mi nombre es " + this.getNombre();
    }

    public double calcularPromedio() {
        System.out.println("calcularPromedio: " + Alumno.class.getName());
        return (notaHistoria + notaLenguaje + notaMatematica) / 3;
    }
}
