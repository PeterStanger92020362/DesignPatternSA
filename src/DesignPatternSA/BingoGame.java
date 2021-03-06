package DesignPatternSA;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class BingoGame extends Observable{

    private ArrayList<Integer> numbersToCall = new ArrayList<>();
    private ArrayList<Observer> observers;
    private Random rand = new Random();
    private int winners;

    //constructor
    public BingoGame(){

        //generate the 10 numbers to call for Bingo Game
        for (int i = 0; i < 10 ; i++) {
            numbersToCall.add(i+1);
        }

        this.numbersToCall = numbersToCall;
        this.observers = new ArrayList<Observer>(){};
        this.winners = 0;

        System.out.println("Starting the simple Bingo game...");
    }

    //getter
    public ArrayList<Integer> getNumbersToCall() {
        return numbersToCall;
    }

    public int getWinners(){
        return winners;
    }

    //setter
    public void setWinners(){
        this.winners++;
    }



    public void callOutNumber(){
        Integer calledNumber = 0;

        calledNumber = getNumbersToCall().get(
                rand.nextInt(
                        getNumbersToCall().size()));
        System.out.println("Calling out a random number between 1 and 10 inclusive.... " +
                "the number is....." + calledNumber);

        getNumbersToCall().remove(calledNumber);  //remove called number from  numbers to call

        setChanged();
        notifyObservers(this,calledNumber);

    }






    // Observer/Observable methods
    public void notifyObservers(Observable observable, Integer numberCalled){
        for (Observer ob : observers) {
            ob.update(observable, numberCalled);
        }

    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }





}
