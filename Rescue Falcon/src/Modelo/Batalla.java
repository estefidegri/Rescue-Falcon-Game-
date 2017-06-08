/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author tania
 */
public class Batalla {
    
    
    public static void main(String[] args) {
        Character heroe = new Character(" Luis",100, 100, 30, 70, true);
        Character villano = new Character(" Estefania",130, 100, 30, 50, false);
        
        heroe.atacar(villano);
        
        
//        heroe.sanarIndividual(villano);
        
    }
}
