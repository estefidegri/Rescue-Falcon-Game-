/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Estefania
 */
public interface Personaje {
    /**
     * el siguiente método ataca al enemigo 
     * @param enemigo enemigo 
     */
    void atacar (Character enemigo); 
        //no posee public porque está usando la privacidad de la clase 
    /**
     * Cada uno tiene la capacidad de defenderse
     * @param personaje heroe o enemigo 
     */
    
    void defender (Character personaje); 
    
    /**
     * Ambos pueden ussar habilidades.
     * @param personaje personaje
     * @return recuperacion
     */
    
    int sanarse (Character personaje);
        
    /**
     * Ambos pueden recuerar vitalidad
     * @param personaje personaje 
     * @return recuperación
     */
    int recuperarVitalidad (Character personaje); 
    
            
}
