package frc.team3238;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("D:/JudgeFiles/secret.txt"));
        file.nextLine();
        while(file.hasNext())
        {
            int a = 'a';
            int z = 'z';

            int shift = file.nextInt() * file.nextInt();
            String line = file.nextLine().substring(1);

            String ogLine = "";
            for(int i = 0; i < line.length(); i++)
            {
                char c = line.charAt(i);
                if(c == ' ')
                {
                    ogLine += ' ';
                    continue;
                }

                int nc = c - shift;
                while(nc < a)
                    nc += 26;
                while(nc > z)
                    nc -= 26;

                ogLine += (char) nc;
            }
            System.out.println(ogLine);
        }
    }
}
