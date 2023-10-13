/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author USUARIO
 */
public class Apartaestudio extends Apartamento {
    protected static double valorArea = 1500000;
    public Apartaestudio(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBaños) {
    // Invoca al constructor de la clase padre
    // Los apartaestudios tienen una sola habitación y un solo baño
        super(identificadorInmobiliario, area, direccion, 1, 1);
    }
    
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}
