package Modelo;

/**
 * Esta clase sirve como modelo para crear
 *
 * @author Estefania
 */
public class Character {

    private String nombre = "";
    private int salud;
    private int saludActual;
    private int energia;
    private int energiaActual;
    private int defensa;
    private int agilidad;
    private int ataque;
    private boolean heroe;
    private boolean muerto;

    /**
     * El método establece la agilidad del personaje
     *
     * @param agilidad agilidad del personaje
     */
    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;

    }

    /**
     * El método retorna la agilidad del personaje
     *
     * @return agilidad personaje
     */
    public int getAgilidad() {
        return agilidad;
    }

    /**
     * El método retorna el nombre del personaje
     *
     * @return nombre del personaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * El método da un nombre al personaje
     *
     * @param nombre nombre del personaje
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * EL método retorna la salud (vida) del personaje
     *
     * @return salud es la vida del personaje
     */
    public int getSalud() {
        return salud;
    }

    /**
     * El método le proporciona la salud al personaje
     *
     * @param salud es la vida del personaje
     */
    public void setSalud(int salud) {
        this.salud = salud;
    }

    /**
     * El método retorna la salud en un momento determinado de la batalla (puede
     * ser antes o después).
     *
     * @return the saludActual vida actual del personaje
     */
    public int getSaludActual() {
        return saludActual;
    }

    /**
     * El método establece la vida actual del personaje
     *
     * @param saludActual es la vida actual del personaje
     */
    public void setSaludActual(int saludActual) {
        this.saludActual = saludActual;
    }

    /**
     * El método retorna la energía del personaje
     *
     * @return energía del personaje
     */
    public int getEnergia() {
        return energia;
    }

    /**
     * El método establece la energía al personaje
     *
     * @param energia energia del personaje
     */
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    /**
     * El método retorna la energía que posee el personaje en un momento
     * determinado de la batalla (antes o después).
     *
     * @return energiaActual también interpretada como mana
     */
    public int getEnergiaActual() {
        return energiaActual;
    }

    /**
     * El método establece la energía actual del personaje
     *
     * @param energiaActual energía actual (mana)
     */
    public void setEnergiaActual(int energiaActual) {
        this.energiaActual = energiaActual;
    }

    /**
     * El método retorna la defensa de su personaje
     *
     * @return defensa es una habilidad
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * El método establece la defensa de su personaje
     *
     * @param defensa defensa es una habilidad
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * El método retorna el ataque del personaje
     *
     * @return ataque es una habilidad
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * El método establece el ataque del personaje
     *
     * @param ataque es una habilidad
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * El método retorna si el personaje es heroe o no
     *
     * @return heroe heroe
     */
    public boolean isHeroe() {
        return heroe;
    }

    /**
     * El método establece si es heroe o no
     *
     * @param heroe heroe
     */
    public void setHeroe(boolean heroe) {
        this.heroe = heroe;
    }

    /**
     * El método retorna si el personaje está muerto o no
     *
     * @return muerto inhabilitado
     */
    public boolean isMuerto() {
        return muerto;
    }

    /**
     * El método establece si está muerto o no
     *
     * @param muerto muerto inhabilitado
     */
    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    /**
     * Primer constructor. se mencionan las características y habilidades de los
     * personajes.
     *
     * @param nombre nombre del personaje
     * @param salud vida del personaje
     * @param energia energía del personaje
     * @param defensa defensa del personaje
     * @param ataque ataque del personaje
     * @param agilidad agilidad del personaje
     * @param heroe
     */
    public Character(String nombre, int salud, int energia, int defensa, int ataque, int agilidad, boolean heroe) {
        this.nombre = nombre;
        this.agilidad = agilidad;
        this.salud = salud;
        this.saludActual = (int) salud;
        this.energia = energia;
        this.energiaActual = energia;
        this.defensa = defensa;
        this.ataque = ataque;
        this.heroe = heroe;
        this.muerto = false;

    }

    /**
     * Segundo constructor. Características y habilidades definidas e
     * implementadas.
     *
     * @param personaje personaje a basarse
     */
    public Character(Character personaje) {
        this.salud = personaje.getSalud() + personaje.getSalud() + 1 / 4;
        this.saludActual = this.salud;
        this.energia = personaje.getEnergia() + personaje.getEnergia() * 1 / 4;
        this.energiaActual = this.energia;
        this.defensa = personaje.getDefensa() + personaje.getDefensa() * 1 / 4;
        this.ataque = personaje.getAtaque() + personaje.getAtaque() * 1 / 4;
        this.heroe = false;
        this.muerto = false;

    }

    /**
     * El método muestra toda la estructura para atacar
     *
     * @param atacado el personaje siendo atacado dentro de la batalla
     * @return retorna el ataque del heroe como resultado de "atacar"
     */
    public int atacar(Character atacado) {

        if (atacado.isHeroe() != this.isHeroe()) {
            if (atacado.isMuerto() == false && this.isMuerto() == false) {
                atacado.defender(atacado);
                int resultado = (int) ((Math.random() * this.getAtaque() + 1 / 2 * this.getAtaque()) + this.getAtaque());
                System.out.println("El ataque fue de " + resultado + " pero " + atacado.getNombre() + " resistió " + atacado.getDefensa());
                if (resultado > atacado.getSalud()) {
                    resultado = atacado.getSalud();
                }
                atacado.setSaludActual((int) (atacado.getSaludActual() - (resultado - atacado.getDefensa())));
                System.out.println("La salud de" + atacado.getNombre() + " fue de " + atacado.getSaludActual());

            }

            return this.getAtaque();
        }

        return 0;
    }

    /**
     * El método muestra la estructura para defender
     *
     * @param atacado el personaje siendo atacado
     * @return retorna el resultado de la operación matemática para dicha
     * defensa
     */
    public int defender(Character atacado) {
        System.out.println(atacado.getNombre() + " se va a defender y su defensa es de " + atacado.getDefensa());

        int resultado = (int) ((Math.random() * atacado.getDefensa() + 1 / 2 * atacado.getDefensa()) + atacado.getDefensa());

        atacado.setDefensa(resultado);
        System.out.println(atacado.getNombre() + " se defendió y su defensa ahora es de " + atacado.getDefensa());
        return resultado;
    }

    /**
     * El método sanar individual consiste en que cada personaje tiene la
     * capacidad de sanarse a sí mismo
     *
     * @param amigo es el personaje de tipo heroe o bueno
     * @return inicialmente retorna la vida actual del persona y 0 para la
     * operación.
     */
    public int sanarIndividual(Character amigo) {

        if (amigo.isHeroe() == this.isHeroe()) {
            if (amigo.isMuerto() == false) {
                int resultado = ((int) (amigo.getSaludActual() * Math.random() + amigo.getSaludActual() * 1) + amigo.getSaludActual() * 1 / 2);
                System.out.println(this.getNombre() + " su energía antes de sanar a" + amigo.getNombre() + " es de" + this.getEnergiaActual());
                if (resultado > amigo.getSalud()) {
                    resultado = amigo.getSalud();
                }
                amigo.setSaludActual(resultado);
                System.out.println(this.getNombre() + " ha curado a " + amigo.getNombre() + " y su nueva salud es de " + amigo.getSaludActual());
                this.setEnergiaActual(this.getEnergiaActual() - this.getEnergiaActual() * 1 / 3);
                System.out.println(this.getNombre() + " su energía actual es de " + this.getEnergiaActual());
                return amigo.getSaludActual();
            }

            System.out.println("El personaje " + amigo.getNombre() + " es un enemigo");

        }
        return 0;
    }

    /**
     * Cada personaje tiene la capacidad de recuperar su energía pero
     * sacrificando parte de su vida actual
     *
     * @param amigo personaje de tipo heroe
     * @return retorna la energía actual del personaje amigo o heroe
     */
    public int recuperarEnergia(Character amigo) {
        if (amigo.isHeroe() == this.isHeroe()) {
            if (amigo.isMuerto() == false) {
                if (amigo.getSaludActual() > 0) {
                    System.out.println(this.getNombre() + " su salud actual es de " + this.getSaludActual());
                    amigo.setEnergiaActual(amigo.getEnergiaActual() + amigo.getEnergiaActual() * 1 / 3);
                    System.out.println(this.getNombre() + " ha reestablecido la energía " + amigo.getNombre() + " y su nueva energía es de" + amigo.getEnergiaActual());
                    this.setSaludActual(this.getSaludActual() - this.getSaludActual() * 1 / 3);
                    System.out.println(this.getNombre() + " usó la técnica recuperación y su nueva vida es de " + this.saludActual);

                }
                System.out.println("-------------------------------------------------------");

            }
            return amigo.getEnergiaActual() * 1 / 3;
        }
        return 0;
    }

}
