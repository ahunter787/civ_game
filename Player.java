<<<<<<< HEAD
package civilization;
=======
package finalproject;

import java.util.ArrayList;
import java.util.Random;
>>>>>>> jb

/**
 * Player.java created by jebraun on Apr 10, 2014 at 1:23:33 PM
 */
<<<<<<< HEAD
public class Player implements Actor {

    @Override
    public void doAction() {
        collectResources();
        Actor threat = evaluateThreats();
        if (threat != null) {
            attack(threat);
        } else if (checkSpawn()) {
            spawn();
        }
    }

    private void collectResources() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
=======
public class Player extends Actor {

    int maxSpawnDistance;
    double percentMilitary;
    int popCap;
    double reproRate;
    double militaryStrMod;
    int aggro;
    int spawnRate;
    int newTownRecs;
    ArrayList<Town> towns = new ArrayList<>();

    public Player(byte[] DNA) {
    }

    @Override
    public void doAction(Cell[][] grid) {
        collectResources(grid);
        Actor threat = evaluateThreats();
        if (threat != null) {
            attack(threat);
        } else {
            checkSpawn(grid);
        }
    }

    private void collectResources(Cell[][] grid) {
        for (Town town : towns) {
            town.collectRecources(grid);
        }
>>>>>>> jb
    }

    private Actor evaluateThreats() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void attack(Actor threat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

<<<<<<< HEAD
    private boolean checkSpawn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void spawn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
=======
    private void checkSpawn(Cell[][] grid) { //TODO: Maybe adda extra spawning conditions?
        Random r = new java.util.Random();
        if (r.nextDouble() < spawnRate) {
            towns.get((int) (r.nextDouble() * towns.size())).spawn(grid);
        }
>>>>>>> jb
    }
}