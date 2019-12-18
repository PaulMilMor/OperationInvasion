
package operationinvasion;

import java.applet.AudioClip;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Inzunza, Guel, Millanes
 */
public class Actions extends Thread{
   String tipo;
   JLabel shot, target, ship;
   JFrame jf;
   int y;
   int dy=3;
   int dx = 3;
   int speed;
   Invader[] aliens;
   JLabel[] bullets;
   boolean isMoving;
   AudioClip music;
   AudioClip boom;
   JTextField score;
   static double dxt = 7;
   Actions move, bullet;
   static int coords[][];
   JTextField lives;
   
  
//Constructor tipo A, para llevar a cabo el movimiento de la nave
   public Actions(String tipo, JLabel ship, int speed) {
      this.tipo = tipo;
      this.ship = ship;
      this.speed = speed;
   }
//Constructor tipo B, para llevar a cabo el movimiento de los disparos   
   public Actions(String tipo, JLabel shot,  Invader[] aliens,JLabel ship, JTextField score, AudioClip boom, Actions move) {
      this.tipo = tipo;
      this.shot = shot;
      this.ship = ship;
      this.aliens = aliens;
      this.score = score;
      this.boom = boom;
      this.move = move;
   }

//Constructor tipo C, para llevar a cabo el movimiento de los invasores   
   public Actions(String tipo, JLabel shot, JLabel ship, JFrame jf, Invader[] aliens, AudioClip music, JTextField lives) {
      this.tipo = tipo;
      this.shot = shot;
      this.ship = ship;
      this.jf = jf;
      this.aliens = aliens;
      this.music = music;
      this.lives = lives;
      
   }

   public int getSpeed() {
      return speed;
   }

   public void setSpeed(int speed) {
      this.speed = speed;
   }

   public boolean isItMoving() {
      return isMoving;
   }

   public void setItMoving(boolean isMoving) {
      this.isMoving = isMoving;
   }
   
   
   
   public void run(){
      if(tipo.equals("A")){ 
//Este tipo de hilo se encarga de manipular el movimiento de la nave
         int xship = ship.getX();
         int yship = ship.getY();
//Aquí se obtienen las coordenadas de la nave al momento de iniciar el hilo.        
         while(xship<700 && xship>5){
            if(speed==10 && xship >689){
               ship.setLocation(699,yship);
            }
            else if(speed==-10 && xship<16){
               ship.setLocation(6,yship);
            }
            else if(speed==5 && xship>694){
               ship.setLocation(699,yship);
            }
            else if(speed==-5 && xship<11){
               ship.setLocation(6,yship);
            }
//Todos estos if se encargan de que la nave no se salga de los límites
            else{
            ship.setLocation(xship+=speed,yship);
//Esta línea mueve la nave en el eje x cada 60ms de acuerdo a su velocidad (5,10,-5,-10)
            }
            
            try {
               sleep(60);
            } catch (InterruptedException ex) {
               Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
      }
      
      
      
      if(tipo.equals("B") && move.isItMoving()){
//Este tipo de hilo se encarga de mover los disparos de la nave         
//Además verifica que los aliens aún se estén moviendo para poder ejecutarse (de lo contrario se puede hacer trampa)         
         shot.setLocation(ship.getX()+22,ship.  getY());
//El disparo se ubica en el centro de la nave         
         int xshot = shot.getX();
         int yshot = shot.getY();
         int empt=0;
         
         while(yshot>5){
         
            shot.setLocation(xshot, yshot-=5);
//Mientras el disparo tenga una altura mayor a 5 se mueve 5 pixeles cada 25ms   
            for (int i = 0; i < aliens.length; i++) {
               
               if(shot.getX()>aliens[i].getShip().getX() && shot.getX()<aliens[i].getShip().getX()+43 && shot.getY()>aliens[i].getShip().getY() && shot.getY()<aliens[i].getShip().getY()+43){
                  boom.play();
                  int nscore = Integer.parseInt(score.getText());
                  int updatescore = nscore + aliens[i].getType();
                  score.setText(""+updatescore);
                  aliens[i].getShip().setLocation(800,800);
//Se verifica si el disparo golpeó un invasor y, en caso afirmativo, éste se envía fuera de los márgenes del Frame                  
            for (int j = 0; j < aliens.length; j++) {
                     
               if((aliens[j].getShip().getX()!=800) && (aliens[j].getShip().getY() !=800)){
                        empt++;
               }    
            }
            
            yshot=0;
//Se configura la altura del disparo para poder salir del while            
            if(empt==0){
               
               System.out.println("Win");
               lives.setText("0");
               dxt = 8;
                        // cccc=false;
               move.jf.dispose();
               Board b = new Board();
               b.setVisible(true);
               }
               
            }
         }
         
         try {
            sleep(25);
         } catch (InterruptedException ex) {
            Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         }
         
         shot.setLocation(800,1000);
//Una vez que el disparo cumple su proposito se manda fuera de los margenes del Frame         
      }
      if(tipo.equals("C")){
//Este tipo de hilo se encarga de manipular el movimiento de los invasores         
         
         coords = new int[aliens.length][2];
         for (int i = 0; i < aliens.length; i++) {
         
            coords[i][0] = aliens[i].getShip().getX();
            coords[i][1] = aliens[i].getShip().getY();
//En este for se almacenan las coordenadas de todos los invasores
         }
         
         boolean direc = true;
//Este boolean determina la dirección de las naves(true=derecha, false=izquierda)
         boolean colision = true;
//Este boolean determina si alguno de los invasores ha tocado el límite en X del Frame(true=no ha tocado, false=ya tocó) 
         isMoving = true;
         
         while(isMoving){
//Este boolean determina si los invasores deben seguir moviendose o no            
            
            if(direc){
               colision = true;
//Ya que acaba de iniciar es lógico que no ha tocado el límite
               
               while(colision){
               
                  for (int i = 0; i < aliens.length; i++) {
                  
                     if(!(aliens[i].getShip().getX()>770) && !(aliens[i].getShip().getY()>770)){
                     
                        if(coords[i][0]>=700) colision=false;
//Se verifica si algun invasor toca el límite y se encuentra dentro de él.
                     }
                   }
                   
                  for (int i = 0; i < aliens.length; i++) {
                  
                     if(!(aliens[i].getShip().getX()>770) && !(aliens[i].getShip().getY()>770)){
                     
                        if(colision){aliens[i].getShip().setLocation(coords[i][0]+=dxt,coords[i][1]);}
//Una vez verificado que no hay colision se mueven los invasores de acuerdo a                    
                      }
                   }
                   try {
                      sleep(70);
                   } catch (InterruptedException ex) {
                      Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
                   }
                }
                
               for (int i = 0; i < aliens.length; i++) {
               
                  coords[i][1]+=25;
//Cuando se da una colisión, los invasores se mueven 25 pixeles hacia abajo
                   
                   if(!(aliens[i].getShip().getX()>770) && !(aliens[i].getShip().getY()>770)){
                   
                      if(coords[i][1]+40>=ship.getY()){
                      
                      aliens[i].getShip().setLocation(800,800);
//Este if verifica si algún invasor pasó del borde protegido por la nave
                      int nlives = Integer.parseInt(lives.getText());
                      int updatelives = nlives-1;
//Se almacena el número de vidas de la nave y se disminuye en uno si un invasor cruza el límite                      
                      lives.setText(""+updatelives);
                      
                      if(Integer.parseInt(lives.getText())<=0){
//Cuando el número de vidas llega a 0 se ejecuta este if                         
                         lives.setText("0");
                         dxt = 8;
                         isMoving=false;
                         int resp = JOptionPane.showConfirmDialog(null,"¿Desea volver a jugar?","Has perdido", JOptionPane.YES_NO_OPTION);
                         
                         if(resp==0){
                            jf.dispose();
                            Board b = new Board();
                            b.setVisible(true);
                         }
                         
                         else{
                            System.exit(0);
                         }
                         
                      }
                      }
                   }
                   
                }
                dxt*=1.2;
                direc=false;
                
             }
             
             else{
                colision = true;
//Ya que acaba de iniciar es lógico que no ha tocado el límite 

                while(colision){
                   
                   for (int i = 0; i < aliens.length; i++) {
                      
                      if(!(aliens[i].getShip().getX()>770) && !(aliens[i].getShip().getY()>770)){
                      
                         if(coords[i][0]<=5) colision =false;
//Se verifica si algun invasor toca el límite y se encuentra dentro de él.
                      }
                   }
                   
                   for (int i = 0; i < aliens.length; i++) {
                      
                      if(!(aliens[i].getShip().getX()>770) && !(aliens[i].getShip().getY()>770)){
                        aliens[i].getShip().setLocation(coords[i][0]-=dxt,coords[i][1]);
//Una vez verificado que no hay colision se mueven los invasores de acuerdo a                    
                      }
                   }
                   
                   try {
                      sleep(70);
                   } catch (InterruptedException ex) {
                      Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
                   }
                }
                        
                for (int i = 0; i < aliens.length; i++) {
                   coords[i][1]+=25;
//Cuando se da una colisión, los invasores se mueven 25 pixeles hacia abajo

                   if(!(aliens[i].getShip().getX()>770) && !(aliens[i].getShip().getY()>770)){
                   
                      if(coords[i][1]+40>=ship.getY()){
//Este if verifica si algún invasor pasó del borde protegido por la nave
                      
                      aliens[i].getShip().setLocation(800,800);
                      int nlives = Integer.parseInt(lives.getText());
                      int updatelives = nlives-1;
//Se almacena el número de vidas de la nave y se disminuye en uno si un invasor cruza el límite                      
                      lives.setText(""+updatelives);
                      
                      if(Integer.parseInt(lives.getText())<=0){
//Cuando el número de vidas llega a 0 se ejecuta este if                         

                         lives.setText("0");
                         dxt = 8;
                         isMoving=false;
                         int resp = JOptionPane.showConfirmDialog(null,"¿Desea volver a jugar?","Has perdido", JOptionPane.YES_NO_OPTION);
                         if(resp==0){
                            jf.dispose();
                            Board b = new Board();
                            b.setVisible(true);
                         }
                         else{
                            System.exit(0);
                         }
                         
                      }
                      
                    }
                   }
                   
                }
                dxt*=1.2;
                direc=true;
             }
          } 
         }
        
      
             
   }
}
