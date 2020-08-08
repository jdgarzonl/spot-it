package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * This class +++Insert Description Here+++ 
 *
 * @author Juan Garzon
 */
public class SpotItPlayer extends Player {
    
    private int score;
    private SpotItDeck myDeck;
    private Scanner input = new Scanner(System.in);
    private Picture picture;

    public SpotItPlayer(String name) {
        super(name);
    }
    
    public void play() {
        
        
        boolean isValid = true;
        do {
            try {
                System.out.printf("Please %s type the matching picture name: ", getName());
                picture = Picture.valueOf(input.next().toUpperCase());
                isValid = true;
            } catch (IllegalArgumentException ex) {
                //ex.printStackTrace();
                System.out.println("Invalid picture name.");
                isValid = false;
            }              
        } while (!isValid);
              
    }
    
    public void setDeck(SpotItDeck myDeck) {
        this.myDeck = myDeck;
    }
    
    public SpotItDeck getDeck() {
        return myDeck;
    }
    
    public void winRound() {
        if (score > 0)
            score--;
    }   
    
    public Picture getPicture() {
        return picture;
    }
}
