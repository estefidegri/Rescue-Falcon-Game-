/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * clase de Personaje: aqui se realiza la implementación de la interfaz
 *
 * @author Estefania
 */
public class Character {

    private int vida = 0;
    private int vitalidad = 0;
    private int agilidad = 0;
    private int ataque = 0;
    private int defensa = 0;
    private int critico = 0;

    
    /**
     * Obtiene el  critico
     * @return 
     */
    public int getCritico() {
        return critico;
    }

    /**
     * Asigna el critico
     * @param critico 
     */
    public void setCritico(int critico) {
        this.critico = critico;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

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

    /**
     * Constructor default para mobs
     *
     * @param personaje personaje con base en el constructor.
     */
    public Character(Character personaje) {
        vida = (int) (Math.random() * personaje.getVida() + 1 / 3) + personaje.getVida() * 1 / 2;
        vitalidad = (int) (Math.random() * personaje.getVitalidad() + 1 / 3) + personaje.getVitalidad() * 1 / 2;
        agilidad = (int) (Math.random() * personaje.getAgilidad() + 1 / 3) + personaje.getAgilidad() * 1 / 2;
        ataque = (int) (Math.random() * personaje.getAtaque() + 1 / 3) + personaje.getAtaque() * 1 / 2;
    }

    public void atacar(Character enemigo) {
        enemigo.setVida(this.getAtaque() - enemigo.getVida() + enemigo.getDefensa());
    }

    public void defender(Character personaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int sanarse(Character personaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int recuperarVitalidad(Character personaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
