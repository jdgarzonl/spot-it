package ca.sheridancollege.project;

/**
 * A class to represent the SpotIt players. Each player has a name, a score,
 * a picture guess, and the current game. 
 *
 * @author Juan Garzon
 */
public class SIPlayer extends Player {

    private int score; //player score
    private SIDeck myDeck; // player current deck
    private Picture guessPicture; // player's picture guess
    private SIGame game; // the current game where the player is participating
    private boolean isWinner; // flgs when the player wins

    /**
     * Constructs a player with a given name. 
     * 
     * @param name the player name
     */
    public SIPlayer(String name) {
        super(name);
    }

    /**
     * Evaluates the guess picture against the top card in the deck. Sets the
     * winner flag when the match against the center card exists. 
     * 
     */
    @Override
    public void play() {
        
        // Gets the center card reference from the current game
        SICard centerCard = game.getCenterCard();
        
        // Checks what is the correct matching picture
        Picture matchingPicture = 
                myDeck.showTopCard().getMatchingPicture(centerCard);
        
        // Sets the winner flag
        isWinner = (matchingPicture == guessPicture);
    }

    /**
     * Assigns a deck to this player. 
     * 
     * @param myDeck the deck for this player
     */
    public void setDeck(SIDeck myDeck) {
        this.myDeck = myDeck;
    }

    /**
     * Returns a reference to the deck being used by this player. 
     * 
     * @return the deck in use by the player
     */
    public SIDeck getDeck() {
        return myDeck;
    }

    /**
     * Assigns the picture guess for the player. The parameter must be a valid
     * value of the Picture enum. 
     * 
     * @param picture the picture enum object
     */
    public void setGuessPicture(Picture picture) {
        this.guessPicture = picture;
    }
    
    /**
     * Returns the picture guessed by the player. 
     * 
     * @return the picture guess
     */
    public Picture getPicture() {
        return guessPicture;
    }

    /**
     * Returns the flag to know when the player successfully matched the 
     * center picture in the current round. 
     * 
     * @return true when the player matched the picture
     */
    public boolean isWinner() {
        return isWinner;
    }

    /**
     * Assigns the current game to the player. 
     * 
     * @param game the current game
     */
    public void setGame(SIGame game) {
        this.game = game;
    }
    
}
