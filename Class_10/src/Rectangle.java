import java.util.Scanner;

public class Rectangle extends Shape  {
	int area,side1,side2;
	void input() {
		System.out.println("Enter both side");
		Scanner sc=new Scanner(System.in);
		side1=sc.nextInt();
		side2=sc.nextInt();
	}
	void findArea(){
		area=side1*side2;
		System.out.println("Area of Rectangle is:"+area);
	}

}
