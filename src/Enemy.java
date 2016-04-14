/**
 * The Enemy class represents a single enemy.
 */

public class Enemy {

    /**
     * Describes which type of Enemy this is.
     */
    String enemyType;

    /**
     * The Enemy's current hit points.
     */
    int enemyHealth;

    /**
     * Constructor for an Enemy.
     * @param type What type of enemy
     * @param health The enemy's starting hit points
     */
    public Enemy(String type, int health){
        this.enemyType = type;
        this.enemyHealth = health;
    }


    /**
     * Returns a String describing the Enemy object.
     * @return The aforementioned String.
     */
    public String toString(){
        return "The " + this.enemyType + " enemy has " + this.enemyHealth + " hit points.";
    }

}
