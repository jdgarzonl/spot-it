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

        // iterates the Enum for indexes adds every card to the array list
        for (CardLayout c : CardLayout.values()) {
            getCards().add(new SpotItCard(c));
        }
    }

    public SpotItDeck(ArrayList<Card> cards) {
        super(cards.size());
        super.setCards(cards);
    }

    public String toString() {

        String fullDeckText = "";

        // iterates over all the cards and prints a string with every card
        // in a separate line
        for (int i = 0; i < getCards().size(); i++) {

            // creates a string with all the cards
            fullDeckText += String.format("%s%n",
                    getCards().get(i));
        }

        return fullDeckText;
    }

}
