/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Probador {

    public static void main(String[] args) {

        Batalla combate = new Batalla();
        Character heroes[] = new Character[3];
        Character bestiario[] = new Character[14];
        Character[] enemigos = new Character[3];

        // Heroes
        Character pollito = new Character("Pollito", 100, 1000, 30, 50, 20, true);
        Character granjero = new Character("Granjero", 100, 1000, 30, 50, 30, true);
        Character ovejero = new Character("Ovejero", 100, 1000, 30, 50, 10, true);

        Character burro = new Character("burro", 100, 1000, 30, 50, 20, true);
        Character coyote = new Character("coyote", 100, 1000, 30, 50, 70, true);
        Character gato = new Character("gato", 100, 1000, 30, 50, 40, true);
        
        
        heroes[0] = pollito;
        heroes[1] = granjero;
        heroes[2] = ovejero;

        enemigos[0] = burro;
        enemigos[1] = coyote;
        enemigos[2] = gato;

        

    }

}
