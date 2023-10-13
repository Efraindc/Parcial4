/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author USUARIO
 */
public class Leon extends Felino {
    public String getSonido() {
        return "Rugido";
    }
    /**
    * Método que devuelve un String con los alimentos de un león
    * @return Un valor String con la alimentación de un león: “Carnívoro”
    */
    public String getAlimentos() {
        return "Carnivoro";
    }
    
    public String getHabitat() {
        return "Praderas";
    }
    /**
    * Método que devuelve un String con el nombre científico de un león
    * @return Un valor String con el nombre científico de un león:
    * “Panthera leo”
    */
    public String getNombreCientifico() {
        return "Panthera leo";
    }
}
