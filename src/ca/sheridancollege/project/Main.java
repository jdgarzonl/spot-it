package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The running class for the SpotIt game
 *
 * @author Juan Garzon
 * @author Harmeet Kaur
 * @author Navneet Kaur
 * @author Jassika Singh Sains
 */
public class Main {
    
    public static void main(String[] args) {      
        SIView view = new SIView();
        SIGame game = new SIGame("for SYST17796", view); 
        game.play();

    }
       
}
