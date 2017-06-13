/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * En la clase batalla se implementarán los heroes y villanos con sus métodos
 * correspondientes para realizar los enfrentamientos
 * Se cumple el requisito de crear 15 villanos en un arreglo (bestiario)
 * @author Estefania
 */
public class Batalla {

    Personaje[] heroes = new Personaje[5];
    Personaje[] bestiario = new Personaje[15];

    /**
     * El método consiste en que 2 grupos de personajes se atacan de manera 
     * simultanea
     * @param atacante el personaje que atacará
     * @param matrizEnemigos el grupo de enemigos siendo atacado
     * @return
     */
    private int atacarGrupal(Personaje atacante, Personaje[] matrizEnemigos) {
        int antes, despues, resultado;
        antes = vidaColectiva(matrizEnemigos);
        for (Personaje enemigo : matrizEnemigos) {
            if (atacante.isHeroe() != enemigo.isHeroe()) {
                atacante.atacar(enemigo);
            }
        }
        despues = vidaColectiva(matrizEnemigos);
        resultado = antes - despues;
        return resultado;
    }

    /**
     * Este método muestra que a partir de las batallas grupales  se
     * medirá la vida del grupo, sumando la vida actual de cada integrante.
     *
     * @param matrizEquipo grupo de personajes dentro de la batalla
     * @return retorna la vida del grupo
     */
    private int vidaColectiva(Personaje[] matrizEquipo) {
        int saludGrupal = 0;
        for (Personaje character : matrizEquipo) {
            saludGrupal += character.getSaludActual();
        }

        return saludGrupal;
    }

    /**
     * De la misma manera se contará con una energía grupal en las batallas
     *
     * @param matrizEquipo1 grupo de personajes
     * @return retorna la energía del grupo
     */
    private int energiaColectiva(Personaje[] matrizEquipo1) {
        int energiaGrupal = 0;
        for (Personaje character : matrizEquipo1) {
            energiaGrupal += character.getEnergiaActual();

        }
        return energiaGrupal;
    }

    /**
     * El método asigna que gruppo ataca primero
     *
     * @param heroes heroes
     * @param enemigos villanos
     * @return me retorna el ataque de los heroes como primero
     */
    public Personaje[] atacarPrimero(Personaje[] heroes, Personaje[] enemigos) {

        if (agilidadColectiva(heroes) < agilidadColectiva(enemigos)) {
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
     *
     * @param atacante personaje que atacará
     * @param atacado personaje siendo atacado
     * @return daño final a través de una resta
     */
    //ToDo Mejorar ataque.
    public int ataqueAutomatico(Personaje[] atacante, Personaje[] atacado) {
        int antes, despues, resultado, daño = 0;

        antes = vidaColectiva(atacado);
        System.out.println("La vida antes era de " + antes);

        daño = dañoColetivo(atacante, atacado);

        for (Personaje character : atacado) {
            if (daño > character.getSaludActual()) {
                character.setSaludActual(0);
                character.setMuerto(true);
                System.out.println("El personaje " + character.getNombre() + " ha sido asesinado");
            } else {
                character.setSaludActual(character.getSaludActual() - daño);
                System.out.println("La salud de " + character.getNombre() + " es de " + character.getSaludActual());
            }
        }
        despues = vidaColectiva(atacado);
        System.out.println("La nueva vida es de  " + despues);

        resultado = antes - despues;
        System.out.println("El daño final fue de " + resultado);
        return resultado;
    }

    /**
     * De la misma manera existe una agilidad grupal que también se mide
     * numéricamente
     *
     * @param personajes personajes
     * @return retorna la agilidad del grupo
     */
    public int agilidadColectiva(Personaje[] personajes) {
        int agilidadGrupal = 0;
        for (Personaje character : personajes) {
            agilidadGrupal += character.getAgilidad();

        }

        System.out.println("Agilidad del grup es de " + agilidadGrupal);
        return agilidadGrupal;

    }

    /**
     * Determina el daño colectivo
     *
     * @param atacantes quienes atacrán
     * @param atacados personajes siendo atacados
     * @return daño
     */
    public int dañoColetivo(Personaje[] atacantes, Personaje[] atacados) {
        int daño = 0;
        for (Personaje atacante : atacantes) {
            daño += atacante.getAtaque();
        }
        daño = daño / atacados.length;
        return daño;
    }

        

    }

