package DesignPatternSA;

import java.util.Set;

public class DesignPatternSA {

    public static void main(String[] args) {

        BingoGame bingo = new BingoGame();

        //Create and register players as observers
        Player players[] = {
                new Player("Tama", new int[]{3, 5, 6}),
                new Player("Amelia", new int[]{9, 2, 6}),
                new Player("Jamal", new int[]{4, 7, 2})
        };

        for (Player each : players) {
            bingo.registerObserver(each);
        }














    }
}
