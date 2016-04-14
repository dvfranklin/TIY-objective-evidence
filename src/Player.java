/**
 * The Player class represents an individual player in the game.
 */

public class Player {

    /**
     * The name of the Player.
     */
    String playerName;

    /**
     * The Player's current hit points.
     */
    int playerHealth;

    /**
     * The Player's current mana points.
     */
    int playerMana;

    /**
     * The amount of gold the Player currently has.
     */
    int playerGold;

    /**
     * Constructor for a Player.
     * @param name The Player's name
     * @param health The Player's starting hit points
     * @param mana The Player's starting mana points
     * @param gold The Player's starting gold
     */
    public Player(String name, int health, int mana, int gold){
        this.playerName = name;
        this.playerHealth = health;
        this.playerMana = mana;
        this.playerGold = gold;
    }

    /**
     * Returns a String describing the Player's current state.
     * @return The aforementioned String.
     */
    public String toString(){
        return this.playerName + " has " + this.playerHealth + " hit points, " + this.playerMana + " mana points and " + playerGold + " gold.";
    }


}
