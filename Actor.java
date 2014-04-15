/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD
<<<<<<< HEAD
package civilization;
=======
package finalproject;

import java.awt.Point;
>>>>>>> jb
=======
package civilization;
>>>>>>> ah

/**
 *
 * @author jebraun
 */
<<<<<<< HEAD
<<<<<<< HEAD
public interface Actor {
    
    void doAction();
=======
public abstract class Actor {
    
    Point location;
    
    abstract void doAction(Cell[][] grid);
>>>>>>> jb
=======
public interface Actor {
    
    void doAction();
>>>>>>> ah
}
