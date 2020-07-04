package DesignPatternSA;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class Player implements Observer {

    private ArrayList<Integer> bingoCard;
    private String name;

    //getters
    public ArrayList<Integer> getBingoCard() {
        return bingoCard;
    }

    public String getName() {
        return name;
    }

    //contructor
    public Player(String name, ArrayList<Integer> bingoCard){
        this.name = name;
        this.bingoCard = bingoCard;

        System.out.println(name + " has entered the game, their bingo card numbers are " + bingoCard);

    }

    public void update(Observable mySubject, Object calledNumber){

        for (int i = 0; i < getBingoCard().size() ; i++) {
            if (bingoCard[i] == (int)calledNumber){
                bingoCard.
            }


        }

    }


}
