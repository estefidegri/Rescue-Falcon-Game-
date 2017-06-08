package Modelo;

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
        this.salud = (int) (personaje.getSalud() * (Math.random() + personaje.getSalud()*2 * (personaje.getSalud()*1 / 2)));
        this.saludActual = this.salud;
        this.energia = (int) (personaje.getEnergia() * Math.random() + 2 * 1 / 2);
        this.energiaActual = this.energia;
        this.defensa = (int) (personaje.getDefensa() * Math.random() + 2 * 1 / 2);
        this.ataque = (int) (personaje.getAtaque() * Math.random() + 2 * 1 / 2);
        this.heroe = false;
        this.muerto = false;
        
    }
    
    public int atacar(Character atacado) {
        
        if (atacado.isHeroe() == false) {
            if (atacado.isMuerto() == false && this.isMuerto() == false) {
                
                int resultado = (int) ((Math.random()*this.getAtaque() + 1/2 * this.getAtaque())+this.getAtaque()) ;
                System.out.println("El ataque fue de " + resultado + " pero " + atacado.getNombre() + " resistio " + atacado.getDefensa());
                
                
                atacado.setSaludActual((int) (atacado.getSaludActual() - (resultado - atacado.getDefensa())));
                System.out.println("La salud de" + atacado.getNombre() + "  fue de " + atacado.getSaludActual());
                
            }
            return this.getAtaque();
        }
        
        return 0;
    }
    
    public int sanarIndividual(Character amigo) {
      
            if (amigo.isMuerto() == false) {
                amigo.setSaludActual((int) (amigo.getSaludActual() * Math.random()+ amigo.getSaludActual() * 1) + amigo.getSaludActual()* 1/2 );
                System.out.println(this.nombre + " ha curado a " + amigo.getNombre() +" y su nueva salud es de "+ amigo.getSaludActual());
                return amigo.getSaludActual();
            }
            
            System.out.println("El personaje " + amigo.getNombre() + " es un enemigo");
        
        
        return 0;
    }
    
}
