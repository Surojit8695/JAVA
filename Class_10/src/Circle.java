import java.util.Scanner;

public class Circle {
	
		double radius,area;
		
		void input() {
			System.out.println("Enter the radius:");
			Scanner sc=new Scanner(System.in);
			radius=sc.nextInt();
		}
		double getArea() {
			area=Math.PI*radius*radius;
			return area;
		}
}
