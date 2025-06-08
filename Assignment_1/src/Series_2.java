//10. Write a Program of Sum of Series (1+x+x2+x3+x4+. up to n-th terms). 

import java.util.Scanner;

public class Series_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter the number of terms n: ");
        int n = sc.nextInt();
        
        int i,sum=0;
        int term=1;
        for(i=1;i<=n;i++)
        {
        	 sum += term;
             term *= x; 
        }
        System.out.println("Sum of the series: " + sum);
        sc.close();

	}

}
