package frc.team3238;

import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static List<String> readFile(String fileName)
    {
        List<String> lines = Collections.emptyList();

        try
        {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch(IOException e)
        {
            e.printStackTrace();
        }
        return lines;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
//        List<String> data = readFiles("D:/JudgeFiles/cc.txt");
        List<String> data = readFile("C:/Users/jensoaar000/Documents/CodeProjects/SampleFiles/cc.txt");
//
        for(String line : data)
        {
            System.out.println(line);
        }

//        Scanner file = new Scanner(new File("D:/JudgeFiles/cc.txt"));
//        while(file.hasNext())
//        {
//            System.out.println(file.nextLine());
//        }

        /*int numLines = Integer.parseInt(data.get(0));

        DecimalFormat rounding = new DecimalFormat("0.0");
        rounding.setRoundingMode(RoundingMode.HALF_UP);

        for(int i = 1; i <= numLines; i++)
        {
            String line = data.get(i);

            String[] vals = line.split(" ");
            double a = Double.parseDouble(vals[0]);
            double b = Double.parseDouble(vals[1]);
            double c = Double.parseDouble(vals[2]);

            double init = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            double fin = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

            double dist = init - fin;

            System.out.println(rounding.format(dist));
        }*/
    }
}
