package frc.team3238;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("D:/JudgeFiles/xdna.txt"));
        file.nextLine();
        while(file.hasNext())
        {
            String strand = file.nextLine();

            String newStrand = "";
            for(int i = 0; i < strand.length(); i++)
            {
                if(strand.charAt(i) == 'A' || strand.charAt(i) == 'C')
                {
                    newStrand += 'X';
                } else if(strand.charAt(i) == 'T')
                {
                    newStrand += 'A';
                } else if(strand.charAt(i) == 'G')
                {
                    newStrand += 'C';
                }
            }


            int numOfX = 0;
            for(int j = 0; j < newStrand.length(); j++)
            {
                if(newStrand.charAt(j) == 'X') {
                    numOfX++;
                }
            }
            if(numOfX > ((double) newStrand.length()) / 2) {
                newStrand = "X";
            }
            System.out.println(newStrand);
        }
    }
}
