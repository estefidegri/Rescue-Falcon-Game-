/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Personaje;

/**
 * clase de Personaje: aqui se realiza la implementación de la interfaz
 *
 * @author Estefania
 */
public class Character implements Personaje {

    private int vida;
    private int vitalidad;
    private int agilidad;
    private int ataque;
    private int defensa = 0;

    //Getter y setters 
    /**
     * @return the agilidad
     */
    public int getAgilidad() {
        return agilidad;
    }

    /**
     * @param agilidad the agilidad to set
     */
    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    /**
     * @return the ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * @return the defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * @param defensa the defensa to set
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * Constructor del personaje
     *
     * @param vida vida del personaje
     * @param vitalidad vitalidad del personaje
     * @param agilidad agilidad del personaje
     * @param ataque ataque del personaje
     */
    public Character(int vida, int vitalidad, int agilidad, int ataque) {
        this.vida = vida;
        this.vitalidad = vitalidad;
        this.agilidad = agilidad;
        this.ataque = ataque;
    }

    public Character(Character personaje) {
        vida = (int) (Math.random() * personaje.getVida() + 1 / 3) + personaje.getVida() * 1 / 2;

    }

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

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return the vitalidad
     */
    public int getVitalidad() {
        return vitalidad;
    }

    /**
     * @param vitalidad the vitalidad to set
     */
    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

}
