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


    /**
     * 
     * @param heroes
     * @param enemigos
     * @return 
     */
    public Character[] atacarPrimero(Character[] heroes, Character[] enemigos) {
        int agilidadEnemigos = 0, agilidadHeroes = 0;
        for (Character enemigo : enemigos) {
            agilidadEnemigos = +enemigo.getAgilidad();
        }
        for (Character heroe : heroes) {
            agilidadHeroes = +heroe.getAgilidad();
        }

        if (agilidadEnemigos > agilidadHeroes) {
            ataqueAutomatico(enemigos, heroes);
            return enemigos;
        }
         return heroes;
        
        
    }

    /**
     *
     * @param atacante
     * @param atacado
     * @return
     */
    //ToDo Mejorar ataque.
    public int ataqueAutomatico(Character[] atacante, Character[] atacado) {
        int resultado;
        int antes = vidaColectiva(atacado);
        for (Character atacante1 : atacante) {
            for (Character atacado1 : atacado) {
                atacante1.atacar(atacado1);
            }
        }
        int despues = vidaColectiva(atacado);
        resultado = antes - despues;
        return resultado;
    }

}

