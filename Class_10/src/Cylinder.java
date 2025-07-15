import java.util.Scanner;

public class Cylinder extends Circle{
	double height,volume;
	void input() {
		super.input();
		System.out.println("Enter the height:");
		Scanner sc=new Scanner(System.in);
		height=sc.nextInt();
	}
	double getVolume() {
		volume=getArea()*height;
		return volume;
	}
}
