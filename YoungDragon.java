<<<<<<< HEAD
<<<<<<< HEAD
package civilization;
=======
package finalproject;
>>>>>>> jb
=======
package civilization;
>>>>>>> ah

import java.awt.Point;

/**
 * YoungDragon.java created by jebraun on Apr 10, 2014 at 1:11:59 PM
 */
<<<<<<< HEAD
<<<<<<< HEAD
public class YoungDragon implements Dragon {
=======
public class YoungDragon extends Dragon {
>>>>>>> jb
=======
public class YoungDragon implements Dragon {
>>>>>>> ah

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
<<<<<<< HEAD
=======
>>>>>>> ah
    public void doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

<<<<<<< HEAD
=======
    void doAction(Cell[][] grid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
>>>>>>> jb
=======
>>>>>>> ah
    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
<<<<<<< HEAD
<<<<<<< HEAD
    public void attack() {
=======
    public boolean doIAttack() {
>>>>>>> jb
=======
    public void attack() {
>>>>>>> ah
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
<<<<<<< HEAD
<<<<<<< HEAD
    public boolean doIAttack() {
=======
    public void attack() {
>>>>>>> jb
=======
    public boolean doIAttack() {
>>>>>>> ah
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
