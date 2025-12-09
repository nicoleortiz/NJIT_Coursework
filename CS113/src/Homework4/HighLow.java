package Homework4;

import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class HighLow {
    /*
    A deck of cards is created and shuffled. 
    One card is dealt from the deck and shown to the user. 
    The user predicts whether the next card from the deck will be higher or lower 
    (eg. “H” or “L” keyboard entries)than the current card. 
    If the user predicts correctly the newly dealt card becomes the current card. 
    The game continues until the prediction is incorrect (or no more cards to deal - 
    what is the chance of someone predicting correctly 51 times?  ). 
    The program displays the user's (player)’s score which is the number of correct predictions.
    */
    
    public static int numCorrect;
    public static DeckOfCards deck = new DeckOfCards();
    public static void main(String[] args){
        //Set Up
        numCorrect = 0;
        makeDeck();
        Scanner s = new Scanner(System.in);
        
        while(deck.getRemainingLength() > 1){
            deck.dealCard();
            System.out.println("Will the next card be higher (H) or lower (L)?");
            String answer = s.nextLine();
            checkAnswer(answer);
        }
        
        System.out.println("You were correct " + numCorrect + " times. Congrats!");
    }
    public static void makeDeck(){
        deck.createDeck();
        deck.shuffle();
    }
    public static void checkAnswer(String ans){
        if(ans.equals("H") || ans.equals("h")){
            if(deck.getLastDealt().getFace() < deck.getNextCard().getFace()){
                numCorrect++;
                System.out.println("Correct");
            }
            else
                System.out.println("Incorrect");
        }
        if(ans.equals("L") || ans.equals("l")){
            if(deck.getLastDealt().getFace() > deck.getNextCard().getFace()){
                numCorrect++;
                System.out.println("Correct");
            }
            else
                System.out.println("Incorrect");
        }
    }
}
