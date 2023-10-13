/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author USUARIO
 */
public class Apartamento extends InmuebleVivienda {
    public Apartamento(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBaños) {
    // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
        numeroHabitaciones, numeroBaños);
    }
    /**
    * Método que muestra en pantalla los datos de un apartamento
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}
