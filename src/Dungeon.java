/**
 * The Dungeon class represents a dungeon the player can explore.
 */

public class Dungeon {

    /**
     * The name of the Dungeon.
     */
    String dungeonName;

    /**
     * How many levels deep the Dungeon is.
     */
    int dungeonLevels;


    /**
     * Constructor for a new Dungeon object.
     * @param name The name of the Dungeon
     * @param levels How many levels are in the Dungeon.
     */
    public Dungeon(String name, int levels){
        this.dungeonName = name;
        this.dungeonLevels = levels;
    }

    /**
     * Returns a String describing the Dungeon object.
     * @return The aforementioned String.
     */
    public String toString(){
        return "The " + this.dungeonName + " dungeon is " + this.dungeonLevels + " levels deep.";
    }

}
