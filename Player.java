package civilization;

/**
 * Player.java created by jebraun on Apr 10, 2014 at 1:23:33 PM
 */
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
    }

    private Actor evaluateThreats() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void attack(Actor threat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean checkSpawn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void spawn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}