
package ca.sheridancollege.project;

/**
 * A class to represent all the possible 57 picture layouts in an SpotIt game. 
 * Each layout has 7 indexes to represent the 57 pictures.  
 * 
 * @author juangarzon
 */
public enum CardLayout {

    // Spot It indexes for images downloaded from
    // https://radiganengineering.com/2013/01/spot-it-howd-they-do-that/
    CARD1 ("Card 1", new int[] {0, 1, 2, 3, 4, 5, 6, 49}),
    CARD2 ("Card 2", new int[] {7, 8, 9, 10, 11, 12, 13, 49}),
    CARD3 ("Card 3", new int[] {49, 14, 15, 16, 17, 18, 19, 20}),
    CARD4 ("Card 4", new int[] {49, 21, 22, 23, 24, 25, 26, 27}),
    CARD5 ("Card 5", new int[] {32, 33, 34, 49, 28, 29, 30, 31}),
    CARD6 ("Card 6", new int[] {35, 36, 37, 38, 39, 40, 41, 49}),
    CARD7 ("Card 7", new int[] {42, 43, 44, 45, 46, 47, 48, 49}),
    CARD8 ("Card 8", new int[] {0, 35, 7, 42, 14, 50, 21, 28}),
    CARD9 ("Card 9", new int[] {1, 36, 8, 43, 15, 50, 22, 29}),
    CARD10 ("Card 10", new int[] {2, 37, 9, 44, 16, 50, 23, 30}),
    CARD11 ("Card 11", new int[] {3, 38, 10, 45, 17, 50, 24, 31}),
    CARD12 ("Card 12", new int[] {32, 4, 39, 11, 50, 46, 18, 25}),
    CARD13 ("Card 13", new int[] {33, 5, 40, 12, 47, 50, 19, 26}),
    CARD14 ("Card 14", new int[] {34, 6, 41, 13, 48, 50, 20, 27}),
    CARD15 ("Card 15", new int[] {0, 32, 48, 8, 16, 40, 51, 24}),
    CARD16 ("Card 16", new int[] {1, 33, 41, 42, 17, 51, 9, 25}),
    CARD17 ("Card 17", new int[] {34, 35, 10, 43, 2, 18, 51, 26}),
    CARD18 ("Card 18", new int[] {51, 3, 36, 11, 44, 19, 27, 28}),
    CARD19 ("Card 19", new int[] {4, 37, 12, 45, 51, 20, 21, 29}),
    CARD20 ("Card 20", new int[] {5, 38, 13, 14, 51, 46, 22, 30}),
    CARD21 ("Card 21", new int[] {6, 39, 7, 15, 51, 23, 47, 31}),
    CARD22 ("Card 22", new int[] {0, 38, 9, 47, 18, 52, 27, 29}),
    CARD23 ("Card 23", new int[] {1, 39, 10, 48, 19, 52, 21, 30}),
    CARD24 ("Card 24", new int[] {2, 40, 42, 11, 20, 22, 52, 31}),
    CARD25 ("Card 25", new int[] {32, 3, 41, 43, 12, 14, 52, 23}),
    CARD26 ("Card 26", new int[] {33, 35, 4, 44, 13, 15, 52, 24}),
    CARD27 ("Card 27", new int[] {34, 36, 5, 7, 45, 16, 52, 25}),
    CARD28 ("Card 28", new int[] {37, 6, 8, 46, 17, 52, 26, 28}),
    CARD29 ("Card 29", new int[] {0, 33, 36, 10, 46, 20, 53, 23}),
    CARD30 ("Card 30", new int[] {1, 34, 37, 11, 14, 47, 53, 24}),
    CARD31 ("Card 31", new int[] {2, 38, 12, 15, 48, 53, 25, 28}),
    CARD32 ("Card 32", new int[] {3, 39, 42, 13, 16, 53, 26, 29}),
    CARD33 ("Card 33", new int[] {4, 7, 40, 43, 17, 53, 27, 30}),
    CARD34 ("Card 34", new int[] {5, 8, 41, 44, 18, 21, 53, 31}),
    CARD35 ("Card 35", new int[] {32, 35, 6, 9, 45, 19, 53, 22}),
    CARD36 ("Card 36", new int[] {0, 41, 11, 45, 15, 54, 26, 30}),
    CARD37 ("Card 37", new int[] {1, 35, 12, 46, 16, 54, 27, 31}),
    CARD38 ("Card 38", new int[] {32, 2, 36, 13, 47, 17, 21, 54}),
    CARD39 ("Card 39", new int[] {33, 3, 37, 7, 48, 18, 22, 54}),
    CARD40 ("Card 40", new int[] {34, 4, 38, 8, 42, 19, 54, 23}),
    CARD41 ("Card 41", new int[] {5, 39, 9, 43, 20, 54, 24, 28}),
    CARD42 ("Card 42", new int[] {6, 40, 10, 44, 14, 54, 25, 29}),
    CARD43 ("Card 43", new int[] {0, 34, 39, 44, 12, 17, 22, 55}),
    CARD44 ("Card 44", new int[] {1, 40, 55, 13, 45, 18, 23, 28}),
    CARD45 ("Card 45", new int[] {2, 7, 41, 46, 19, 55, 24, 29}),
    CARD46 ("Card 46", new int[] {3, 8, 47, 35, 20, 55, 25, 30}),
    CARD47 ("Card 47", new int[] {4, 9, 14, 48, 55, 36, 26, 31}),
    CARD48 ("Card 48", new int[] {32, 37, 10, 15, 55, 27, 42, 5}),
    CARD49 ("Card 49", new int[] {33, 43, 38, 6, 11, 16, 21, 55}),
    CARD50 ("Card 50", new int[] {0, 37, 43, 13, 19, 56, 25, 31}),
    CARD51 ("Card 51", new int[] {32, 1, 38, 7, 44, 20, 56, 26}),
    CARD52 ("Card 52", new int[] {33, 2, 39, 8, 45, 14, 56, 27}),
    CARD53 ("Card 53", new int[] {34, 3, 40, 9, 46, 15, 21, 56}),
    CARD54 ("Card 54", new int[] {4, 41, 10, 47, 16, 22, 56, 28}),
    CARD55 ("Card 55", new int[] {35, 5, 11, 48, 17, 23, 56, 29}),
    CARD56 ("Card 56", new int[] {36, 6, 42, 12, 56, 18, 24, 30}),
    CARD57 ("Card 57", new int[] {49, 50, 51, 52, 53, 54, 55, 56});

    private String cardName;
    private int[] picsLayout;
         
    private CardLayout (String cardName, int[] indexesOfImages) {
        this.cardName = cardName;
        this.picsLayout = indexesOfImages;
    }    
    
    /**
     * Returns the card name as a string. 
     * 
     * @return the card name
     */
    public String getCardName() {
        return cardName;
    }
    
    /**
     * Returns the list of pictures corresponding to a single card. 
     * 
     * @return the pictures for a card
     */
    public int[] getPicsIndexes() {
        return picsLayout;
    }
}
