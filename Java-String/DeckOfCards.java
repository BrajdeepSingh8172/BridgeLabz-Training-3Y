import java.util.*;
public class DeckOfCards {
    static String[] initDeck(){
        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck=new String[suits.length*ranks.length];
        int k=0;
        for(String r:ranks) for(String s:suits) deck[k++]=r+" of "+s;
        return deck;
    }
    static void shuffle(String[] deck){
        int n=deck.length;
        for(int i=0;i<n;i++){
            int r=i+(int)(Math.random()*(n-i));
            String tmp=deck[i]; deck[i]=deck[r]; deck[r]=tmp;
        }
    }
    static String[][] distribute(String[] deck,int nCards,int players){
        if(nCards*players>deck.length) return new String[0][0];
        String[][] p=new String[players][nCards];
        int k=0;
        for(int i=0;i<players;i++) for(int j=0;j<nCards;j++) p[i][j]=deck[k++];
        return p;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int nCards=sc.nextInt();
        int players=sc.nextInt();
        String[] deck=initDeck();
        shuffle(deck);
        String[][] p=distribute(deck,nCards,players);
        for(int i=0;i<p.length;i++){
            System.out.print("Player"+(i+1)+":");
            for(int j=0;j<p[i].length;j++) System.out.print(" "+p[i][j]);
            System.out.println();
        }
    }
}
