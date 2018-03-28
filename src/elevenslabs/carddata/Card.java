package elevenslabs.carddata;

public class Card {
    final private String suit, rank;
    final private int pointValue;
    
    public Card(String suit, String rank, int pointValue){
        this.suit = suit;
        this.rank = rank;
        this.pointValue = pointValue;
    }
    
    public Card(){
        this.suit = "NULL";
        this.rank = "NULL";
        this.pointValue = 0;
    }
    
    public Card(Card tempCard){
        this.suit = tempCard.getSuit();
        this.rank = tempCard.getRank();
        this.pointValue = tempCard.getPointValue();
    }
    
    public String getSuit(){
        return this.suit;
    }
    
    public String getRank(){
        return this.rank;
    }
    
    public int getPointValue(){
        return this.pointValue;
    }
    
    @Override
    public String toString(){
        return rank + " of " + suit + " (point value: " + pointValue + ").";
    }
}
