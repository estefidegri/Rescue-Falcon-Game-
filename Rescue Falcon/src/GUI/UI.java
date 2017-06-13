/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Modelo.Batalla;
import Modelo.Personaje;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author tania
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        gaticoName.setText(gato.getNombre());
        CabraName.setText(cabrota.getNombre());
        porkyName.setText(porky.getNombre());
        startGame();
        inicioCombate(heroes, enemigos);
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BadGuys = new javax.swing.JPanel();
        jLabel0 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cabrote = new javax.swing.JLabel();
        puerquito = new javax.swing.JLabel();
        gatico = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Estatus = new javax.swing.JLabel();
        Battle = new javax.swing.JPanel();
        gaticoName = new javax.swing.JLabel();
        porkyName = new javax.swing.JLabel();
        CabraName = new javax.swing.JLabel();
        CabraName1 = new javax.swing.JLabel();
        enem1 = new javax.swing.JLabel();
        enem2 = new javax.swing.JLabel();
        cabra1 = new javax.swing.JPanel();
        gaticoName2 = new javax.swing.JLabel();
        porkyName2 = new javax.swing.JLabel();
        CabraName3 = new javax.swing.JLabel();
        gaticoName3 = new javax.swing.JLabel();
        CabraName4 = new javax.swing.JLabel();
        porkyName3 = new javax.swing.JLabel();
        CabraName5 = new javax.swing.JLabel();
        porkyName4 = new javax.swing.JLabel();
        enem0 = new javax.swing.JLabel();
        enemigosTitle = new javax.swing.JLabel();
        heroesTitle = new javax.swing.JLabel();
        badGuysBar = new javax.swing.JProgressBar();
        goodGuysBar = new javax.swing.JProgressBar();
        enem02Life = new javax.swing.JLabel();
        enem0Life = new javax.swing.JLabel();
        enem1Life = new javax.swing.JLabel();
        heroe1Life = new javax.swing.JLabel();
        heroe0Life = new javax.swing.JLabel();
        heroe2Life = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        setName("Rescue Falcon"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(null);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BadGuys.setLayout(new java.awt.GridLayout(3, 2));

        jLabel0.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel0.setText("jLabel2");
        jLabel0.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BadGuys.add(jLabel0);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel1.setText("jLabel3");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BadGuys.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setText("jLabel4");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BadGuys.add(jLabel2);

        jPanel2.add(BadGuys, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 390));

        cabrote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/10.png"))); // NOI18N
        jPanel2.add(cabrote, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        puerquito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puerquito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/11.png"))); // NOI18N
        jPanel2.add(puerquito, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        gatico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/12.png"))); // NOI18N
        jPanel2.add(gatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 920, 440));

        jPanel4.setBackground(new java.awt.Color(69, 54, 46));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Estatus.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        Estatus.setForeground(new java.awt.Color(220, 203, 52));
        Estatus.setText("jLabel3");
        jPanel4.add(Estatus);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 960, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 960, 540));

        Battle.setBackground(new java.awt.Color(69, 54, 46));
        Battle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Battle.setToolTipText("");
        Battle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gaticoName.setBackground(new java.awt.Color(255, 255, 255));
        gaticoName.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        gaticoName.setForeground(new java.awt.Color(255, 255, 255));
        gaticoName.setText("jLabel2");
        Battle.add(gaticoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, -1));

        porkyName.setBackground(new java.awt.Color(255, 255, 255));
        porkyName.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        porkyName.setForeground(new java.awt.Color(255, 255, 255));
        porkyName.setText("jLabel3");
        Battle.add(porkyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        CabraName.setBackground(new java.awt.Color(255, 255, 255));
        CabraName.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        CabraName.setForeground(new java.awt.Color(255, 255, 255));
        CabraName.setText("Salud total");
        Battle.add(CabraName, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        CabraName1.setBackground(new java.awt.Color(255, 255, 255));
        CabraName1.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        CabraName1.setForeground(new java.awt.Color(202, 37, 37));
        CabraName1.setText("Salud total");
        Battle.add(CabraName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        enem1.setBackground(new java.awt.Color(255, 255, 255));
        enem1.setFont(new java.awt.Font("Liberation Sans", 1, 21)); // NOI18N
        enem1.setForeground(new java.awt.Color(255, 255, 255));
        enem1.setText("jLabel3");
        Battle.add(enem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        enem2.setBackground(new java.awt.Color(255, 255, 255));
        enem2.setFont(new java.awt.Font("Liberation Sans", 1, 21)); // NOI18N
        enem2.setForeground(new java.awt.Color(255, 255, 255));
        enem2.setText("jLabel4");
        Battle.add(enem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        cabra1.setBackground(new java.awt.Color(69, 54, 46));
        cabra1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cabra1.setToolTipText("");
        cabra1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gaticoName2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        gaticoName2.setText("jLabel2");
        cabra1.add(gaticoName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

        porkyName2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        porkyName2.setText("jLabel3");
        cabra1.add(porkyName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));

        CabraName3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        CabraName3.setText("jLabel4");
        cabra1.add(CabraName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, -1));

        gaticoName3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        gaticoName3.setText("jLabel2");
        cabra1.add(gaticoName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        CabraName4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        CabraName4.setText("Salud total");
        cabra1.add(CabraName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        porkyName3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        porkyName3.setText("jLabel3");
        cabra1.add(porkyName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        CabraName5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        CabraName5.setText("jLabel4");
        cabra1.add(CabraName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        Battle.add(cabra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 430, 960, 140));

        porkyName4.setBackground(new java.awt.Color(255, 255, 255));
        porkyName4.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        porkyName4.setForeground(new java.awt.Color(72, 184, 89));
        porkyName4.setText("Salud total");
        Battle.add(porkyName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));

        enem0.setBackground(new java.awt.Color(255, 255, 255));
        enem0.setFont(new java.awt.Font("Liberation Sans", 1, 21)); // NOI18N
        enem0.setForeground(new java.awt.Color(255, 255, 255));
        enem0.setText("jLabel2");
        Battle.add(enem0, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        enemigosTitle.setBackground(new java.awt.Color(255, 255, 255));
        enemigosTitle.setFont(new java.awt.Font("URW Gothic", 1, 20)); // NOI18N
        enemigosTitle.setForeground(java.awt.SystemColor.controlLtHighlight);
        enemigosTitle.setText("Enemigos");
        Battle.add(enemigosTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 30));

        heroesTitle.setBackground(new java.awt.Color(255, 255, 255));
        heroesTitle.setFont(new java.awt.Font("URW Gothic", 1, 20)); // NOI18N
        heroesTitle.setForeground(java.awt.SystemColor.controlLtHighlight);
        heroesTitle.setText("Heroes");
        Battle.add(heroesTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, 30));
        Battle.add(badGuysBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));
        Battle.add(goodGuysBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, -1));

        enem02Life.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        enem02Life.setForeground(new java.awt.Color(220, 203, 52));
        enem02Life.setText("jLabel2");
        Battle.add(enem02Life, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 120, 50));

        enem0Life.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        enem0Life.setForeground(new java.awt.Color(220, 203, 52));
        enem0Life.setText("jLabel2");
        Battle.add(enem0Life, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 110, 30));

        enem1Life.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        enem1Life.setForeground(new java.awt.Color(220, 203, 52));
        enem1Life.setText("jLabel2");
        Battle.add(enem1Life, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 30));

        heroe1Life.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        heroe1Life.setForeground(new java.awt.Color(220, 203, 52));
        heroe1Life.setText("jLabel2");
        Battle.add(heroe1Life, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, -1));

        heroe0Life.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        heroe0Life.setForeground(new java.awt.Color(220, 203, 52));
        heroe0Life.setText("jLabel2");
        Battle.add(heroe0Life, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, -1));

        heroe2Life.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        heroe2Life.setForeground(new java.awt.Color(220, 203, 52));
        heroe2Life.setText("jLabel2");
        Battle.add(heroe2Life, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, -1, -1));

        jButton4.setText("Atacar");
        Battle.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jButton5.setText("Atacar");
        Battle.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jButton6.setText("atacar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Battle.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jButton1.setText("Embestida");
        Battle.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 80, -1));

        jButton2.setText("Gases");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Battle.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 80, -1));

        jButton3.setText("Arañar");
        Battle.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 80, -1));

        getContentPane().add(Battle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 970, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UI().setVisible(true);
        });
    }

    private void startGame() {
        heroes[0] = cabrota;
        heroes[1] = porky;
        heroes[2] = gato;
        heroesIconos[0] = cabrote;
        heroesIconos[1] = puerquito;
        heroesIconos[2] = gatico;
        
        bestiario[0] = jefe01;
        bestiario[1] = jefe02;
        bestiario[2] = jefe03;
        bestiario[3] = jefe04;
        bestiario[4] = jefe05;
        bestiario[5] = jefe06;
        bestiario[6] = jefe07;
        bestiario[7] = jefe08;
        bestiario[8] = jefe09;
        bestiario[9] = jefe10;
        bestiario[10] = jefe11;
        bestiario[11] = jefe12;
        bestiario[12] = jefe13;
        bestiario[13] = jefe14;
        bestiario[14] = jefe15;

        villanos[0] = jLabel0;
        villanos[1] = jLabel1;
        villanos[2] = jLabel2;
        for (int i = 0; i < bestiario.length; i++) {
            bestiario[i].setNombre("Jefe " + i);
        }
        recursos[0] = new ImageIcon(getClass().getResource("/Recursos/0.png"));
        recursos[1] = new ImageIcon(getClass().getResource("/Recursos/01.png"));
        recursos[2] = new ImageIcon(getClass().getResource("/Recursos/2.png"));
        recursos[3] = new ImageIcon(getClass().getResource("/Recursos/3.png"));
        recursos[4] = new ImageIcon(getClass().getResource("/Recursos/4.png"));
        recursos[5] = new ImageIcon(getClass().getResource("/Recursos/4.png"));
        recursos[6] = new ImageIcon(getClass().getResource("/Recursos/5.png"));
        recursos[7] = new ImageIcon(getClass().getResource("/Recursos/6.png"));
        recursos[8] = new ImageIcon(getClass().getResource("/Recursos/7.png"));
        recursos[9] = new ImageIcon(getClass().getResource("/Recursos/8.png"));
        recursos[10] = new ImageIcon(getClass().getResource("/Recursos/9.png"));
        recursos[11] = new ImageIcon(getClass().getResource("/Recursos/15.png"));
        recursos[12] = new ImageIcon(getClass().getResource("/Recursos/3.png"));
        recursos[13] = new ImageIcon(getClass().getResource("/Recursos/3.png"));
        recursos[14] = new ImageIcon(getClass().getResource("/Recursos/mu.png"));
        recursos[15] = new ImageIcon(getClass().getResource("/Recursos/14.png"));
        enemigosBarra[0] = enem0;
        enemigosBarra[1] = enem1;
        enemigosBarra[2] = enem2;
        villanosSalud[0] = enem0Life;
        villanosSalud[1] = enem1Life;
        villanosSalud[2] = enem02Life;
        heroesBarra[0] = gaticoName;
        heroesBarra[1] = porkyName;
        heroesBarra[2] = CabraName;
        heroesSalud[0] = heroe0Life;
        heroesSalud[1] = heroe1Life;
        heroesSalud[2] = heroe2Life;
        enemigos = seleccionador(bestiario);

        for (int i = 0; i < heroesBarra.length; i++) {
            heroesBarra[i].setText(heroes[i].getNombre());
            heroesSalud[i].setText(heroes[i].getSaludActual() + "/" + heroes[i].getSalud());
            
           
        }
        
        for (int i = 0; i < heroesIconos.length; i++) {
            heroesIconos[i].setText(heroes[i].getNombre());
        }
    }

    
    
    public void atacar(Personaje atacante, Personaje atacado) {
    atacante.atacar(atacado);
        for (int i = 0; i < heroesSalud.length; i++) {
            heroesSalud[i].setText(heroes[i].getSaludActual() + "/" + heroes[i].getSalud());
       }
    
    
    }
    public void atacar(Personaje [] heroes, Personaje[] enemigos) {
    combate.atacarPrimero(heroes, enemigos);
    
    }
    /**
     * 
     * @param heroes
     * @param enemigos
     * @return 
     */
    public void inicioCombate(Personaje [] heroes, Personaje[]enemigos){
    combate.atacarPrimero(heroes, enemigos);
        if (combate.agilidadColectiva(enemigos) > combate.agilidadColectiva(heroes) ) {
            for (int i = 0; i < heroesSalud.length; i++) {
                heroesSalud[i].setText(heroes[i].getSaludActual() + "/" + heroes[i].getSalud());
            }
            
            Estatus.setText("¡Los enemigos son mas agiles, ten cuidado, atacaran primero!");
        }
            
        
    }
            
    /**
     * Seleccionador
     *
     * @param base
     * @return seleccionado
     */
    public Personaje[] seleccionador(Personaje[] base) {
        Personaje[] temporal = new Personaje[3];
        for (int i = 0; i < temporal.length; i++) {
            int posicion = (int) (Math.random() * base.length + 0);
            if (base[posicion] == null) {
                if (posicion == base.length) {
                    posicion -= 1;
                }
                posicion += 1;
            }
            temporal[i] = base[posicion];
            villanos[i].setIcon(recursos[posicion]);
            villanos[i].setText(temporal[i].getNombre());
            for (int j = 0; j < enemigosBarra.length; j++) {
                enemigosBarra[i].setText(temporal[i].getNombre());
                villanosSalud[i].setText(temporal[i].getSaludActual() + "/" + temporal[i].getSalud());
            }

        }
        return temporal;
    }

    Batalla combate = new Batalla();
    Personaje[] bestiario = new Personaje[15];
    Personaje[] enemigos = new Personaje[3];
    Personaje[] heroes = new Personaje[3];
    JLabel[] heroesIconos = new JLabel[3];
    JLabel[] enemigosBarra = new JLabel[3];
    JLabel[] heroesBarra = new JLabel[3];
    //Iconos
    JLabel[] heroesSalud = new JLabel[3];
    JLabel[] villanos = new JLabel[3];
    JLabel[] villanosSalud = new JLabel[3];

    ImageIcon[] recursos = new ImageIcon[16];

    //Heroes;
    Personaje porky = new Personaje("Porky", 1000, 250, 40, 85, 20, true);
    Personaje gato = new Personaje("Misifu", 1000, 250, 40, 85, 20, true);
    Personaje cabrota = new Personaje("Bee-bee", 1000, 250, 40, 85, 50, true);
    Personaje debil = new Personaje("Jefe", 500, 1, 1,10, 10, false);
    Personaje jefe01 = new Personaje(debil);
    Personaje jefe02 = new Personaje(jefe01);
    Personaje jefe03 = new Personaje(jefe02);
    Personaje jefe04 = new Personaje(jefe03);
    Personaje jefe05 = new Personaje(jefe04);
    Personaje jefe06 = new Personaje(jefe05);
    Personaje jefe07 = new Personaje(jefe06);
    Personaje jefe08 = new Personaje(jefe07);
    Personaje jefe09 = new Personaje(jefe08);
    Personaje jefe10 = new Personaje(jefe09);
    Personaje jefe11 = new Personaje(jefe10);
    Personaje jefe12 = new Personaje(jefe11);
    Personaje jefe13 = new Personaje(jefe12);
    Personaje jefe14 = new Personaje(jefe13);
    Personaje jefe15 = new Personaje(jefe14);


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BadGuys;
    private javax.swing.JPanel Battle;
    private javax.swing.JLabel CabraName;
    private javax.swing.JLabel CabraName1;
    private javax.swing.JLabel CabraName3;
    private javax.swing.JLabel CabraName4;
    private javax.swing.JLabel CabraName5;
    private javax.swing.JLabel Estatus;
    private javax.swing.JProgressBar badGuysBar;
    private javax.swing.JPanel cabra1;
    private javax.swing.JLabel cabrote;
    private javax.swing.JLabel enem0;
    private javax.swing.JLabel enem02Life;
    private javax.swing.JLabel enem0Life;
    private javax.swing.JLabel enem1;
    private javax.swing.JLabel enem1Life;
    private javax.swing.JLabel enem2;
    private javax.swing.JLabel enemigosTitle;
    private javax.swing.JLabel gatico;
    private javax.swing.JLabel gaticoName;
    private javax.swing.JLabel gaticoName2;
    private javax.swing.JLabel gaticoName3;
    private javax.swing.JProgressBar goodGuysBar;
    private javax.swing.JLabel heroe0Life;
    private javax.swing.JLabel heroe1Life;
    private javax.swing.JLabel heroe2Life;
    private javax.swing.JLabel heroesTitle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel porkyName;
    private javax.swing.JLabel porkyName2;
    private javax.swing.JLabel porkyName3;
    private javax.swing.JLabel porkyName4;
    private javax.swing.JLabel puerquito;
    // End of variables declaration//GEN-END:variables
}
