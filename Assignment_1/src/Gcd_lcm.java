//15. Write a program to calculate the GCD and LCM of two numbers (implement 2 versions).
import java.util.Scanner;

public class Gcd_lcm {
    public static void main(String[] args) {
    	GCD_LCMa g1=new GCD_LCMa();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        
        System.out.println("GCD: " + g1.gcd(num1, num2));
        System.out.println("LCM: " + g1.lcm(num1, num2));
    }
}
class GCD_LCMa{
	
	int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;//gcd
    }

    int lcm(int num1, int num2) {
        return (num1 * num2) / gcd(num1, num2);
    }
}