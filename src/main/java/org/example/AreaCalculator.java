/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */

package org.example;
import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        final double CONVERSION_FACTOR = 0.09290304;

        Scanner getWidth = new Scanner(System.in);
        Scanner getLength = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        Integer length= getLength.nextInt();

        System.out.print("What is the width of the room in feet? ");
        Integer width = getWidth.nextInt();

        System.out.print(String.format("You entered dimensions of %d feet by %d feet.",length, width));

        Integer area_ft = length * width;
        Double area_m  = area_ft * CONVERSION_FACTOR;

        System.out.print(String.format("\nThe area is\n%d square feet\n%.03f square meters",area_ft, area_m));
    }
}
