/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD
package civilization;
=======
package finalproject;

import java.awt.Point;
>>>>>>> jb

/**
 *
 * @author jebraun
 */
<<<<<<< HEAD
public interface Actor {
    
    void doAction();
=======
public abstract class Actor {
    
    Point location;
    
    abstract void doAction(Cell[][] grid);
>>>>>>> jb
}
