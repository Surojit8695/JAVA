import java.util.Scanner;

public class Complex_operation_using_switch_case {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Complex1 c1 =new Complex1();
		Complex1 c2 =new Complex1();
		Complex1 c3 =new Complex1();
		
		while(true)
		{
			System.out.println("----MENU----");
			System.out.println("1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.EXIT\n");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:c1.input("Complex number 1");
					c1.Display("C1=");
			
					c2.input("Complex number 2");
					c2.Display("C2=");
					c3.Addition(c1,c2);
					c3.Display("\nAddition is: ");
					break;
			case 2:c1.input("Complex number 1");
			c1.Display("C1=");
			
			c2.input("Complex number 2");
			c2.Display("C2=");
				c3.Subtraction(c1, c2);
				c3.Display("\nSubtraction is :");
					break;
			case 3:
				c1.input("Complex number 1");
				c1.Display("C1=");
				
				c2.input("Complex number 2");
				c2.Display("C2=");c3.Multiplication(c1, c2);
				c3.Display("\nMultiplication is :");
					break;
			case 4:System.exit(0);
			default:System.out.println("Invalid input...");
			}
		}
		
	}
	

}
class Complex1{
	int real,imaginary;
	
	void input(String msg)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the real part for "+msg+":");
		real=sc.nextInt();
		System.out.print("Enter the imaginary part for "+msg+":");
		imaginary=sc.nextInt();
	}
	void Display(String msg)
	{
		System.out.println(msg+real+ " + ("+imaginary+"i)\n");
	}
	void Addition(Complex1 c1,Complex1 c2)
	{
		real=c1.real+c2.real;
		imaginary=c1.imaginary+c2.imaginary;
	}
	void Subtraction(Complex1 c1,Complex1 c2)
	{
		real=c1.real-c2.real;
		imaginary=c1.imaginary-c2.imaginary;
	}
	void Multiplication(Complex1 c1,Complex1 c2)
	{
		
		real=((c1.real*c2.real)-(c1.imaginary*c2.imaginary));
		imaginary=((c1.real*c2.imaginary)+(c1.imaginary*c2.real));
	}
}
