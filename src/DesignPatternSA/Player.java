package DesignPatternSA;

import java.util.Observable;
import java.util.Observer;


public class Player implements Observer {

    private int[] bingoCard;
    private String name;

    //getters
    public int[] getBingoCard() {
        return bingoCard;
    }

    public String getName() {
        return name;
    }

    //contructor
    public Player(String name, int bingoCard[]){
        this.name = name;
        this.bingoCard = bingoCard;

    }

    public void update(Observable mySubject, Object calledNumber){

        /*
        if(currentTicket.equals(this.getTicketNumber())) {
            System.out.println("Thanks, here is my card number " + getTicketNumber() +
                    ". I am ready to see the doctor.");
        }

         */

    }


}
