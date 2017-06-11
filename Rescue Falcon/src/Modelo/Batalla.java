/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * En la clase batalla se implementarán los heroes y villano
 * con sus métodos correspondientes para realizar los enfrentamientos
 * @author Estefania 
 */
public class Batalla {

    Character[] heroes = new Character[5];
    Character[] bestiario = new Character[15];

    /**
     * El método consiste en que un grupo de personajes ataca simultaneamente 
     * @param atacante el personaje que atacará
     * @param matrizEnemigos el grupo de enemigos siendo atacado 
     * @return
     */
    private int atacarGrupal(Character atacante, Character[] matrizEnemigos) {
        int antes, despues, resultado;
        antes = vidaColectiva(matrizEnemigos);
        for (Character enemigo : matrizEnemigos) {
            if (atacante.isHeroe() != enemigo.isHeroe()) {
                atacante.atacar(enemigo);
            }
        }
        despues = vidaColectiva(matrizEnemigos);
        resultado = antes - despues;
        return resultado;
    }

    /**
     * Este método muestra que a partir de las batallas grupales así mismo 
     * se medirá una vida del grupo, sumando la vida actual de cada integrante 
     * @param matrizEquipo grupo de personajes dentro de la batalla
     * @return retorna la vida del grupo 
     */
    private int vidaColectiva(Character[] matrizEquipo) {
        int saludGrupal = 0;
        for (Character character : matrizEquipo) {
            saludGrupal += character.getSaludActual();
        }

        return saludGrupal;
    }

    /**
     * De la misma manera se contará con una energía grupal en las batallas 
     * @param matrizEquipo1 grupo de personajes
     * @return retorna la energía del grupo 
     */
    private int energiaColectiva(Character[] matrizEquipo1) {
        int energiaGrupal = 0;
        for (Character character : matrizEquipo1) {
            energiaGrupal += character.getEnergiaActual();

        }
        return energiaGrupal;
    }

    /**
     * El método asigna que gruppo ataca primero 
     * @param heroes heroes 
     * @param enemigos villanos 
     * @return me retorna el ataque de los heroes como primero 
     */
    public Character[] atacarPrimero(Character[] heroes, Character[] enemigos) {

        if (agiliadColectiva(heroes) < agiliadColectiva(enemigos)) {
            System.out.println("Los enemigos atacan primero");

            ataqueAutomatico(enemigos, heroes);
            return enemigos;
        } else {

            System.out.println("Los heroes atacan primero");
            return heroes;

        }
    }

    /**
     * El método ataque automático sirve sólo para los enemigos
     * @param atacante personaje que atacará
     * @param atacado personaje siendo atacado
     */
    //ToDo Mejorar ataque.
    public void ataqueAutomatico(Character[] atacante, Character[] atacado) {
        int antes, despues, resultado;

        antes = vidaColectiva(atacado);
        System.out.println("la salud antes fue " + antes);
        for (int i = 0; i < atacante.length; i++) {
            for (int j = 0; j < atacado.length; j++) {
                atacante[i].atacar(atacado[j]);
            }
        }
        despues = vidaColectiva(atacado);
        System.out.println("La nueva salud es de " + despues);
        resultado = antes - despues;
    }
/**
 * De la misma manera existe una agilidad grupal
 * que también se mide numéricamente 
 * @param personajes personajes
 * @return retorna la agilidad del grupo 
 */
    public int agiliadColectiva(Character[] personajes) {
        int agilidadGrupal = 0;
        for (Character character : personajes) {
            agilidadGrupal += character.getAgilidad();

        }
        System.out.println("Agilidad del grup es de " + agilidadGrupal);
        return agilidadGrupal;

    }

}
