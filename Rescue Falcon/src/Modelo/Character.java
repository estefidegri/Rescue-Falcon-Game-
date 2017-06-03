/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Personaje;

/**
 * clase de Personaje: aqui se realiza la implementación de la interfaz 
 * @author Estefania
 */
public class Character implements Personaje{ 
    
    int vida,vitalidad = 0; 

    @Override
    public void atacar(Personaje enemigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void defender(Personaje personaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int sanarse(Personaje personaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int recuperarVitalidad(Personaje personaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
   
    
}
