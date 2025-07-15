import java.util.Scanner;

public class Square extends Shape {
	int area,side1;
	void input() {
		System.out.println("Enter the side");
		Scanner sc=new Scanner(System.in);
		side1=sc.nextInt();
	}
	void findArea(){
		
		area=side1*side1;
		System.out.println("Area of Square is:"+area);
	}

}
