package com.bridgelabz.junitprograms;
import java.util.Scanner;
public class VendingMachine {
    /**
     * Taking the input from the user as changeToBeReturned and returning the change with minimum number of notes and printing
     * total number of notes as well.
     * @param noteArray
     */
    public static void vendingMachine(int[] noteArray){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Change in Rs to be returned by the vending machine :");
        int changeToBeReturned = scanner.nextInt();
        int noteCount,totalNotes = 0;
        System.out.println("different types of denominations and their count:");
        for(int i=0;i<8;i++)
        {
            noteCount=changeToBeReturned/noteArray[i];
            if(noteCount>0) {
                System.out.println(noteArray[i] + "\tx\t" + noteCount + "\t= " + noteArray[i] * noteCount);
            }
            totalNotes=totalNotes+noteCount;
            changeToBeReturned=changeToBeReturned%noteArray[i];
        }
        System.out.println("total no. of notes : " +totalNotes);
    }
    /**
     * intializing an array of values and calling vendingMachine method by passing those array values.
     * @param args
     */
    public static void main(String[] args){
        int[] noteArray= {1000,500,100,50,10,5,2,1};
        vendingMachine(noteArray);
    }
}
