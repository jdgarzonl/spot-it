package ca.sheridancollege.project;

/**
 * This class +++Insert Description Here+++ 
 *
 * @author Juan Garzon
 */
public class SpotItCard extends Card{

    private String name;
    //private CardLayout cardName;
    private Picture[] cardPictures;
    
    public SpotItCard(CardLayout cardName) {
        
        this.name = cardName.getCardName();
        
        // creates an array of Pictures to store the 8 objects for a given card
        this.cardPictures = new Picture[8];
        
        // Iterates the 8 index of the given enum card
        int[] pictureIndexes = cardName.getPicsIndexes();
        int idx = 0;
        for (int i : pictureIndexes) {
            // fills the array of Picture objects using the Enum as array
            cardPictures[idx] = Picture.values()[i];
            idx++;
        } 
    }
// Not needed by now
//    public CardLayout getCard() {
//        return cardName;
//    }

    public String getName() {
        return name;
    }
    
    
    public Picture[] getCardPictures() {
        return cardPictures;
    }    
    
        
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
    
    
    public Picture getMatchingPicture(SpotItCard thatCard) {
        
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
         
    @Override
    public String toString() {
        
        String displayText = String.format("%-10s ", name);

        for (Picture p : cardPictures) {
            displayText += String.format("  %s  |", 
                    p.name());
        }
        //displayText += "]\n";
        return displayText;
    }

}
