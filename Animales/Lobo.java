/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author USUARIO
 */
public class Lobo extends Canido {
    public String getSonido() {
        return "Aullido";
    }
    /**
    * Método que devuelve un String con los alimentos de un lobo
    * @return Un valor String con el tipo de alimentación de un lobo:
    * “Carnívoro”
    */
    public String getAlimentos() {
        return "Carnivoro";
    }
    /**
    * Método que devuelve un String con el hábitat de un lobo
    * @return Un valor String con el hábitat de un lobo: “Bosque”
    */
    public String getHabitat() {
        return "Bosque";
    }
    /**
    * Método que devuelve un String con el nombre científico de un lobo
    * @return Un valor String con el nombre científico de un lobo:
    * “Canis lupus”
    */
    public String getNombreCientifico() {
        return "Canis lupus";
    }
}
