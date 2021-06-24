package com.bridgelabz.junitprograms;
import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non negative number : ");
        int number= scanner.nextInt();
        double epsilon = 1e-15;
        double squareRoot = number;
        while (Math.abs(squareRoot - number/squareRoot) > epsilon*squareRoot){
            squareRoot = (number/squareRoot + squareRoot) / 2.0;
        }
        System.out.println("square root of the number : " +number+ " is " +squareRoot);
    }
}
