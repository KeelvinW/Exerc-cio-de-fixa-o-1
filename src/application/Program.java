package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String [] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle reactangle = new Rectangle();

        System.out.println("Enter rectangle width and heigth: ");
        reactangle.width = sc.nextDouble();
        reactangle.heigth = sc.nextDouble();

        System.out.printf("Area: %.2f%n", reactangle.area());
        System.out.printf("Perimeter: %.2f%n", reactangle.perimeter());
        System.out.printf("Diagonal: %.2f%n", reactangle.diagonal());


    }
}
