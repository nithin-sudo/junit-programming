package com.bridgelabz.junitprograms;
import java.util.Scanner;
public class MonthlyPayment {
    /**
     * Taking principle amount,years,rateOfInterest as input and calculating monthlyPayment accordingly.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        int principleAmount = scanner.nextInt();
        System.out.print("Number of Years: ");
        int years = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double rateOfInterest = scanner.nextDouble();
        double monthlyRate = rateOfInterest / 1200;
        double monthlyPayment = principleAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));
        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
    }
}
