/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operationinvasion;

import javax.swing.JLabel;

/**
 *
 * @author usuario
 */
public class Invader {
   JLabel ship;
   int type;

   public Invader(JLabel ship, int type) {
      this.ship = ship;
      this.type = type;
   }

   public JLabel getShip() {
      return ship;
   }

   public void setShip(JLabel ship) {
      this.ship = ship;
   }

   public int getType() {
      return type;
   }

   public void setType(int type) {
      this.type = type;
   }
   
}
