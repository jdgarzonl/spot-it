package ca.sheridancollege.project;

/**
 * This models an SpotIt card. Each card have a name and 8 images represented
 * as Picture objects. 
 *
 * @author Juan Garzon
 */
class SICard extends Card {
    
    private String name;
    //private CardLayout cardName;
    private Picture[] cardPictures;
    
    /**
     * A constructor for new SpotIt Cards. Requires a layout parameter to build
     * a valid card. 
     * @param cardName the layout name
     */
    public SICard(CardLayout cardName) {
        // Names the card using the default layout name
        this.name = cardName.getCardName();
        
        // creates an array of Pictures to store the 8 objects 
        // for any given card
        this.cardPictures = new Picture[8];
        
        // Iterates the 8 indexes on the layout and populates the pictures
        // array with the corresponding image
        int[] pictureIndexes = cardName.getPicsIndexes();
        int idx = 0;
        for (int i : pictureIndexes) {
            // fills the array of Picture objects using the Enum as array
            cardPictures[idx] = Picture.values()[i];
            idx++;
        } 
    }
    
    /**
     * Returns the card name. 
     * 
     * @return the card name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Return a reference to the 8 pictures in the card. 
     * 
     * @return a copy of the picture array in the card
     */
    public Picture[] getCardPictures() {
        return cardPictures;
    }    
    
    /**
     * Returns true when a given picture exists in the card
     * 
     * @param givenPicture the picture to compare the card
     * @return the comparison result
     */
    public boolean isFound(Picture givenPicture) {
        boolean isMatched = false;
        for (Picture p : this.cardPictures) {
            if(p == givenPicture) {
                isMatched = true;
                break;
            }                
        }        
        return isMatched;
    }
    
    /**
     * Returns the common (matching) picture between given another card. 
     * 
     * @param thatCard the card to make the comparison  
     * @return the comparison result
     */
    public Picture getMatchingPicture(SICard thatCard) {
        
        // hopefully this will never be returned for any two well-constructed
        // Spot It cards
        Picture matchingPicture = null;
        
        // a linear search for all the 8 Picture objects in each card
        for(Picture thisCardPicture : this.cardPictures) {            
            for (Picture thatCardPicture : thatCard.cardPictures) {
                
        // the comparison is carried out using Picture objects
                if (thisCardPicture == thatCardPicture) {
                    matchingPicture = thisCardPicture;
                    
                    // when a match is found the loops ends
                    break;
                }                    
            }
        }
        
        return matchingPicture;
    }
    
    /**
     * Returns a text representation of the card. 
     * 
     * @return a string with the names of the card and the names of 
     * the 8 pictures separated by |
     */
    @Override
    public String toString() {
        // Adds the name of the card to the string
        //String displayText = String.format("%-10s ", name);
        
        String displayText = "";
        
        // Adds the picture Enum names to the representation text
        for (Picture p : cardPictures) {
            displayText += String.format("  %s  |", 
                    p.name());
        }        
        return displayText;
    }

}
