package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
 *
 * @author Juan Garzon
 */
public class SpotItGame extends Game {

    SpotItCard centerCard;
    SpotItDeck deckPlayer1;
    SpotItDeck deckPlayer2;
    SpotItPlayer player1;
    SpotItPlayer player2;
    SpotItPlayer winner;
    int deckSize;

    Scanner input = new Scanner(System.in);

    public SpotItGame(String name) {
        super(name);
    }

    @Override
    public void play() {
        // Initializes and shuffles a new SpotIt deck
        SpotItDeck myDeck = new SpotItDeck();
        myDeck.shuffle();

        // Sets the center card
        centerCard = myDeck.removeTopCard();

        // Split the deck
        ArrayList<Card> deck1 = new ArrayList<>(myDeck.getCards().subList(0, deckSize));
        deckPlayer1 = new SpotItDeck(deck1);
        player1.setDeck(deckPlayer1);
        ArrayList<Card> deck2 = new ArrayList<>(myDeck.getCards().subList(deckSize, 2 * deckSize));
        deckPlayer2 = new SpotItDeck(deck2);
        player2.setDeck(deckPlayer2);

        while (deckPlayer1.getCards().size() > 0 && deckPlayer2.getCards().size() > 0) {
            // Update the screen with new decks and center card view
            updateScreen();

            boolean isValid = false;
            int playerIndex = 0;
            do {                
                System.out.printf("%nEnter the player number (1 or 2): ");
                String txtPlayerIndex = input.next();
                if (txtPlayerIndex.matches("[1-2]")) {
                    playerIndex = Integer.parseInt(txtPlayerIndex) - 1;
                    isValid = true;
                }
            } while (!isValid);

            SpotItPlayer player = (SpotItPlayer) getPlayers().get(playerIndex);
            player.play();
            SpotItCard deckTopCard = (SpotItCard) player.getDeck().getCards().get(0);
            if (deckTopCard.isFound(player.getPicture())) {
                if (deckTopCard.getMatchingPicture(centerCard) == player.getPicture()) {
                    player.winRound();
                    centerCard = player.getDeck().removeTopCard();
                    System.out.printf("%s won this round.%n", player.getName());
                    
                    if (player.getDeck().getCards().size() == 0) {
                        winner = player;
                    }
                    
                } else {
                    System.out.println("The picture match is wrong!");
                }
            } else {
                System.out.println("The picture doesn't exist in your card!");
            }
        }

        declareWinner();

    }

    @Override
    public void declareWinner() {
        System.out.printf("%nEnd of game");
        System.out.printf("Deck1 size: %s - Deck2 size: %s%n",
                deckPlayer1.getSize(), deckPlayer2.getSize());
        System.out.printf("The winner is %s%nCongratulations!!!%n", winner.getName());
    }

    public void gameInit() {
        System.out.println("Welcome to SpotIt Card Game");

        // Get the names of the players and adds them to the game list
        System.out.print("Please enter name for player 1: ");
        String playerName = input.nextLine();
        player1 = new SpotItPlayer(playerName);
        this.getPlayers().add(player1);
        System.out.print("Please enter name for player 2: ");
        playerName = input.nextLine();
        player2 = new SpotItPlayer(playerName);
        this.getPlayers().add(player2);
        System.out.print("Please enter the desired deck size for each player [1 - 28 cards]: ");
        deckSize = input.nextInt();
    }

    public void updateScreen() {
        System.out.printf("%n%28s%s%n", "Center card:", centerCard);
        System.out.printf("[%s]%n Cards left: %s current card: %s %n", player1.getName(), deckPlayer1.getCards().size(), deckPlayer1.getCards().get(0));
        System.out.printf("[%s]%n Cards left: %s current card: %s %n", player2.getName(), deckPlayer2.getCards().size(), deckPlayer2.getCards().get(0));

    }

}
