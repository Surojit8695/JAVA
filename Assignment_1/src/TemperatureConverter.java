//4.Write a program to convert the given temperature in Fahrenheit to Celsius using the conversion 
//formula: C = (F-32)/1.8.
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("The temperature in Celsius is: %.2f°C%n", celsius);
        // ° to get this symbol 
        //Hold down the Alt key and type 0176 on the numeric keypad, then release the Alt key.
        sc.close(); //object close scanner()
    }
}
