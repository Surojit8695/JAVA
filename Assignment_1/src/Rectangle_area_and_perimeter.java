//3. Write a program to calculate the area and perimeter of a rectangle.
import java.util.Scanner;

public class Rectangle_area_and_perimeter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter side 1:");
		float side1=sc.nextFloat();
		System.out.print("Enter side 2:");
		float side2=sc.nextFloat();
		float area=side1*side2;//area
		float perimeter=2*(side1+side2);//perimeter
		System.out.println("The area of the ractangle is:"+area);
		System.out.println("The perimeter of the ractangle is:"+perimeter);
		sc.close();
	}

}
