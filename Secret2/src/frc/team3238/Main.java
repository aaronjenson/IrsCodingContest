package frc.team3238;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("D:/JudgeFiles/secret2.txt"));
        file.nextLine();
        while(file.hasNext())
        {
            String[] nums = file.nextLine().split(" ");
            ArrayList<Character> chars = new ArrayList<>();

            int letters = 0;
            int words = 0;

            for(String num : nums)
            {
                int number = Integer.parseInt(num);
                number -= letters;
                number -= words;
                letters++;
                if(number == ' ')
                {
                    words++;
                    letters = 0;
                }
                chars.add((char) number);
            }
            String out = "";
            for(char c : chars)
            {
                out += c;
            }
            System.out.println(out);
        }
    }
}
