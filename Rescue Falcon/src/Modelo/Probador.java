/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * La clase probador sirve para crear el método main 
 * @author Estefania
 */
public class Probador {
    
/**
 * En el main se realizan los llamados de los objetos "personaje" 
 * @param args 
 */
    public static void main(String[] args) {

        Batalla combate = new Batalla();
        Personaje pollito = new Personaje("Pollito", 1000, 100, 30, 100, 10, true);
        Personaje ovejero = new Personaje("Ovejero ", 1000, 100, 30, 90, 10, true);
        Personaje granjero = new Personaje(" Granjero ", 1000, 100, 30, 90, 10, false);

        Personaje coyote = new Personaje(pollito);
        Personaje gato = new Personaje(granjero);
        Personaje burro = new Personaje(ovejero);

        Personaje[] enemigos = new Personaje[3];
        Personaje[] heroes = new Personaje[7];

        heroes[0] = pollito;
        heroes[1] = ovejero;
        heroes[2] = granjero;
        heroes[3] = coyote;
        heroes[5] = gato;
        heroes[6] = burro;
//        enemigos[0] = coyote;
//        enemigos[1] = gato;
//        enemigos[2] = burro;
//        

       

    }
}
