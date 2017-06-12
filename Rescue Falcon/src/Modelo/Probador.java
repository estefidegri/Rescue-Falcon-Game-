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
        Character pollito = new Character("Pollito", 1000, 100, 30, 90, 10, true);
        Character ovejero = new Character("Ovejero ", 1000, 100, 30, 90, 10, true);
        Character granjero = new Character(" Granjero ", 1000, 100, 30, 90, 10, false);

        Character coyote = new Character(pollito);
        Character gato = new Character(granjero);
        Character burro = new Character(ovejero);
        
        Character[] enemigos = new Character[3];
        Character[] heroes = new Character[3];
        
        heroes[0] = pollito;
        heroes[1] = ovejero;
        heroes[2] = granjero;
        enemigos[0] = coyote;
        enemigos[1] = gato;
        enemigos[2] = burro;
        

      
        combate.ataqueAutomatico(enemigos, heroes);
    
       
      

    }

}
