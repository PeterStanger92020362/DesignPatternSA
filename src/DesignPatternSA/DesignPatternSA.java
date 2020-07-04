package DesignPatternSA;

import java.util.ArrayList;
import java.util.Observer;


public class DesignPatternSA {

    public static void main(String[] args) {

        BingoGame bingo = new BingoGame();


        //Create and register players as observers
        ArrayList<Integer> tamaBingoCard = new ArrayList<>();
        tamaBingoCard.add(3);
        tamaBingoCard.add(5);
        tamaBingoCard.add(6);

        ArrayList<Integer> ameliaBingoCard = new ArrayList<>();
        ameliaBingoCard.add(9);
        ameliaBingoCard.add(2);
        ameliaBingoCard.add(6);

        ArrayList<Integer> jamalBingoCard = new ArrayList<>();
        jamalBingoCard.add(4);
        jamalBingoCard.add(7);
        jamalBingoCard.add(2);



        Player players[] = {
                new Player("Tama", tamaBingoCard),
                new Player("Amelia", ameliaBingoCard),
                new Player("Jamal", jamalBingoCard)
        };

        for (int i = 0; i < players.length ; i++) {
            bingo.registerObserver(players[i]);
        }


        while(bingo.getWinners()<1){

            bingo.callOutNumber();

            for (Player each: players) {
                if(each.getHasWon()){
                    bingo.setWinners();
                }
            }


        }

        //wrap up and congratulate winner/s

        for(Player each: players){
            if(bingo.getWinners()==1 && each.getHasWon()) {
                System.out.println("BINGO! " + each.getName() + " has all their numbers called! " + each.getName() + " is the WINNER!");
            } else if (bingo.getWinners()>=2 && each.getHasWon()){
                System.out.println("BINGO! " + each.getName() + " has all their numbers called! they share their VICTORY!");
            }
        }




    }
}
