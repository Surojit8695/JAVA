// 9.Write a program to display the Fibonacci series up to the n-th term using recursion.
import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        Fibbonacci fib = new Fibbonacci();
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib.fibonacci(i) + " ");
        }
        scanner.close();
    }
}
class Fibbonacci{
	
	int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}