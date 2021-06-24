package com.bridgelabz.junitprograms;
import java.util.Scanner;
public class DecimalToBinary {
    /**
     * Taking the decimal number from the user and dividing the number by modular division and taking the remainder and storing it
     * in string by reversing that string it is printing binary number.
     * @param args
     */
    public static void main(String args[])
    {
        String binaryNumber="";
        String reversalOfNumber="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decimal number to which you want binary number:");
        int number=scanner.nextInt();
        int divisor=2;
        int remainder = 0;
        while (number!=0){
            remainder=number%divisor;
            number=number/divisor;
            binaryNumber+=remainder;
        }
        for(int i=binaryNumber.length()-1;i>=0;i--){
            char c=binaryNumber.charAt(i);
            reversalOfNumber+=c;
        }
        System.out.println("The binary number of a given decimal number is :"+reversalOfNumber);
    }
}
