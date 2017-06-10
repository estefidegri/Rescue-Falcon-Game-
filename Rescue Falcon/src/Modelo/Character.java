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
    private int ataque;
    private boolean heroe;
    private boolean muerto;

    /**
     * @return the salud
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre he salud to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the salud
     */
    public int getSalud() {
        return salud;
    }

    /**
     * @param salud the salud to set
     */
    public void setSalud(int salud) {
        this.salud = salud;
    }

    /**
     * @return the saludActual
     */
    public int getSaludActual() {
        return saludActual;
    }

    /**
     * @param saludActual the saludActual to set
     */
    public void setSaludActual(int saludActual) {
        this.saludActual = saludActual;
    }

    /**
     * @return the energia
     */
    public int getEnergia() {
        return energia;
    }

    /**
     * @param energia the energia to set
     */
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    /**
     * @return the energiaActual
     */
    public int getEnergiaActual() {
        return energiaActual;
    }

    /**
     * @param energiaActual the energiaActual to set
     */
    public void setEnergiaActual(int energiaActual) {
        this.energiaActual = energiaActual;
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

    /**
     * @return the muerto
     */
    public boolean isMuerto() {
        return muerto;
    }

    /**
     * @param muerto the muerto to set
     */
    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    /**
     *
     * @param nombre
     * @param salud
     * @param mana
     * @param defensa
     * @param ataque
     *
     * @param heroe
     *
     */
    public Character(String nombre, int salud, int mana, int defensa, int ataque, boolean heroe) {
        this.nombre = nombre;
        this.salud = salud;
        this.saludActual = (int) salud;
        this.energia = mana;
        this.energiaActual = mana;
        this.defensa = defensa;
        this.ataque = ataque;
        this.heroe = heroe;
        this.muerto = false;

    }

    /**
     * Constructro de mobs
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
     *
     * @param atacado
     * @return
     */
    public int atacar(Character atacado) {

        if (atacado.isHeroe() != this.isHeroe()) {
            if (atacado.isMuerto() == false && this.isMuerto() == false) {
                atacado.defender(atacado);
                int resultado = (int) ((Math.random() * this.getAtaque() + 1 / 2 * this.getAtaque()) + this.getAtaque());
                System.out.println("El ataque fue de " + resultado + " pero " + atacado.getNombre() + " resistio " + atacado.getDefensa());
                if (resultado > atacado.getSalud()) {
                    resultado = atacado.getSalud();
                }
                atacado.setSaludActual((int) (atacado.getSaludActual() - (resultado - atacado.getDefensa())));
                System.out.println("La salud de" + atacado.getNombre() + "  fue de " + atacado.getSaludActual());

            }
            System.out.println("-------------------------------------------------------");

            return this.getAtaque();
        }

        return 0;
    }

    public int defender(Character atacado) {
        System.out.println(atacado.getNombre() + " se va a defender y su defensa es  " + atacado.getDefensa());

        int resultado = (int) ((Math.random() * atacado.getDefensa() + 1 / 2 * atacado.getDefensa()) + atacado.getDefensa());
        System.out.println(atacado.getNombre() + " se defendio y su defensa ahora es de  " + atacado.getDefensa());
        atacado.setDefensa(resultado);
        return resultado;
    }

    /**
     *
     * @param amigo
     * @return
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
            System.out.println("-------------------------------------------------------");
        }
        return 0;
    }

    /**
     *
     * @param amigo
     * @return
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
