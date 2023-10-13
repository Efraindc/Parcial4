/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author USUARIO
 */
public class Inmueble {
    // Atributo para el identificador inmobiliario de un inmueble
    protected int identificadorInmobiliario;
    protected int area; // Atributo que identifica el área de un inmueble
    protected String direccion; /* Atributo que identifica la dirección de
    un inmueble */
    protected double precioVenta; /* Atributo que identifica el precio de
    venta de un inmueble */
    Inmueble(int identificadorInmobiliario, int área, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = área;
        this.direccion = direccion;
    }
   
    double calcularPrecioVenta(double valorArea) {
    precioVenta = area * valorArea;
    return precioVenta;
    }
    /**
    * Método que muestra en pantalla los datos de un inmueble
    */
    void imprimir() {
        System.out.println("Identificador inmobiliario = " + identificadorInmobiliario);
        System.out.println("Area =  " + area);
        System.out.println("Dirección = " + direccion);
        System.out.println("Precio de venta = $ "+ precioVenta);
    } 
}
