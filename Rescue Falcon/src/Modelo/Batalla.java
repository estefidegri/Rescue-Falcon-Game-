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

    Character[] heroes = new Character[5];
    Character[] bestiario = new Character[15];

    /**
     *
     * @param atacante
     * @param matrizEnemigos
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
     *
     * @param matrizEquipo
     * @return
     */
    private int vidaColectiva(Character[] matrizEquipo) {
        int saludGrupal = 0;
        for (Character character : matrizEquipo) {
            saludGrupal += character.getSaludActual();
        }

        return saludGrupal;
    }

    /**
     *
     * @param matrizEquipo1
     * @return
     */
    private int energiaColectiva(Character[] matrizEquipo1) {
        int energiaGrupal = 0;
        for (Character character : matrizEquipo1) {
            energiaGrupal += character.getEnergiaActual();

        }
        return energiaGrupal;
    }

    /**
     *
     * @param heroes
     * @param enemigos
     * @return
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
     *
     * @param atacante
     * @param atacado
     * @return
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

    public int agiliadColectiva(Character[] personajes) {
        int agilidadGrupal = 0;
        for (Character character : personajes) {
            agilidadGrupal += character.getAgilidad();

        }
        System.out.println("Agilidad del grup es de " + agilidadGrupal);
        return agilidadGrupal;

    }

}
