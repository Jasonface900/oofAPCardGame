package elevenslabs.carddata;

import java.util.ArrayList;

public class Deck {
    private int size, maxSize;
    private ArrayList<Card> cards;
    
    public Deck(){
        cards = new ArrayList();
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "King", "Queen"};        
        for(int suitInt = 0; suitInt < 4; suitInt++){
            for(int pointInt = 0; pointInt < 13; pointInt++){
                Card tempCard = new Card(suits[suitInt], ranks[pointInt], pointInt + 1);
                cards.add(tempCard);
            }
        }
    }
    
    public Deck(String[] suits, String[] ranks, int[] values){
        //this.cards = new ArrayList();
        if(ranks.length != suits.length && suits.length != values.length)
            System.err.println("NOT ENOUGH VALUES TO CREATE A CARD!");
        for(int x = 0; x < suits.length; x++){
            Card tempCard = new Card(suits[x], ranks[x], values[x]);
            cards.add(x, tempCard);
        }
        size = cards.size();
    }
    
    public Deck(Card[] cards, int maxSize){
        this.maxSize = maxSize;
    }
    
    public Deck(Card[] cards){
        maxSize = cards.length;
    }
    
    public Card deal(){
        Card tempCard = new Card(cards.get(size - 1));
        size-=1;
        return tempCard;
    }
    
    @Override
    public String toString(){
        String largeAF="\n";
        for (Card card : cards)
            largeAF = largeAF + "Card #"+ (cards.indexOf(card) + 1) + " =\t"+ card.toString() + "\n";
        return largeAF;
    }
    
    // 1 2 3 4 5 6 7 8 9 10
    // 1 2 3 4 5
    // 6 7 8 9 10
    // 1 6 2 7 3 8 4 9 5 10
    // 1 6 2 7 3
    // 8 4 9 5 10
    // 1 8 6 4 2 9 7 5 3 10
    // 1 8 6 4 2
    // 9 7 5 3 10
    // 1 9 8 7 6 5 4 3 2 10
    // 1 9 
    public void perfectShuffle(){
        Card[] tempCards = new Card[size];
        for(Card card : cards)
            tempCards[cards.indexOf(card)] = card;
        for (int x = 0; x < size; x++) {
            if (x < cards.size() / 2) {
                cards.set(x * 2, tempCards[x]);
            } else {
                cards.set((x * 2) - 9 , tempCards[x]);
            }
        }
    }
    
    public void randomShuffle(){
        ArrayList<Card> tempDeck = new ArrayList();
        int currentCard;
        while(!cards.isEmpty()){
            currentCard = (int)(Math.random() * cards.size());
            tempDeck.add(cards.get(currentCard));
            cards.remove(currentCard);
        }
        for(Card card: tempDeck)
            cards.add(card);
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int getMaxSize(){
        return maxSize;
    }
    
    public int getSize(){
        return cards.size();
    }
}
