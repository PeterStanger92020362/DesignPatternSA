package DesignPatternSA;

import java.util.ArrayList;


public class DesignPatternSA {

    public static void main(String[] args) {

        BingoGame bingo = new BingoGame();


        //Create and register players as observers
        ArrayList<Integer> tamaBingoCard = new ArrayList<>();
        tamaBingoCard.add(3);
        tamaBingoCard.add(5);
        tamaBingoCard.add(6);

        ArrayList<Integer> ameliaBingoCard = new ArrayList<>();
        tamaBingoCard.add(9);
        tamaBingoCard.add(2);
        tamaBingoCard.add(6);

        ArrayList<Integer> jamalBingoCard = new ArrayList<>();
        tamaBingoCard.add(4);
        tamaBingoCard.add(7);
        tamaBingoCard.add(2);

        Player players[] = {
                new Player("Tama", tamaBingoCard),
                new Player("Amelia", ameliaBingoCard),
                new Player("Jamal", jamalBingoCard)
        };

        for (Player each : players) {
            bingo.registerObserver(each);
        }


















    }
}
