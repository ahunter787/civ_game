
import java.util.ArrayList;
import java.util.Collections;

/**
 * Engine.java created by jkolber on Apr 8, 2014 at 1:28:58 PM
 */
public class Engine {
    
    ArrayList actors = new ArrayList();
    ArrayList grid;
    
    public Engine(int players, int dragons, ArrayList grid) {
        init(players, dragons);
        run();
    }
    
    public void run() {
        while(!done()) {
            evaluateFitness();
            selectMatingPool();
            applyGeneticOperators();
            replace();
        }
        report();
    }
    
    public void evaluateFitness() {
        for(Actor a: actors) {
            if(a.getClass() == "Player") {
                //evaluate their fitness
            }
        }
    }
    
    public void playGame() {
        for(int i = 0; i < turns; i++) {
            for(Actor a: actors) {
                a.doAction(grid);
            }
        }
    }

    public void init(int players, int dragons, ArrayList grid) {
        this.grid = grid;
        //fill the list of players
        for(int i = 0; i < players; i++) {
            //make a player, add it to the list
            //place it on the board
        }
        
        //fill the list of dragons
        for (int i = 0; i < dragons; i++) {
            //make a dragon
        }
        run();
    }
    
    public boolean done() {
        return true;
    }
    
    public String toString() {
        String returnMe = "I am a Engine, please fill in my variables so I can be debugged.";

        return returnMe;
    }
}
