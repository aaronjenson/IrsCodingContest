package frc.team3238;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws FileNotFoundException
    {
        String[] cards = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};

        Scanner file = new Scanner(new File("D:/JudgeFiles/poker.txt"));
        file.nextLine();
        while(file.hasNext())
        {
            String handString = file.nextLine();
            String[] hand = handString.split(" ");

            boolean isThree = false;
            for(String card : cards)
            {
                int count = 0;
                for(String c : hand)
                {
                    if(c.equals(card))
                    {
                        count++;
                    }
                }

                if(count >= 3)
                {
                    isThree = true;
                    String out = card + ' ' + card + ' ' + card;
                    System.out.println(out);
                    break;
                }
            }
            if(!isThree)
            {
                for(String card : cards)
                {
                    int count = 0;
                    for(String c : hand)
                    {
                        if(c.equals(card))
                        {
                            count++;
                        }
                    }

                    if(count >= 2)
                    {
                        String out = card + ' ' + card;
                        System.out.println(out);
                        break;
                    }
                }
            }
        }
    }
}
