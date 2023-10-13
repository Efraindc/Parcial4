/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

public class InmuebleVivienda extends Inmueble {
    /* Atributo que identifica el número de habitación de un inmueble
    para vivienda */
    protected int numeroHabitaciones;
    /* Atributo que identifica el número de baños de un inmueble para
    vivienda */
    protected int numeroBaños;
    
    public InmuebleVivienda(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, direccion); /* Invoca al
        constructor de la clase padre */
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }
    /**
    * Método que muestra en pantalla los datos de un inmueble para la
    * vivienda
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de habitaciones = " + numeroHabitaciones);
        System.out.println("Número de baños = " + numeroBaños);
    }
    
}
