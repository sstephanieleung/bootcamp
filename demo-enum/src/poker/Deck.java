package poker;

import java.util.Arrays;
import java.util.Random;

public class Deck {

    private Card[] cards;

    private Deck(int numberofCards) {
        int idx = 0;
        this.cards = new Card[numberofCards];
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                cards[idx++] = Card.setCard(s, r);
            }
        }
      //  System.out.println(Arrays.toString(this.cards));
    }

    public static Deck ofPocker() {
        return new Deck(52);
    }

    public void overhead() {
        
        int numOfShuffle = new Random().nextInt(100) + 1;
        System.out.println(numOfShuffle);
        while (numOfShuffle > 0) {
            Card[] newArr = new Card[52];
            int b = new Random().nextInt(52);
            int idx = 0;
            for (int i = b; i < this.cards.length; i++) {
                newArr[idx++] = this.cards[i];
            }
            for (int i = 0; i < b; i++) {
                // System.out.println(this.cards[i].toString());
                newArr[idx++] = this.cards[i];
            }
                  //System.out.println("newArr : " +Arrays.toString(newArr));
      
            //this.cards = newArr;
            for(int i = 0 ; i<52; i++){
                this.cards[i] = newArr[i]; //Overwrite
            }         
            numOfShuffle--;
        }
        System.out.println("111     " + Arrays.toString(this.cards));
    }

    public void riffle(){
        Card[] newArr = new Card[52];
        int target = new Random().nextInt(52)+26;
        for(int i = 0; i< Math.min(52-target,target);i++){
            Card[i]
        }

    }

    public static void main(String[] args) {
        Deck d1 = Deck.ofPocker();
        d1.overhead();
    }

}
