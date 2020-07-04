package DesignPatternSA;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class BingoGame extends Observable{

    private ArrayList numbersToCall = new ArrayList();
    private ArrayList<Observer> observers;

    //constructor
    public BingoGame(){

        //generate the 10 numbers to call for Bingo Game
        for (int i = 0; i < 10 ; i++) {
            numbersToCall.add(i);
        }

        this.numbersToCall = numbersToCall;

        System.out.println("Starting the simple Bingo game...");
    }

    //getter
    public ArrayList getNumbersToCall() {
        return numbersToCall;
    }

    public int callOutNumber(){



    }






    // Observer/Observable methods
    public void notifyObservers(Observable observable, int numberCalled){
        for (Observer ob : observers) {
            ob.update(observable, numberCalled);
        }
        setChanged();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }





}
