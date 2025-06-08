//4. Write a program to convert the given temperature in Fahrenheit to Celsius
//using the following conversion formula: C= (F-32)/1.8 
import java.util.Scanner;

public class Temparature_converter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        float fahrenheit = sc.nextFloat();
        float celsius = (fahrenheit - 32) / 1.8f;
        System.out.printf("The temperature in Celsius is: %.2f°C%n", celsius);
    }
}
