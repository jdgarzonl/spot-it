# spot-it
## Sheridan College - Spring/Summer 2020 - SYST17796 - Group 5 - Spot It! game
The term project is a recreation of a game based on a card deck. The chosen game is Spot It, also known as Dobble in Europe (Rodriguez, 2018, para. 6). The game is based on a pack of 55 cards, where each card holds eight different pictures. 
Order|Total Cards|Total Images|Pictures per Card
-----|-----------|------------|-----------------
0|1|1|1
1|3|3|2
2|7|7|3
3|13|13|4
5|31|31|6
*7*|*57*|*57*|*8*
11|133|133|12

There are many game variations, but all of them are based on a particular property of the Spot It cards: every two cards in the game share one image. No matter what pair of cards is taken for comparison, there will be one picture repeated. This property applies to sets of cards in different orders (Spot-It, 2012, para. 4) : 

The Spot It deck is an order 7 set of cards, where two cards were discarded. The reason why the commercial version of the collection only includes 55 cards is unknown, anyway the remaining cards hold the same property.  

**High Level Requirements**
The system will include the following functionalities:
* Each player will be asked to register his/her name. The name will appear on the interface below the corresponding card for that player. 
* The first player who finds a match inputs the selection by text, first selecting his number and the corresponding word. 
* The score is represented by the remaining cards in the game, the number of cards left on each player’s deck is updated after each win. 
* When a player has no cards left the game stops and shows the winner and final score. 

**Design Considerations**
The current code follows OO principles.
* Encapsulation
The data member in each class is set to private. The contact with data members is handled exclusively with accessor and mutator methods. Other methods to add later will help to make more elaborated comparisons of the cards against the user input to define a winner. 
*	Delegation
o	To manage the players, the Game class could have used a String array; instead, it delegates the functions related to the player to a Player class. Much more sophisticated information regarding the player can be modelled in Player subclasses. 
o	The Game class doesn’t handle independent Card objects. The GroupOfCards class will serve as an intermediate class in charge of the deck functions like shuffling or modelling separate decks of cards. 
*	Flexibility/Maintainability
o	The abstract classes provide a blueprint for the subclasses, not only it’s flexible to model different games, but it can also help to create and test new versions of the chosen game cards. An example is to use a lower order Spot It game with fewer cards and fewer images. 
o	The current code base only mandates the implementation of toString() in the Card subclasses. The planned card class for Spot It will construct the 57 card objects using two enumeration classes: one enum for the 57 picture-words and another enum for the eight indexes of the picture-word in each card. This approach will help later to add additional information, like Unicode characters, to the picture-words. 
o	The array lists allow room for growth for future releases without the constraint of a fixed size array. A harder game using 133 cards and 11 pictures per card is possible without changing the array list. 


**References**
* How To Play Spot It! With Actual Gameplay. (2017). Retrieved from https://www.youtube.com/watch?v=ju-AMyADc7g
* Rodriguez, L. M. (2018). The Mind-Bending Math Behind Spot It!, the Beloved Family Card Game. Retrieved from https://www.smithsonianmag.com/science-nature/math-card-game-spot-it-180970873/
* SPOT-IT – HOW’D THEY DO THAT!? (2012). Retrieved from https://radiganengineering.com/2013/01/spot-it-howd-they-do-that/
