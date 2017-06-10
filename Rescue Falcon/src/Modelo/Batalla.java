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
        int antes, despues, resultado = 0;
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
            saludGrupal = +character.getSaludActual();
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
            energiaGrupal = +character.getEnergiaActual();

        }
        return energiaGrupal;
    }
    
    
    

}
