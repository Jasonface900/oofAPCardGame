package elevenslabs;

import elevenslabs.carddata.Card;
import elevenslabs.carddata.Deck;

public class ElevensLabs {

    public static void main(String[] args) {
        Card testCard = new Card();
        Card testCard2= new Card("Mind", "Mage", 9001);
        System.out.println(testCard.toString());
        System.out.println(testCard2.toString());
        
        //String[] suits = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        //String[] ranks = {"DOG", "PIG", "COW", "BAT", "CAT", "RAT", "BEE", "FOX", "ANT", "RAM"};
        //int[] values = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        
        //Deck testDeck = new Deck(suits, ranks, values);
        Deck testDeck = new Deck();
        System.out.println(testDeck.toString());
        testDeck.randomShuffle();
        System.out.println(testDeck.toString());
        
    }
    
}
