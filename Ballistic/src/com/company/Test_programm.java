package com.company;
import java.util.Scanner;

public class Test_programm {

    public static void calculation(){

        System.out.println("Calculate of flight on a ballistic trajectory");

        System.out.println("Enter a initial speed: ");
        Scanner in = new Scanner(System.in);
        double V0 = in.nextDouble();

        System.out.println("Enter a angle to the Earth's surface: ");
        Scanner ina = new Scanner(System.in);
        double a = ina.nextDouble();

        double g = 9.8;

        double S = V0 * V0 * Math.sin(2 * a)/g;
        System.out.println("Flight range is " + S);

    }

}
