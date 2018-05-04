package frc.team3238;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static class Player
    {
        public class Card
        {
            public int num;
            public String suit;

            public Card(int num, String suit)
            {
                this.num = num;
                this.suit = suit;
            }

            public boolean matches(Card card)
            {
                return num == card.num || suit.equals(card.suit);
            }
        }

        public ArrayList<Card> cards;

        public Player(String cards)
        {
            this.cards = new ArrayList<>();

            String[] cardStrings = cards.split(" ");
            for(String cs : cardStrings)
            {
                this.cards.add(new Card(Integer.parseInt(cs.substring(0, 1)), cs.substring(1)));
            }
        }

        public int chainLength()
        {
            return chainLength(cards, new Card(0, "Z"));
        }

        private int chainLength(ArrayList<Card> cards1, Card last)
        {
            ArrayList<Card> matches = new ArrayList<>();
            for(Card c : cards1)
            {
                if(last.matches(c))
                {
                    matches.add(c);
                }
            }
            int maxLength = 0;
            for(Card c : matches)
            {
                ArrayList<Card> newCards = new ArrayList<>(cards1);
                newCards.remove(c);
                maxLength = Math.max(maxLength, 1 + chainLength(newCards, c));
            }
            return maxLength;
        }
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(
                new File("C:/Users/jensoaar000/Documents/CodeProjects/IrsCodingContest/SampleFiles/cero.txt"));
        file.nextLine();
        while(file.hasNext())
        {
            Player p = new Player(file.nextLine());
            System.out.println(p.chainLength());
        }
    }
}
