package Homework4;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Nicole
 */
public class DeckOfCards {
    //Problem2
    
    private final ArrayList<Card> deck = new ArrayList();
    private final ArrayList<Card> shuffledDeck = new ArrayList();
    private final ArrayList<Card> dealtCards = new ArrayList();
    private Random r;
    
    public DeckOfCards(){}
    
    public void createDeck(){
        int f = 1;
        while(f < 14){
            Card c = new Card(f, 1);
            Card d = new Card(f, 2);
            Card h = new Card(f, 3);
            Card s = new Card(f, 4);
            deck.add(c);
            deck.add(d);
            deck.add(h);
            deck.add(s);
            f++;
        }
    }
    
    public void shuffle(){
        r = new Random();
        int i = getListLength();
        while(i > 0){
            int spot = r.nextInt(getListLength());
            shuffledDeck.add(deck.get(spot));
            deck.remove(spot);
            i = getListLength();
        }
    }
    
    public void dealCard(){
        System.out.println("You are given: " + shuffledDeck.get(0).getFaceName() + " of " + shuffledDeck.get(0).getSuitName());
        dealtCards.add(shuffledDeck.get(0));
        shuffledDeck.remove(0);
    }
    
    private int getListLength(){
        int count=0;
        for(Card c : deck){
            count++;
        }
        return count;
    }
    
    public void testClass(){
        createDeck();
        System.out.println("Deck: " + deck);
        shuffle();
        System.out.println("Shuffled Deck: " + shuffledDeck);
        dealCard();
        System.out.println("Cards Left: " + shuffledDeck.size());
    }
    
    public Card getLastDealt(){
        return dealtCards.get(dealtCards.size()-1);
    }
    
    public Card getNextCard(){
        return shuffledDeck.get(0);
    }
    
    public int getRemainingLength(){
        return shuffledDeck.size();
    }
}
