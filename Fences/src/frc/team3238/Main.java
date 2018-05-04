package frc.team3238;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("D:/JudgeFiles/fences.txt"));
        file.nextLine();
        while(file.hasNext())
        {
            double area = Math.pow(file.nextInt() / 4.0, 2);
            if((int) area == area)
            {
                System.out.println((int) area);
            }
            else
            {
                System.out.println(area);
            }
        }
    }
}
