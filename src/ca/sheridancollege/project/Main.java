package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * This class +++Insert Description Here+++ 
 *
 * @author Juan Garzon
 */
public class Main {
    
    public static void main(String[] args) {
        // WORKING VERSION
//        SpotItGame myGame = new SpotItGame("SpotIt at Sheridan!");
//        myGame.gameInit();
//        myGame.play();       
        SIView view = new SIView();
        SIGame game = new SIGame("for testing", view); 
        game.play();

//        
//        int randomCardIndex = (int)(56 * Math.random());
//        System.out.println(randomCardIndex);
//        
//        SpotItCard myCard = new SpotItCard(CardLayout.values()[randomCardIndex]);
//        System.out.println(myCard);
//
//        SpotItCard myCard2 = new SpotItCard(CardLayout.CARD47);
//        System.out.println(myCard2);
//
//        System.out.println(myCard.getMatchingPicture(myCard2));
//        
//        
//        SpotItDeck fullDeck = new SpotItDeck();

//        System.out.println(deck);
        
//        fullDeck.shuffle();
        /*
        System.out.println(fullDeck);
        
        SpotItCard initialCard = (SpotItCard)fullDeck.getCards().get(0);
        
        ArrayList<Card> firstHalfDeck = new ArrayList<>(fullDeck.getCards().subList(1, 28));
        
        SpotItDeck deckPlayer1 = new SpotItDeck(firstHalfDeck);
        System.out.println(deckPlayer1);
        
        ArrayList<Card> secondHalfDeck = new ArrayList<>(fullDeck.getCards().subList(28, 57));
        SpotItDeck deckPlayer2 = new SpotItDeck(secondHalfDeck);
        System.out.println(deckPlayer2); 
        */
    }
       
}
