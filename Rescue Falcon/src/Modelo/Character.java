/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.sun.xml.internal.messaging.saaj.util.transform.EfficientStreamingTransformer;

/**
 * clase de Personaje: aqui se realiza la implementación de la interfaz
 *
 * @author Estefania
 */
public class Character {

    /**
     * @return the heroe
     */
    public boolean isHeroe() {
        return heroe;
    }

    /**
     * @param heroe the heroe to set
     */
    public void setHeroe(boolean heroe) {
        this.heroe = heroe;
    }

    private int vida = 0;
    private int vitalidad = 0;
    private int agilidad = 0;
    private int ataque = 0;
    private int defensa = 0;
    private float critico = 0;
    private boolean heroe = false;

    /**
     * Obtiene el critico
     *
     * @return
     */
    public float getCritico() {
        return critico;
    }

    /**
     * Asigna el critico
     *
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
     * @param defensa defensa del personaje
     * @param heroe heroe
     * @param critico potenciar ataque
     */
    public Character(int vida, int vitalidad, int agilidad, int ataque, int defensa, boolean heroe, float critico) {
        this.vida = vida;
        this.vitalidad = vitalidad;
        this.agilidad = agilidad;
        this.ataque = ataque;
        this.heroe = heroe;
        this.critico = critico;
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
        defensa = (int) (Math.random() * personaje.getDefensa() + 1 / 3) + personaje.getDefensa() * 1 / 2;
        heroe = false;
        critico = (float) 1.5;
    }

    public void atacar(Character enemigo) {
        enemigo.setVida(this.getAtaque() - enemigo.getVida() + enemigo.getDefensa());
    }

    /**
     * Aumenta la defensa del personaje
     *
     * @param personaje personaje a defender
     */
    public void defender(Character personaje) {
        if (personaje.getDefensa() == 0) {
            personaje.setDefensa(50);
        }
        personaje.setDefensa(personaje.getDefensa() + 1 / 2);
    }

    /**
     * sana al personaje si no es enemigo
     *
     * @param personaje personaje
     * @return vida del personaje
     */
    public int sanarse(Character personaje) {
        if (personaje.isHeroe() != true) {
            return 0;
        }
        personaje.setVida(personaje.getVida() + 1 / 3);
        return personaje.getVida();
    }

    /**
     * Recupera la viitalidad si no es un enemigo
     *
     * @param personaje personaje
     * @return retorna su vitalidad
     */
    public int recuperarVitalidad(Character personaje) {
        if (personaje.isHeroe() != true) {
            return 0;

        }
        if (personaje.getVitalidad() == 0) {
            personaje.setVitalidad(50);
            return personaje.getVitalidad();
        }

        personaje.setVitalidad(personaje.getVitalidad() + 1 / 3);
        return personaje.getVitalidad();
    }

}
