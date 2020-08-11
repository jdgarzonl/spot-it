package ca.sheridancollege.project;

/**
 * A class to represent the 57 pictures on a typical SpotIt game. Each picture
 * has a long name and a short name. 
 * 
 * @author juangarzon
 */
public enum Picture {
    
    // symbol list obtained from 
    // https://www.markporthouse.net/spot-it-dobble-symbol-list
    APPLE ("Apple", "Apple"), 
    ANCHOR ("Anchor", "Anchor"), 
    BABY_BOTTLE ("Baby bottle", "Baby bottle"), 
    BOMB ("Bomb", "Bomb"), 
    CACTUS ("Cactus", "Cactus"), 
    CANDLE ("Candle", "Candle"), 
    TAXI_CAR ("Taxi car", "Taxi car"), 
    CARROT ("Carrot", "Carrot"), 
    CHESS_KNIGHT ("Chess knight", "Chess knight"), 
    CLOCK ("Clock", "Clock"), 
    CLOWN ("Clown", "Clown"), 
    DAISY_FLOWER ("Daisy flower", "Daisy flower"), 
    DINOSAUR ("Dinosaur", "Dinosaur"), 
    DOLPHIN ("Dolphin", "Dolphin"), 
    DRAGON ("Dragon", "Dragon"), 
    EXCLAMATION_POINT ("Exclamation point", "Exclamation"), 
    EYE ("Eye", "Eye"), 
    FIRE ("Fire", "Fire"), 
    FOUR_LEAF_CLOVER ("Four leaf clover", "Clover"), 
    GHOST ("Ghost", "Ghost"), 
    GREEN_SPLATS ("Green splats", "Green splats"), 
    HAMMER ("Hammer", "Hammer"), 
    HEART ("Heart", "Heart"), 
    ICE_CUBE ("Ice cube", "Ice cube"), 
    IGLOO ("Igloo", "Igloo"), 
    KEY ("Key", "Key"), 
    LADYBUG ("Ladybug", "Ladybug"), 
    LIGHT_BULB ("Light bulb", "Light bulb"), 
    LIGHTNING_BOLT ("Lightning bolt", "Lightning"), 
    LOCK ("Lock", "Lock"), 
    MAPLE_LEAF ("Maple leaf", "Maple leaf"), 
    MOON ("Moon", "Moon"), 
    NO_ENTRY_SIGN ("No Entry sign", "No entry"), 
    ORANGE_SCARECROW_MAN ("Orange scarecrow man", "Scarecrow"), 
    PENCIL ("Pencil", "Pencil"), 
    PURPLE_BIRD ("Purple bird", "Purple bird"), 
    PURPLE_CAT ("Purple cat", "Purple cat"), 
    PURPLE_DOBBLE_HAND_MAN ("Purple dobble hand man", "Purple hand"), 
    RED_LIPS ("Red lips", "Red lips"), 
    SCISSORS ("Scissors", "Scissors"), 
    SKULL_AND_CROSSBONES ("Skull and crossbones", "Skull"), 
    SNOWFLAKE ("Snowflake", "Snowflake"), 
    SNOWMAN ("Snowman", "Snowman"), 
    SPIDER ("Spider", "Spider"), 
    SPIDERS_WEB ("Spider's web", "Spider's web"), 
    SUN ("Sun", "Sun"), 
    SUNGLASSES ("Sunglasses", "Sunglasses"), 
    TARGET ("Target/crosshairs", "Target"), 
    TORTOISE ("Tortoise", "Tortoise"), 
    TREBLE_CLEF ("Treble clef", "Treble clef"), 
    TREE ("Tree", "Tree"), 
    WATER_DRIP ("Water drip", "Water drip"), 
    DOG ("Dog", "Dog"), 
    YIN_AND_YANG ("Yin and Yang", "Yin and Yang"), 
    ZEBRA ("Zebra", "Zebra"), 
    QUESTION_MARK ("Question mark", "Question"), 
    CHEESE ("Cheese", "Cheese"); 


    private String name;
    private String shortName;

    private Picture (String name, String shortName) {
        this.name = name;
        this.shortName =  shortName;
    }
    
    /**
     * Returns the long name of a picture.
     * @return the long name of the picture
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a short name of a picture. 
     * 
     * @return the short name of a picture. 
     */
    public String getShortName() {
        return shortName;
    } 
}
