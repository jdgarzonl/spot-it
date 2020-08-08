package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * This class +++Insert Description Here+++
 *
 * @author Juan Garzon
 */
public class SpotItDeck extends GroupOfCards {

    public SpotItDeck() {

        // initializes the array list with 57 positions
        super(57);
        setSize(57);
        // iterates the Enum for indexes adds every card to the array list
        for (CardLayout layout : CardLayout.values()) {
            getCards().add(new SpotItCard(layout));
        }
    }

    public SpotItDeck(ArrayList<Card> cards) {
        super(cards.size());
        setCards(cards);
    }

    public String toString() {

        String fullDeckText = "";

        // iterates over all the cards and prints a string with every card
        // in a separate line
        for (Card c : this.getCards()) {

            // creates a string with all the cards
            fullDeckText += String.format("%s%n", c);
        }
        return fullDeckText;
    }

    public SpotItCard removeTopCard() {
        setSize(getSize() - 1);
        return (SpotItCard)getCards().remove(0);        
    }
  
}
