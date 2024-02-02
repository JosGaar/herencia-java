package com.josuegarcia.pooherencia;

public class AlumnoInternacional extends Alumno {

    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional() {
        super();
        System.out.println("AlumnoInternacional: inicializando alumno internacional");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npais='" + pais + '\'' +
                ", notaIdiomas='" + notaIdiomas + "'";
    }

    @Override
    public String saludar() {
        return super.saludar() + ", del pais " + this.getPais();
    }

    @Override
    public double calcularPromedio() {
        System.out.println("calcularPromedio: " + AlumnoInternacional.class.getName());
        return ((super.calcularPromedio() * 3) + notaIdiomas) / 4;
    }
}
