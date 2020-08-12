package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class to control the SpotIt gameplay.
 *
 * @author Juan Garzon
 * @author Harmeet Kaur
 * @author Navneet Kaur
 * @author Jassika Singh Sains
 */
public class SIGame extends Game {

    private SIView view;
    private SICard centerCard;

    // Private references
    private SIPlayer player1;
    private SIPlayer player2;
    private static SIDeck deck;
    private int deckSize;
    private SIPlayer currentPlayer;

    /**
     * Constructs a new game given the name and the view where the interaction
     * with payers occur.
     *
     * @param name a name for the game
     * @param view a view object where the interaction will occur
     */
    public SIGame(String name, SIView view) {
        super("SpotIt Game: " + name);
        this.view = view;

        // A full new deck is created every time the game starts
        // the deck is shuffled. 
        deck = SIDeck.createNewDeck();
        deck.shuffle();
    }

    /**
     * Starts the game.
     *
     */
    @Override
    public void play() {

        if (getWelcomeConfirmation() == 'Y') {
            initialize();
            boolean cardsRemaining = true;
            do {
                updateScreen();

                currentPlayer = getCurrentPlayer();
                Picture guess = getPictureFromCurrentPlayer();

                currentPlayer.setGuessPicture(guess);
                currentPlayer.play();
                if (currentPlayer.isWinner()) {
                    centerCard = currentPlayer.getDeck().removeTopCard();
                    cardsRemaining = !currentPlayer.getDeck().isStackEmpty();
                    printRoundWinnerMessage();
                } else {
                    printWrongMatchMsg();
                }
            } while (cardsRemaining);
            declareWinner();
        } else {
            printByeBye();
        }

    }

    /**
     * Print the final dialog when the game ends.
     *
     */
    @Override
    public void declareWinner() {
        view.printMessage(String.format("%s you won the game."
                + "%nCongratulations!!!%n", currentPlayer.getName()));
    }

    /**
     * Returns the card in the center.
     *
     * @return a reference to the center card
     */
    public SICard getCenterCard() {
        return centerCard;
    }

    /*
    Starts the game initial dialog, ask users for names, how many cards
    they want to play. 
     */
    private void initialize() {

        // Prints the name of the game 
        view.printMessage(String.format("%n%n%s", getName()));

        // Removes the top card from the new deck and sets 
        // that card in the center
        centerCard = deck.removeTopCard();

        /*  
        Ask the user for how many cards play. This is useful to limit
        the game length. 
         */
        deckSize = getDeckSize();

        /* 
        Ask user for the name of player 1. Then creates a new player and 
        assigns the required quantity of cards. 
         */
        player1 = new SIPlayer(view.getPlayerName(1).toUpperCase());
        player1.setGame(this);
        player1.setDeck(deck.getUpperCards(deckSize));

        /* 
        Ask user for the name of player 1. Then creates a new player and 
        assigns the required quantity of cards. 
         */
        player2 = new SIPlayer(view.getPlayerName(2).toUpperCase());
        player2.setGame(this);
        player2.setDeck(deck.getLowerCards(deckSize));

        /*
        Adds the tw players to the player list
         */
        getPlayers().add(player1);
        getPlayers().add(player2);

    }

    /*
    Updates the screen after each round using the View class. Prints the 
    top card of each player and the center card. 
     */
    private void updateScreen() {

        String card1 = player1.getDeck().showTopCard().toString();
        String p1Name = player1.getName();
        String leftCards1 = String.valueOf(player1.getDeck().getSize());

        String card2 = player2.getDeck().showTopCard().toString();
        String p2Name = player2.getName();
        String leftCards2 = String.valueOf(player2.getDeck().getSize());

        view.updateView(p1Name, card1, leftCards1,
                p2Name, card2, leftCards2,
                centerCard.toString());
    }

    /*
    Converts the user number given by the players to a valid
    position of the players array
     */
    private SIPlayer getCurrentPlayer() {
        int index = Integer.parseInt(view.getPlayerNumber()) - 1;
        return (SIPlayer) getPlayers().get(index);
    }

    /*
    Requests the picture guess from the players and verifies it matches
    a valid Picture enum, retries when invalid. 
     */
    private Picture getPictureFromCurrentPlayer() {
        boolean isValidEnum;
        Picture picture = null;
        do {
            try {
                // Gets the picture string form the View
                String txtPicture
                        = view.getPlayerGuess(currentPlayer.getName());
                // Tries to create a picture form the Enum
                picture = Picture.valueOf(txtPicture);
                isValidEnum = true;
            } catch (RuntimeException ex) {
                isValidEnum = false;
            }
        } while (!isValidEnum); // Keeps trying if the enum creation fails
        return picture;
    }

    private int getDeckSize() {
        boolean isValidNumber = false;
        String txtDeckSize;
        int size = 1;
        do {
            txtDeckSize = view.getDeckSizeAsText();
            // Checks if the input is valid number
            if (txtDeckSize.matches("^\\d*$")) {
                size = Integer.parseInt(txtDeckSize);
                // Checks if the input is in the allowed range
                if (size >= 1 && size <= 28) {
                    isValidNumber = true;
                }
            }
        } while (!isValidNumber); // Keeps retrying if the input is invalid  

        return size;
    }

    /*
    Prints a warning message when the picture don't match the center card
     */
    private void printWrongMatchMsg() {
        view.printMessage("Wrong matching picture! The game continues...\n");
    }

    /*
    Prints a message when the player wins a round
     */
    private void printRoundWinnerMessage() {
        view.printMessage(String.format("%s you won this round!!!",
                currentPlayer.getName()));
    }

    private char getWelcomeConfirmation() {
        String message = "The principle of the SpotIt game is to match the \n"
                + "common picture between two cards.\n"
                + "Remember that every two cards have a common picture, even \n"
                + "though sometimes it is not evident. \n"
                + "\n"
                + "In this version, the gameplay reserves 1 card as a \n"
                + "reference to lay in the center and splits the 56 remaining \n"
                + "in two parts. However, to play shorter games, you can also \n"
                + "choose how many cards you want for each player. \n"
                + "\n"
                + "When a player wins a round, his/her card becomes the new \n"
                + "center card. He/she gets a new card from his/her deck. \n"
                + "The game continues until a player runs out of cards, that \n"
                + "player wins!\n"
                + "\n"
                + "Since this is is a pure text interface you need to match \n"
                + "the picture description as it appears on the screen, this \n"
                + "means you need to type the name of the picture :P\n"
                + "Do you want to play? (Y/N): ";
        char startGame = view.getStartConfirmation(message);
        return startGame;
    }

    private void printByeBye() {
        view.printMessage("Bye!");
    }
}
