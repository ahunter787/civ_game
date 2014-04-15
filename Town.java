/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author jebraun
 */
public class Town {

    Player myPlayer;
    int recources;
    int reach;
    int pop;
    Point location;

    public Town(Player mine, Point p) {
        myPlayer = mine;
        location = p;
        recources = 0;
    }

    void collectRecources(Cell[][] grid) {
        ArrayList<Cell> recCells = getRecCells(grid);
        for (Cell cell : recCells) {
            recources += gather(cell);
        }
    }

    private ArrayList<Cell> getRecCells(Cell[][] grid) {
        ArrayList<Cell> returnMe = new ArrayList<>();
        for (int i = location.x - reach; i < location.x + reach; i++) {
            for (int j = location.y - reach; j < location.y + reach; j++) {
                if (grid[i][j].recources > 0) {
                    returnMe.add(grid[i][j]);
                }
            }
        }
        return returnMe;
    }

    private int gather(Cell c) {
        int returnMe = Math.min(getGatherers(), c.recources);
        returnMe = Math.max(1, returnMe / c.getConsumers());
        c.recources -= returnMe;
        return returnMe;
    }

    int getMilitary() {
        return (int) (pop * myPlayer.percentMilitary);
    }

    int getGatherers() {
        return (int) (pop * (1 - myPlayer.percentMilitary));
    }

    void spawn(Cell[][] grid) {
        for (int i = location.x - (reach + myPlayer.maxSpawnDistance); i < location.x + (reach + 1); i++) {
            for (int j = location.y - (reach + 1); j < location.y + (reach + 1); j++) {
                
            }
        }
    }
}