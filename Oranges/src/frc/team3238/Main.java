package frc.team3238;

import javafx.util.converter.BigIntegerStringConverter;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("D:/JudgeFiles/oranges.txt"));
        file.nextLine();
        while(file.hasNext())
        {
            BigInteger oranges = new BigIntegerStringConverter().fromString(file.nextLine());
            int count = 0;
            while(!oranges.equals(BigInteger.ZERO))
            {
                count++;
                if(oranges.mod(new BigInteger("2")).equals(BigInteger.ZERO))
                {
                    oranges = oranges.divide(new BigInteger("2"));
                    continue;
                }
                if(oranges.equals(new BigInteger("3"))) {
                    oranges = oranges.subtract(BigInteger.ONE);
                    continue;
                }
                if(oranges.add(BigInteger.ONE).mod(new BigInteger("4")).equals(BigInteger.ZERO)) {
                    oranges = oranges.add(BigInteger.ONE);
                    continue;
                }
                if(oranges.subtract(BigInteger.ONE).mod(new BigInteger("4")).equals(BigInteger.ZERO)) {
                    oranges = oranges.subtract(BigInteger.ONE);
                    continue;
                }
            }
            System.out.println(count);
        }
    }
}
