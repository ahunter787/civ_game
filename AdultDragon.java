<<<<<<< HEAD
package civilization;
=======
package finalproject;
>>>>>>> jb

import java.awt.Point;

/**
 * AdultDragon.java created by jebraun on Apr 10, 2014 at 1:18:24 PM
 */
<<<<<<< HEAD
public class AdultDragon implements Dragon {
=======
public class AdultDragon extends Dragon {
>>>>>>> jb

    final static int attack = 500;
    final static int defense = 450;
    final static int speed = 4;
    final static int moveChance = 50;
    final static int territory = 2;
    final static int aggro = 70;
    final static int reproRate = 30;
    final static int hoard = 300; //This is arbitrary!
    Point location;

    public AdultDragon(Point p) {
        location = p;
    }

    @Override
<<<<<<< HEAD
    public void doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

=======
    void doAction(Cell[][] grid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
>>>>>>> jb
    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doIAttack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
