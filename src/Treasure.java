/**
 * The Treasure class represents a piece of treasure.
 */

public class Treasure {

    /**
     * The name of the piece of Treasure.
     */
    String treasureName;

    /**
     * How much gold the Treasure can be sold for.
     */
    int treasureValue;


    /**
     * Constructor for a new Treasure object
     * @param name The name of the Treasure.
     * @param value How much gold the Treasure is worth.
     */
    public Treasure(String name, int value){
        this.treasureName = name;
        this.treasureValue = value;
    }

    /**
     * Returns a String describing the Treasure object.
     * @return The aforementioned String.
     */
    public String toString(){
        return "The " + this.treasureName + " is worth " + this.treasureValue + " gold pieces.";
    }
}
