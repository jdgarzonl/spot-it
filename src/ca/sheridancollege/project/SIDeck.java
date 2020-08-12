package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class to represent a group of SpotIt cards, or deck. Includes a static
 * method to retrieve a new full deck of 57 SpotItCards. 
 *
 * @author Juan Garzon
 * @author Harmeet Kaur
 * @author Navneet Kaur
 * @author Jassika Singh Sains
 */
class SIDeck extends GroupOfCards {

    /**
     * Constructs a default group of cards. 
     * 
     * @param size 
     */
    public SIDeck(int size) {
        super(size);
    }

    /** 
     * Constructs a new deck given an existing ArrayList. 
     * 
     * @param cards the ArrayList representing the cards
     */
    public SIDeck(ArrayList<Card> cards) {
        super(cards.size());
        setCards(cards);
    }

    /**
     * Returns a reference to the top card in the deck. 
     * 
     * @return a reference to the card on top of the deck
     */
    public SICard showTopCard() {
        return (SICard) getCards().get(0);
    }
    
    /**
     * Removes the card from the top of the deck and returns that card. 
     * 
     * @return the card on top of the deck
     */
    public SICard removeTopCard() {
        setSize(getSize() - 1);
        return (SICard) getCards().remove(0);
    }

    /**
     * Returns a full new SpotIt deck composed of the 57 possible cards. 
     * 
     * @return a new deck of 57 SpotIt cards
     */
    public static SIDeck createNewDeck() {

        ArrayList<Card> cards = new ArrayList<>();
        // iterates the Enum for indexes adds every card to the array list
        for (CardLayout layout : CardLayout.values()) {
            cards.add(new SICard(layout));
        }
        SIDeck newDeck = new SIDeck(57);
        newDeck.setCards(cards);
        return newDeck;
    }

    /**
     * Returns a part of the deck composed of the cards near the top. 
     * The amount of cards to retrieve must be specified. 
     * 
     * @param newSize the size of the new deck
     * @return upper part of the deck 
     */
    public SIDeck getUpperCards(int newSize) {
        // Creates a sublist storing a copy of the specificed cards
        ArrayList<Card> upperCards = 
                new ArrayList<>(getCards().subList(0, newSize));
        // Creates a new deck based on the sublist
        SIDeck upperHalf = new SIDeck(upperCards);
        return upperHalf;
    }

    /**
     * Returns a part of the deck composed of the cards near the top. Returns
     * a new deck next to the first deck created by getLowerCards(). When 
     * newSize = 28 returns half of the deck. 
     * 
     * @param newSize
     * @return lower part of the deck
     */
    public SIDeck getLowerCards(int newSize) {
        // Creates a sublist storing a copy of the specificed cards
        ArrayList<Card> lowerCards = new ArrayList<>(this.getCards().subList(newSize, 2 * newSize));
        
        // Creates a new deck based on the sublist
        SIDeck lowerHalf = new SIDeck(lowerCards);
        return lowerHalf;
    }
    
    public boolean isStackEmpty() {
        return (getCards().isEmpty());
    }

    /**
     * Returns a string representing the full deck. 
     * 
     * @return the full deck string representation
     */
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

} // end of class
