package com.bridgelabz.junitprograms;
import java.util.Scanner;
public class Binary {
    static Scanner scanner = new Scanner(System.in);
    /**
     * Taking decimal number as input and converting it to binary and by swapping nibbles and printing it's decimal number.
     * calling powerOfTwo method by passing decimalNumber as argument.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Enter the decimal number to convert it into binary: ");
        int decimalNumber = scanner.nextInt();
        System.out.println("Binary conversion of the given number: " + Integer.toBinaryString(decimalNumber));
        decimalNumber = (((decimalNumber & 0x0F) << 4) | ((decimalNumber & 0xF0) >> 4));
        System.out.println("after swapping decimal value of the binary  is:" + decimalNumber);
        powerOfTwo(decimalNumber);
    }
    /**
     * Taking the argument and checking whether it is a power of two or not.
     * @param decimalNumber
     */
    public static void powerOfTwo(int decimalNumber){
        int power=0;
        int twoPower=0;
        boolean powerOfTwo=false;
        while (twoPower<=decimalNumber){
            twoPower=(int)(Math.pow(2,power));
            power++;
            if(twoPower==decimalNumber){
                powerOfTwo=true;
            }
        }
        if(powerOfTwo){
            System.out.println(decimalNumber+" is power of Two ");
        }
        else{
            System.out.println(decimalNumber+" is not a Power of Two");
        }
    }
}