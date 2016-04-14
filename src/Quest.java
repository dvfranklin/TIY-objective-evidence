/**
 * The Quest class represents an individual quest in the game.
 */

public class Quest {

    /**
     * The name of the Quest.
     */
    String questName;


    /**
     * How much gold the Player will earn for completing the Quest.
     */
    int questGoldReward;

    /**
     * How much experience the Player will earn for completing the Quest.
     */
    int questExpReward;


    /**
     * Constructor for a new Quest object.
     * @param name The name of the Quest.
     * @param gold The gold reward for completing the Quest.
     * @param exp The experience reward for completing the Quest.
     */
    public Quest(String name, int gold, int exp){
        this.questName = name;
        this.questGoldReward = gold;
        this.questExpReward = exp;
    }

    /**
     * Returns a String describing the Quest object.
     * @return The aforementioned String.
     */
    public String toString(){
        return "The " + this.questName + " quest rewards " + this.questGoldReward + " gold pieces and " + questExpReward + " experience.";
    }
}
