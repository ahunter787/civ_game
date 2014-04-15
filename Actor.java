/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Point;

/**
 *
 * @author jebraun
 */
public abstract class Actor {
    
    Point location;
    
    abstract void doAction(Cell[][] grid);
}
