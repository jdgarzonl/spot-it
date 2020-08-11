package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * A class to model the user interface of a SpotIt Game. This interface is
 * for text interface only. 
 *
 * @author Juan Garzon
 */
public class SIView {
    
    private Scanner input = new Scanner(System.in);
    
    public char getStartConfirmation(String message) {
        char startGame = ' ';
        startGame = getTextInput(message).trim().toUpperCase().charAt(0);
        return startGame;        
    }
    
    
    /**
     * A method to ask the user for his name. A number specifies the number
     * assigned to that player in the game. 
     * 
     * @param playerNum the number assigned to that player in the game
     * @return the player name
     */
    public String getPlayerName(int playerNum) {
        // Returns the player name using a private method that retries if
        // the input is empty or null
        return getTextInput(String.format("Enter player %d name: ", playerNum));
    }
    
    /**
     * Returns the player number. Performs a validation to allow a single 
     * digit 1 or 2. 
     * 
     * @return 
     */
    public String getPlayerNumber() {
        boolean isValidNumber = false;
        String txtNumber;
        do {
            txtNumber = getTextInput("To play please enter your number first\n"
                    + "Enter player number (1 or 2): ");
            // The input is only valid if 1 is a single character 1 or 2
            if (txtNumber.matches("[12]")) { 
                isValidNumber = true;
            }
        } while(!isValidNumber); // Keeps retrying if the input is invalid  
        
        return txtNumber;
    }
    
    /**
     * Returns the name of the picture guess. Only validates for empty or
     * null strings. 
     * 
     * @param playerName a name to label the input request
     * @return the picture name
     */
    public String getPlayerGuess(String playerName) {
        // Returns the player guess
        
        return getTextInput(String.format("[%s] please enter a valid guess: ",
                playerName.toUpperCase()));
    }
    
    /**
     * Prints a message to the user asking for deck size. 
     * 
     * @return 
     */
    public String getDeckSizeAsText() {
        return getTextInput("How many cards per "
                    + "player (1 - 28): ");
    }
    
    /**
     * Updates the view after each round using the main information to 
     * display: the top cards of each player and the center card.
     * 
     * @param card1
     * @param card2
     * @param centerCard 
     */
    
    public void updateView(String p1Name, String card1, String leftCards1,
                           String p2Name, String card2, String leftCards2,
                           String centerCard) {
        System.out.printf("%n[1]: %s / %s card(s) left%n", p1Name, leftCards1);
        System.out.printf("%s%n%n", card1);
        
        System.out.printf("Center Card%n%s%n%n", centerCard);
        
        System.out.printf("[2]: %s / %s card(s) left%n", p2Name, leftCards2);
        System.out.printf("%s%n%n", card2);

    }
    
    /**
     * A general method to print output messages to the users. 
     * 
     * @param message the message to print
     */
    public void printMessage(String message) {
        System.out.println(message);
    }
    
    /*
     * A general method to get user input with a verification for null 
     * or blank strings. 
     */
    private String getTextInput(String message) {
        boolean isValid;
        String txt = "";
        do {
            System.out.printf("%s", message);
            txt = input.nextLine();
            isValid = !(txt == null || txt.isBlank());
        } while (!isValid);

        return txt;
    }

}
