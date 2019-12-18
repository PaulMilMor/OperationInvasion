/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operationinvasion;

import com.sun.glass.events.KeyEvent;
import java.applet.AudioClip;
import java.io.InputStream;
import javax.swing.JLabel;

/**
 *
 * @author usuario
 */
public class Board extends javax.swing.JFrame {

   /**
    * Creates new form Board
    */
   
   public Board() {
      
      
      initComponents();
      
      this.fly = new Actions("A",Ship,0);
      Bullet.setLocation(800,900);
      Bullet1.setLocation(800,900);
      Bullet2.setLocation(800,900);
      Bullet3.setLocation(800,900);
      Bullet4.setLocation(800,900);
      Bullet5.setLocation(800,900);
      Bullet6.setLocation(800,900);
      Bullet7.setLocation(800,900);
      Bullet8.setLocation(800,900);
      Bullet9.setLocation(800,900);
      
      this.ammo[0] = Bullet;
      this.ammo[1] = Bullet1;
      this.ammo[2] = Bullet2;
      this.ammo[3] = Bullet3;
      this.ammo[4] = Bullet4;
      this.ammo[5] = Bullet5;
      this.ammo[6] = Bullet6;
      this.ammo[7] = Bullet7;
      this.ammo[8] = Bullet8;
      this.ammo[9] = Bullet9;
      
      music.loop();
      this.aliens[0] = new Invader(target,100);
      this.aliens[1] = new Invader(target14,100);
      this.aliens[2] = new Invader(target15,100);
      this.aliens[3] = new Invader(target16,100);
      this.aliens[4] = new Invader(target17,100);
      this.aliens[5] = new Invader(target18,100);
      this.aliens[6] = new Invader(target19,100);
      this.aliens[7] = new Invader(target20,100);
      this.aliens[8] = new Invader(target21,100);
      this.aliens[9] = new Invader(target22,100);
      this.aliens[10] = new Invader(target23,100);
      this.aliens[11] = new Invader(target24,100);
      this.aliens[12] = new Invader(target25,100);
      this.aliens[13] = new Invader(target48,100);
      this.aliens[14] = new Invader(target49,100);
      this.aliens[15] = new Invader(target50,100);
      this.aliens[16] = new Invader(target51,100);
      this.aliens[17] = new Invader(target52,100);
      this.aliens[18] = new Invader(target53,100);
      this.aliens[19] = new Invader(target54,100);
      this.aliens[20] = new Invader(target55,100);
      this.aliens[21] = new Invader(target56,100);
      this.aliens[22] = new Invader(target57,150);
      this.aliens[23] = new Invader(target4,150);
      this.aliens[24] = new Invader(target5,150);
      this.aliens[25] = new Invader(target6,150);
      this.aliens[26] = new Invader(target7,150);
      this.aliens[27] = new Invader(target8,150);
      this.aliens[28] = new Invader(target9,150);
      this.aliens[29] = new Invader(target10,150);
      this.aliens[30] = new Invader(target11,150);
      this.aliens[31] = new Invader(target12,150);
      this.aliens[32] = new Invader(target13,150);
      this.aliens[33] = new Invader(target26,50);
      this.aliens[34] = new Invader(target27,50);
      this.aliens[35] = new Invader(target28,50);
      this.aliens[36] = new Invader(target29,50);
      this.aliens[37] = new Invader(target30,50);
      this.aliens[38] = new Invader(target31,50);
      this.aliens[39] = new Invader(target32,50);
      this.aliens[40] = new Invader(target33,50);
      this.aliens[41] = new Invader(target34,50);
      this.aliens[42] = new Invader(target35,50);
      this.aliens[43] = new Invader(target36,50);
      this.aliens[44] = new Invader(target37,50);
      this.aliens[45] = new Invader(target38,50);
      this.aliens[46] = new Invader(target39,50);
      this.aliens[47] = new Invader(target40,50);
      this.aliens[48] = new Invader(target41,50);
      this.aliens[49] = new Invader(target42,50);
      this.aliens[50] = new Invader(target43,50);
      this.aliens[51] = new Invader(target44,50);
      this.aliens[52] = new Invader(target45,50);
      this.aliens[53] = new Invader(target46,50);
      this.aliens[54] = new Invader(target47,50);
      this.move = new Actions("C",Bullet,Ship,this,aliens,music,Lives);
     // move.start();
      Ship.setVisible(false);
     Lives.setVisible(false);
     Score.setVisible(false);
     HScore.setVisible(false);
     target.setVisible(false);
     target4.setVisible(false);
     target5.setVisible(false);
     target6.setVisible(false);
     target7.setVisible(false);
     target7.setVisible(false);
target8.setVisible(false);
target9.setVisible(false);
target10.setVisible(false);
target11.setVisible(false);
target12.setVisible(false);
target13.setVisible(false);
target14.setVisible(false);
target15.setVisible(false);
target16.setVisible(false);
target17.setVisible(false);
target18.setVisible(false);
target19.setVisible(false);
target20.setVisible(false);
target21.setVisible(false);
target22.setVisible(false);
target23.setVisible(false);
target24.setVisible(false);
target25.setVisible(false);
target26.setVisible(false);
target27.setVisible(false);
target28.setVisible(false);
target29.setVisible(false);
target30.setVisible(false);
target31.setVisible(false);
target32.setVisible(false);
target33.setVisible(false);
target34.setVisible(false);
target35.setVisible(false);
target36.setVisible(false);
target37.setVisible(false);
target38.setVisible(false);
target39.setVisible(false);
target40.setVisible(false);
target41.setVisible(false);
target42.setVisible(false);
target43.setVisible(false);
target44.setVisible(false);
target45.setVisible(false);
target46.setVisible(false);
target47.setVisible(false);
target48.setVisible(false);
target49.setVisible(false);
target50.setVisible(false);
target51.setVisible(false);
target52.setVisible(false);
target53.setVisible(false);
target54.setVisible(false);
target55.setVisible(false);
target56.setVisible(false);
target57.setVisible(false);
Bullet.setVisible(false);
Bullet1.setVisible(false);
Bullet2.setVisible(false);
Bullet3.setVisible(false);
Bullet4.setVisible(false);
Bullet5.setVisible(false);
Bullet6.setVisible(false);
Bullet7.setVisible(false);
Bullet8.setVisible(false);
Bullet9.setVisible(false);

   }
   JLabel[] ammo = new JLabel[10];
   Actions[] trigger = new Actions[ammo.length];
   Invader[] aliens = new Invader[55];
   AudioClip music=java.applet.Applet.newAudioClip(getClass().getResource("ntfc.wav"));
   AudioClip shot = java.applet.Applet.newAudioClip(getClass().getResource("shot.wav"));
   AudioClip boom = java.applet.Applet.newAudioClip(getClass().getResource("boom.wav"));
   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      Ship = new javax.swing.JLabel();
      Score = new javax.swing.JTextField();
      Bullet = new javax.swing.JLabel();
      Bullet1 = new javax.swing.JLabel();
      Bullet2 = new javax.swing.JLabel();
      Bullet3 = new javax.swing.JLabel();
      Bullet4 = new javax.swing.JLabel();
      Bullet5 = new javax.swing.JLabel();
      Bullet6 = new javax.swing.JLabel();
      Bullet7 = new javax.swing.JLabel();
      Bullet8 = new javax.swing.JLabel();
      Bullet9 = new javax.swing.JLabel();
      target = new javax.swing.JLabel();
      target4 = new javax.swing.JLabel();
      target5 = new javax.swing.JLabel();
      target6 = new javax.swing.JLabel();
      target7 = new javax.swing.JLabel();
      target8 = new javax.swing.JLabel();
      target9 = new javax.swing.JLabel();
      target10 = new javax.swing.JLabel();
      target11 = new javax.swing.JLabel();
      target12 = new javax.swing.JLabel();
      target13 = new javax.swing.JLabel();
      target14 = new javax.swing.JLabel();
      target15 = new javax.swing.JLabel();
      target16 = new javax.swing.JLabel();
      target17 = new javax.swing.JLabel();
      target18 = new javax.swing.JLabel();
      target19 = new javax.swing.JLabel();
      target20 = new javax.swing.JLabel();
      target21 = new javax.swing.JLabel();
      target22 = new javax.swing.JLabel();
      target23 = new javax.swing.JLabel();
      target24 = new javax.swing.JLabel();
      target25 = new javax.swing.JLabel();
      target26 = new javax.swing.JLabel();
      target27 = new javax.swing.JLabel();
      target28 = new javax.swing.JLabel();
      target29 = new javax.swing.JLabel();
      target30 = new javax.swing.JLabel();
      target31 = new javax.swing.JLabel();
      target32 = new javax.swing.JLabel();
      target33 = new javax.swing.JLabel();
      target34 = new javax.swing.JLabel();
      target35 = new javax.swing.JLabel();
      target36 = new javax.swing.JLabel();
      target37 = new javax.swing.JLabel();
      target38 = new javax.swing.JLabel();
      target39 = new javax.swing.JLabel();
      target40 = new javax.swing.JLabel();
      target41 = new javax.swing.JLabel();
      target42 = new javax.swing.JLabel();
      target43 = new javax.swing.JLabel();
      target44 = new javax.swing.JLabel();
      target45 = new javax.swing.JLabel();
      target46 = new javax.swing.JLabel();
      target47 = new javax.swing.JLabel();
      target48 = new javax.swing.JLabel();
      target49 = new javax.swing.JLabel();
      target50 = new javax.swing.JLabel();
      target51 = new javax.swing.JLabel();
      target52 = new javax.swing.JLabel();
      target53 = new javax.swing.JLabel();
      target54 = new javax.swing.JLabel();
      target55 = new javax.swing.JLabel();
      target56 = new javax.swing.JLabel();
      target57 = new javax.swing.JLabel();
      jLabel1 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      titulo = new javax.swing.JLabel();
      exit = new javax.swing.JButton();
      newgame = new javax.swing.JButton();
      Lives = new javax.swing.JTextField();
      Fondo = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      HScore = new javax.swing.JTextField();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Space Invaders");
      setResizable(false);
      setSize(new java.awt.Dimension(600, 600));
      addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            formKeyPressed(evt);
         }
         public void keyReleased(java.awt.event.KeyEvent evt) {
            formKeyReleased(evt);
         }
         public void keyTyped(java.awt.event.KeyEvent evt) {
            formKeyTyped(evt);
         }
      });
      getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      Ship.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
      Ship.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Milano.gif"))); // NOI18N
      Ship.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            ShipKeyPressed(evt);
         }
      });
      getContentPane().add(Ship, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 50, 50));

      Score.setEditable(false);
      Score.setBackground(new java.awt.Color(0, 0, 0));
      Score.setFont(new java.awt.Font("Pokemon DPPt", 1, 24)); // NOI18N
      Score.setForeground(new java.awt.Color(255, 255, 255));
      Score.setText("0");
      Score.setBorder(null);
      Score.setDisabledTextColor(new java.awt.Color(255, 255, 255));
      Score.setEnabled(false);
      getContentPane().add(Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 120, 50));

      Bullet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/beam.gif"))); // NOI18N
      getContentPane().add(Bullet, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 10, 23));

      Bullet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/beam.gif"))); // NOI18N
      getContentPane().add(Bullet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 10, 23));

      Bullet2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/beam.gif"))); // NOI18N
      getContentPane().add(Bullet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 10, 23));

      Bullet3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/beam.gif"))); // NOI18N
      getContentPane().add(Bullet3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 10, 20));

      Bullet4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/beam.gif"))); // NOI18N
      getContentPane().add(Bullet4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 10, 23));

      Bullet5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/beam.gif"))); // NOI18N
      getContentPane().add(Bullet5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 10, 23));

      Bullet6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/beam.gif"))); // NOI18N
      getContentPane().add(Bullet6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 10, 23));

      Bullet7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/beam.gif"))); // NOI18N
      getContentPane().add(Bullet7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 10, 23));

      Bullet8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/beam.gif"))); // NOI18N
      getContentPane().add(Bullet8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 10, 23));

      Bullet9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/beam.gif"))); // NOI18N
      getContentPane().add(Bullet9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 10, 23));

      target.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 50, 50));

      target4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Than.gif"))); // NOI18N
      getContentPane().add(target4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 50, 50));

      target5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Than.gif"))); // NOI18N
      getContentPane().add(target5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 50, 50));

      target6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Than.gif"))); // NOI18N
      getContentPane().add(target6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 50, 50));

      target7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Than.gif"))); // NOI18N
      getContentPane().add(target7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 50, 50));

      target8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Than.gif"))); // NOI18N
      getContentPane().add(target8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 50, 50));

      target9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Than.gif"))); // NOI18N
      getContentPane().add(target9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 50, 50));

      target10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Than.gif"))); // NOI18N
      getContentPane().add(target10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 50, 50));

      target11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Than.gif"))); // NOI18N
      getContentPane().add(target11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 50, 50));

      target12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Than.gif"))); // NOI18N
      getContentPane().add(target12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 50, 50));

      target13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Than.gif"))); // NOI18N
      getContentPane().add(target13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 50, 50));

      target14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

      target15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 50, 50));

      target16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 50, 50));

      target17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 50, 50));

      target18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 50, 50));

      target19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 50, 50));

      target20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 50, 50));

      target21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 50, 50));

      target22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 50, 50));

      target23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target23, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 50, 50));

      target24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target24, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 50, 50));

      target25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 50, 50));

      target26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 50, 50));

      target27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 50, 50));

      target28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target28, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 50, 50));

      target29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target29, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 50, 50));

      target30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target30, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 50, 50));

      target31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target31, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 50, 50));

      target32.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target32, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 50, 50));

      target33.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target33, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 50, 50));

      target34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target34, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 50, 50));

      target35.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target35, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 50, 50));

      target36.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target36, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 50, 50));

      target37.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target37, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 50, 50));

      target38.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target38, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 50, 50));

      target39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target39, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 50, 50));

      target40.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target40, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 50, 50));

      target41.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target41, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 50, 50));

      target42.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target42, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 50, 50));

      target43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target43, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 50, 50));

      target44.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target44, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 50, 50));

      target45.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target45, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 50, 50));

      target46.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target46, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 50, 50));

      target47.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Sovereign.gif"))); // NOI18N
      getContentPane().add(target47, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 50, 50));

      target48.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target48, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 50, 50));

      target49.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target49, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 50, 50));

      target50.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target50, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 50, 50));

      target51.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target51, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 50, 50));

      target52.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target52, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 50, 50));

      target53.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target53, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 50, 50));

      target54.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target54, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 50, 50));

      target55.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target55, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 50, 50));

      target56.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Qship.gif"))); // NOI18N
      getContentPane().add(target56, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 50, 50));

      target57.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      target57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/Than.gif"))); // NOI18N
      getContentPane().add(target57, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 50, 50));

      jLabel1.setBackground(new java.awt.Color(0, 0, 0));
      jLabel1.setFont(new java.awt.Font("Pokemon DPPt", 1, 24)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(255, 255, 255));
      jLabel1.setText("LIVES:");
      getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

      jLabel3.setBackground(new java.awt.Color(0, 0, 0));
      jLabel3.setFont(new java.awt.Font("Pokemon DPPt", 1, 24)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(255, 255, 255));
      jLabel3.setText("SCORE:");
      getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

      titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/titulo.png"))); // NOI18N
      getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

      exit.setBackground(new java.awt.Color(0, 0, 204));
      exit.setFont(new java.awt.Font("Pokemon DPPt", 1, 36)); // NOI18N
      exit.setForeground(new java.awt.Color(255, 255, 255));
      exit.setText("SALIR");
      exit.setBorder(null);
      exit.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            exitActionPerformed(evt);
         }
      });
      getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 470, 50));

      newgame.setBackground(new java.awt.Color(204, 0, 0));
      newgame.setFont(new java.awt.Font("Pokemon DPPt", 1, 36)); // NOI18N
      newgame.setForeground(new java.awt.Color(255, 255, 255));
      newgame.setText("NUEVO JUEGO");
      newgame.setBorder(null);
      newgame.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            newgameMouseClicked(evt);
         }
      });
      getContentPane().add(newgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 470, 50));

      Lives.setEditable(false);
      Lives.setBackground(new java.awt.Color(0, 0, 0));
      Lives.setFont(new java.awt.Font("Pokemon DPPt", 1, 24)); // NOI18N
      Lives.setForeground(new java.awt.Color(255, 255, 255));
      Lives.setText("5");
      Lives.setBorder(null);
      Lives.setDisabledTextColor(new java.awt.Color(255, 255, 255));
      Lives.setEnabled(false);
      getContentPane().add(Lives, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 40, 50));

      Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operationinvasion/spaces.gif"))); // NOI18N
      getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -260, 770, 920));

      jLabel2.setBackground(new java.awt.Color(0, 0, 0));
      jLabel2.setFont(new java.awt.Font("Pokemon DPPt", 1, 24)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(255, 255, 255));
      jLabel2.setText("HIGHEST SCORE:");
      getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

      HScore.setEditable(false);
      HScore.setBackground(new java.awt.Color(0, 0, 0));
      HScore.setFont(new java.awt.Font("Pokemon DPPt", 1, 24)); // NOI18N
      HScore.setForeground(new java.awt.Color(255, 255, 255));
      HScore.setText("0");
      HScore.setBorder(null);
      HScore.setDisabledTextColor(new java.awt.Color(255, 255, 255));
      HScore.setEnabled(false);
      getContentPane().add(HScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 120, 50));

      pack();
   }// </editor-fold>//GEN-END:initComponents
Actions shoot, move,fly;
boolean moving;
   private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
      // TODO add your handling code here:
      
      if(evt.getKeyCode() == KeyEvent.VK_RIGHT || evt.getKeyCode()==KeyEvent.VK_D){
         
         if(evt.isShiftDown()){
            fly.setSpeed(10);
         }
         else{
         fly.setSpeed(7);
         }
         
      }
      if(evt.getKeyCode() == KeyEvent.VK_LEFT || evt.getKeyCode()== KeyEvent.VK_A){
         
         
         if(evt.isShiftDown()){
            fly.setSpeed(-10);
         }
         else{
         fly.setSpeed(-7);
         }
      }
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         move.start();
         fly.start();
         
      }
      if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
         System.exit(0);
      }
   }//GEN-LAST:event_formKeyPressed

   private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
      // TODO add your handling code here:
      
      
   }//GEN-LAST:event_formKeyTyped

   private void ShipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ShipKeyPressed
      // TODO add your handling code here:

   }//GEN-LAST:event_ShipKeyPressed

   private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
      // TODO add your handling code here:
      if(evt.getKeyCode() == KeyEvent.VK_SPACE){
         shot.play();
         this.trigger[0] =new Actions("B",ammo[0],aliens,Ship,Score,boom,move);
          
         trigger[0].start();
         JLabel temp = ammo[0];
         Actions tempp = trigger[0];
         for (int i = 0; i < ammo.length; i++) {
            if(i==9){
               ammo[i] = temp;
               trigger[i] = tempp;
            }
            else{
               ammo[i] = ammo[i+1];
               trigger[i] = trigger[i+1];
            }
         }
         
      }
      if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
         fly.setSpeed(0);
      }
      if(evt.getKeyCode()==KeyEvent.VK_LEFT){
         fly.setSpeed(0);
      }
      
   }//GEN-LAST:event_formKeyReleased

   private void newgameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newgameMouseClicked
      // TODO add your handling code here:
      newgame.setVisible(false);
           newgame.setEnabled(false);
           exit.setVisible(false);
           exit.setEnabled(false);
                target.setVisible(true);
     target4.setVisible(true);
     target5.setVisible(true);
     target6.setVisible(true);
     target7.setVisible(true);
     target7.setVisible(true);
target8.setVisible(true);
target9.setVisible(true);
target10.setVisible(true);
target11.setVisible(true);
target12.setVisible(true);
target13.setVisible(true);
target14.setVisible(true);
target15.setVisible(true);
target16.setVisible(true);
target17.setVisible(true);
target18.setVisible(true);
target19.setVisible(true);
target20.setVisible(true);
target21.setVisible(true);
target22.setVisible(true);
target23.setVisible(true);
target24.setVisible(true);
target25.setVisible(true);
target26.setVisible(true);
target27.setVisible(true);
target28.setVisible(true);
target29.setVisible(true);
target30.setVisible(true);
target31.setVisible(true);
target32.setVisible(true);
target33.setVisible(true);
target34.setVisible(true);
target35.setVisible(true);
target36.setVisible(true);
target37.setVisible(true);
target38.setVisible(true);
target39.setVisible(true);
target40.setVisible(true);
target41.setVisible(true);
target42.setVisible(true);
target43.setVisible(true);
target44.setVisible(true);
target45.setVisible(true);
target46.setVisible(true);
target47.setVisible(true);
target48.setVisible(true);
target49.setVisible(true);
target50.setVisible(true);
target51.setVisible(true);
target52.setVisible(true);
target53.setVisible(true);
target54.setVisible(true);
target55.setVisible(true);
target56.setVisible(true);
target57.setVisible(true);
     Ship.setVisible(true);
     Lives.setVisible(true);
     Score.setVisible(true);
     HScore.setVisible(true);
     titulo.setVisible(false);
     Bullet.setVisible(true);
     Bullet1.setVisible(true);
     Bullet2.setVisible(true);
     Bullet3.setVisible(true);
     Bullet4.setVisible(true);
     Bullet5.setVisible(true);
     Bullet6.setVisible(true);
     Bullet7.setVisible(true);
     Bullet8.setVisible(true);
     Bullet9.setVisible(true);
           move.jf.requestFocusInWindow();
           move.start();
           fly.start();
      
   }//GEN-LAST:event_newgameMouseClicked

   private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      // TODO add your handling code here:
      System.exit(0);
   }//GEN-LAST:event_exitActionPerformed

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
         java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new Board().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel Bullet;
   private javax.swing.JLabel Bullet1;
   private javax.swing.JLabel Bullet2;
   private javax.swing.JLabel Bullet3;
   private javax.swing.JLabel Bullet4;
   private javax.swing.JLabel Bullet5;
   private javax.swing.JLabel Bullet6;
   private javax.swing.JLabel Bullet7;
   private javax.swing.JLabel Bullet8;
   private javax.swing.JLabel Bullet9;
   private javax.swing.JLabel Fondo;
   private javax.swing.JTextField HScore;
   private javax.swing.JTextField Lives;
   private javax.swing.JTextField Score;
   private javax.swing.JLabel Ship;
   private javax.swing.JButton exit;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JButton newgame;
   private javax.swing.JLabel target;
   private javax.swing.JLabel target10;
   private javax.swing.JLabel target11;
   private javax.swing.JLabel target12;
   private javax.swing.JLabel target13;
   private javax.swing.JLabel target14;
   private javax.swing.JLabel target15;
   private javax.swing.JLabel target16;
   private javax.swing.JLabel target17;
   private javax.swing.JLabel target18;
   private javax.swing.JLabel target19;
   private javax.swing.JLabel target20;
   private javax.swing.JLabel target21;
   private javax.swing.JLabel target22;
   private javax.swing.JLabel target23;
   private javax.swing.JLabel target24;
   private javax.swing.JLabel target25;
   private javax.swing.JLabel target26;
   private javax.swing.JLabel target27;
   private javax.swing.JLabel target28;
   private javax.swing.JLabel target29;
   private javax.swing.JLabel target30;
   private javax.swing.JLabel target31;
   private javax.swing.JLabel target32;
   private javax.swing.JLabel target33;
   private javax.swing.JLabel target34;
   private javax.swing.JLabel target35;
   private javax.swing.JLabel target36;
   private javax.swing.JLabel target37;
   private javax.swing.JLabel target38;
   private javax.swing.JLabel target39;
   private javax.swing.JLabel target4;
   private javax.swing.JLabel target40;
   private javax.swing.JLabel target41;
   private javax.swing.JLabel target42;
   private javax.swing.JLabel target43;
   private javax.swing.JLabel target44;
   private javax.swing.JLabel target45;
   private javax.swing.JLabel target46;
   private javax.swing.JLabel target47;
   private javax.swing.JLabel target48;
   private javax.swing.JLabel target49;
   private javax.swing.JLabel target5;
   private javax.swing.JLabel target50;
   private javax.swing.JLabel target51;
   private javax.swing.JLabel target52;
   private javax.swing.JLabel target53;
   private javax.swing.JLabel target54;
   private javax.swing.JLabel target55;
   private javax.swing.JLabel target56;
   private javax.swing.JLabel target57;
   private javax.swing.JLabel target6;
   private javax.swing.JLabel target7;
   private javax.swing.JLabel target8;
   private javax.swing.JLabel target9;
   private javax.swing.JLabel titulo;
   // End of variables declaration//GEN-END:variables
}
