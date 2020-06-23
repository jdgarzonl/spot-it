package ca.sheridancollege.project;

/**
 * This class +++Insert Description Here+++ 
 *
 * @author Juan Garzon
 */
public class SpotItCard extends Card{

    private CardLayout cardName;
    private Picture[] cardPictures;
    
    public SpotItCard(CardLayout cardName) {
        this.cardName = cardName;
        
        // creates an array of Pictures to store the 8 objects for a given card
        this.cardPictures= new Picture[8];
        
        // assigns the 8 pictures for the given card
        for (int i = 0; i < cardName.getPicsIndexes().length; i++) {
            // calculates the index of every image
            int indexOfPicture = cardName.getPicsIndexes()[i];
            
            // fills the array of Picture objects using the Enum as array
            cardPictures[i] = Picture.values()[indexOfPicture];
        } 
    }

    public CardLayout getCard() {
        return cardName;
    }

    public Picture[] getCardPictures() {
        return cardPictures;
    }    
    
    public String getMatchingPicture(SpotItCard givenCard) {
        
        // hopefully this will never be displayed for two well constructed
        // Spot It cards
        String matchingPicture = "No match picture found!";
        
        // a linear search for all the 8 Picture objects in each card
        for(Picture thisCardPicture : this.cardPictures) {            
            for (Picture thatCardPicture : givenCard.cardPictures) {
                
// the comparison is carried out using Picture objects
                if (thisCardPicture == thatCardPicture) {
                    matchingPicture = thisCardPicture.getShortName();
                    
                    // when a match is found the loops ends
                    break;
                }                    
            }
        }
        
        return matchingPicture;
    }
         
    @Override
    public String toString() {
        
        String displayText = String.format("%-10s ", cardName.getCardName());

        for (Picture p : cardPictures) {
            displayText += String.format("%-15s", 
                    p.getShortName());
        }
        //displayText += "]\n";
        return displayText;
    }

}
