package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * This class +++Insert Description Here+++ 
 *
 * @author Juan Garzon
 */
public class Main {
    
    public static void main(String[] args) {      
        SIView view = new SIView();
        SIGame game = new SIGame("for SYST17796", view); 
        game.play();

    }
       
}
