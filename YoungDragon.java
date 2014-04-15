<<<<<<< HEAD
package civilization;
=======
package finalproject;
>>>>>>> jb

import java.awt.Point;

/**
 * YoungDragon.java created by jebraun on Apr 10, 2014 at 1:11:59 PM
 */
<<<<<<< HEAD
public class YoungDragon implements Dragon {
=======
public class YoungDragon extends Dragon {
>>>>>>> jb

    final static int attack = 200;
    final static int defense = 150;
    final static int speed = 5;
    final static int moveChance = 70;
    final static int territory = 1;
    final static int aggro = 95;
    final static int reproRate = 0;
    final static int hoard = 100; //This is arbitrary!
    Point location;

    public YoungDragon(Point p) {
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
<<<<<<< HEAD
    public void attack() {
=======
    public boolean doIAttack() {
>>>>>>> jb
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
<<<<<<< HEAD
    public boolean doIAttack() {
=======
    public void attack() {
>>>>>>> jb
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
