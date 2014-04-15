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
 * ElderDragon.java created by jebraun on Apr 10, 2014 at 1:22:33 PM
 */
<<<<<<< HEAD
<<<<<<< HEAD
public class ElderDragon implements Dragon {
=======
public class ElderDragon extends Dragon {
>>>>>>> jb
=======
public class ElderDragon implements Dragon {
>>>>>>> ah

    final static int attack = 900;
    final static int defense = 850;
    final static int speed = 2;
    final static int moveChance = 20;
    final static int territory = 3;
    final static int aggro = 50;
    final static int reproRate = 10;
    final static int hoard = 500; //This is arbitrary!
    Point location;

    public ElderDragon(Point p) {
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
    public boolean doIAttack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
