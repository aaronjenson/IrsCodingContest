package frc.team3238;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("D:/JudgeFiles/where.txt"));

        String in = file.nextLine();
        String[] coord = in.split(",");
        double x = Double.parseDouble(coord[0].replace('(', ' ').split(" ")[1]);
        double y = Double.parseDouble(coord[1].substring(0, coord[1].length() - 1));

        in = file.nextLine();
        coord = in.split(",");
        double vx = Double.parseDouble(coord[0].replace('(', ' ').split(" ")[1]);
        double vy = Double.parseDouble(coord[1].substring(0, coord[1].length() - 1));

        in = file.nextLine();
        coord = in.split(",");
        double ax = Double.parseDouble(coord[0].replace('(', ' ').split(" ")[1]);
        double ay = Double.parseDouble(coord[1].substring(0, coord[1].length() - 1));

        double t = Double.parseDouble(file.nextLine());

        double fin_x = x + (vx * t) + ( ax * t);
        double fin_y = y + (vy * t) + (ay * t);

        System.out.println("(" + fin_x + "," + fin_y + ")");

        double fin_vx = vx + (ax);
        double fin_vy = vy + (ay);

        System.out.println("(" + fin_vx + "," + fin_vy + ")");

    }
}
