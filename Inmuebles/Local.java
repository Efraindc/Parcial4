/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author USUARIO
 */
public class Local extends Inmueble {
    enum tipo {INTERNO,CALLE}; /* Tipo de inmueble especificado
    como un valor enumerado */
    protected tipo tipoLocal; /* Atributo que identifica el tipo de
    inmueble */
    
    public Local(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
        }
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Tipo de local = " + tipoLocal);
    }
    
}
