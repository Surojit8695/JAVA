import java.util.Scanner;

public class Complex_number_operation {

	public static void main(String[] args) {
		Complex c1 =new Complex();
		Complex c2 =new Complex();
		Complex c3 =new Complex();
		c1.input("Complex number 1");
		c1.Display("C1=");
		
		c2.input("Complex number 2");
		c2.Display("C2=");
		
		c3.Addition(c1,c2);
		c3.Display("\nAddition is: ");
		c3.Subtraction(c1, c2);
		c3.Display("\nSubtraction is :");
		c3.Multiplication(c1, c2);
		c3.Display("\nMultiplication is :");
	}

}
class Complex{
	int real,imaginary;
	
	void input(String msg)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the real part for "+msg+":");
		real=sc.nextInt();
		System.out.print("Enter the imaginary part for "+msg+":");
		imaginary=sc.nextInt();
		sc.close();
	}
	void Display(String msg)
	{
		System.out.println(msg+real+ " + ("+imaginary+"i)\n");
	}
	void Addition(Complex c1,Complex c2)
	{
		real=c1.real+c2.real;
		imaginary=c1.imaginary+c2.imaginary;
	}
	void Subtraction(Complex c1,Complex c2)
	{
		real=c1.real-c2.real;
		imaginary=c1.imaginary-c2.imaginary;
	}
	void Multiplication(Complex c1,Complex c2)
	{
		
		real=((c1.real*c2.real)-(c1.imaginary*c2.imaginary));
		imaginary=((c1.real*c2.imaginary)+(c1.imaginary*c2.real));
	}
}
