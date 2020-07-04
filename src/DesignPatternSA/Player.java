package DesignPatternSA;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class Player implements Observer {

    private ArrayList<Integer> bingoCard;
    private String name;
    private boolean hasWon;

    //getters
    public ArrayList<Integer> getBingoCard() {
        return bingoCard;
    }

    public String getName() {
        return name;
    }

    public boolean getHasWon() {
        return hasWon;
    }

    //contructor
    public Player(String name, ArrayList<Integer> bingoCard){
        this.name = name;
        this.bingoCard = bingoCard;
        this.hasWon = false;

        System.out.println(name + " has entered the game, their bingo card numbers are " + bingoCard);

    }

    public void update(Observable mySubject, Object calledNumber){

        getBingoCard().remove(calledNumber);  //cross number off bingocard

        if(getBingoCard().isEmpty()){
            this.hasWon = true;
        }

    }


}
