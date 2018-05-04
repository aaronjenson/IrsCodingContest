package frc.team3238;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws FileNotFoundException
    {
        double height = 4;
        double pi = 3.14;

        Scanner file = new Scanner(new File("D:/JudgeFiles/cake.txt"));
        file.nextLine();

        DecimalFormat rounding = new DecimalFormat("0.00");
        rounding.setRoundingMode(RoundingMode.HALF_UP);
        while(file.hasNext())
        {
            double r = file.nextDouble();

            ArrayList<Double> layers = new ArrayList<>();

            double radius = r;
            while(radius >= 2)
            {
                layers.add(radius);
                radius -= 3;
            }

            double totalVol = 0;
            for(double layer : layers)
            {
                totalVol += (pi * Math.pow(layer, 2) * height);
            }

            System.out.println(rounding.format(totalVol));
        }
    }
}
