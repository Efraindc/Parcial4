/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author USUARIO
 */
public class Casa extends InmuebleVivienda {
    protected int numeroPisos; /* Atributo que identica el número de
    pisos que tiene una casa */
 
    public Casa(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int númeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.numeroPisos = numeroPisos;
    }
    /**
    * Método que muestra en pantalla los datos de una casa
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de pisos = " + numeroPisos);
    }
}
