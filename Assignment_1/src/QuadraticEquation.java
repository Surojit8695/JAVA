//1.	Write a program to find the real roots of the quadratic equation
//ax² + bx + c = 0 where a, b, and c are constants.
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        //discriminant
        double discriminant = b * b - 4 * a * c;

        // Checking for real roots
        if (discriminant > 0) {//2
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            
            System.out.println("X1= "+x1);
            System.out.println("X2= "+x2);
        } else if (discriminant == 0) {//1
            double x = -b / (2 * a);
            System.out.println("Real and equal root: " + x);
        } else {//0
            System.out.println("No real roots exist.");
        }

        sc.close();
    }
}
