/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author USUARIO
 */
public class Gato extends Felino {
    public String getSonido() {
        return "Maullido";
    }
    /**
    * Método que devuelve un String con los alimentos de un gato
    * @return Un valor String con la alimentación de un gato: “Ratones”
    */
    public String getAlimentos() {
        return "Ratones";
    }
    public String getHabitat() {
        return "Domestico";
    }
    /**
    * Método que devuelve un String con el nombre científico de un gato
    * @return Un valor String con el nombre científico de un gato:
    * “Felis silvestris catus”
    */
    public String getNombreCientifico() {
        return "Felis silvestris catus";
    }
}
