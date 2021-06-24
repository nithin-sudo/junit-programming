package com.bridgelabz.junitprograms;
import java.util.Scanner;
public class TemperatureConversion {
    /**
     * Taking option from the user and using switch calling celsiusToFahrenheit and fahrenheitToCelsius methods
     * by passing celsius and fahrenheit as arguments.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Program for Unit conversion of Fahrenheit to Celsius and vice-versa");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Celsius to Fahrenheit\n2.Fahrenheit to Celsius\nChoose the conversion from above: ");
        int chooseOption=scanner.nextInt();
        switch (chooseOption) {
            case 1: System.out.println("Enter the value of Celsius: ");
                double celsius=scanner.nextDouble();
                celsiusToFahrenheit(celsius);
                break;
            case 2: System.out.println("Enter the value of Fahrenheit ");
                double fahrenheit=scanner.nextDouble();
                fahrenheitToCelsius(fahrenheit);
        }
    }
    /**
     * converting celsius to fahrenheit.
     * @param temperature
     */
    public static void celsiusToFahrenheit(double temperature) {
        double celsiusToFahrenheit=(double)(temperature*9/5)+32;
        System.out.println(temperature+" Celsius in Fahrenheit is "+celsiusToFahrenheit);
    }
    /**
     *converting fahrenheit to celsius.
     * @param temperature
     */
    public static void fahrenheitToCelsius(double temperature) {
        double fahrenheitToCelsius=(double)(temperature-32)*5/9;
        System.out.println(temperature+" Fahrenheit in Celsius is "+fahrenheitToCelsius);
    }
}
