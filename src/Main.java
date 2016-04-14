

public class Main {
    public static void main(String[] args){

        Player playerOne = new Player("Mario", 100, 25, 0);
        Player playerTwo = new Player("Luigi", 70, 50, 0);

        Enemy caveTroll = new Enemy("troll", 40);
        Enemy shrek = new Enemy("ogre", 90);

        Treasure ring = new Treasure("shiny golden ring", 50);
        Treasure amulet = new Treasure("crystal amulet", 100);

        Quest rescue = new Quest("Rescue Mission", 45, 250);
        Quest explore = new Quest("Explore Dungeon", 80, 150);

        Dungeon castle = new Dungeon("Bowser's Castle", 4);
        Dungeon mausoleum = new Dungeon("The Mausoleum", 8);


        System.out.println(playerOne);
        System.out.println(playerTwo);

        System.out.println();

        System.out.println(caveTroll);
        System.out.println(shrek);

        System.out.println();

        System.out.println(ring);
        System.out.println(amulet);

        System.out.println();

        System.out.println(rescue);
        System.out.println(explore);

        System.out.println();

        System.out.println(castle);
        System.out.println(mausoleum);


    }
}
