/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author USUARIO
 */
public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    /* Atributo que identifica el valor de la administración de un
    apartamento familiar */
    protected int valorAdministracion;
    
    public ApartamentoFamiliar(int identificadorInmobiliario, int area,
    String direccion, int numeroHabitaciones, int numeroBaños, int
    valorAdministracion) {
    // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
        numeroHabitaciones, numeroBaños);
        this.valorAdministracion = valorAdministracion;
    }
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = $" +valorAdministracion);
        System.out.println();
    }
}
