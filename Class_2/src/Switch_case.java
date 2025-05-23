import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int day;
		System.out.print("Enter the day:");
		day=sc.nextInt();
		while(true)
		{
			switch(day)
			{
				case 0:System.out.println("Sunday"); 
						break;
				case 1:System.out.println("Monday");
						break;
				case 2:System.out.println("Tuesday");
						break;
				case 3:System.out.println("Wednessday");
						break;
				case 4:System.out.println("Thurshday");
						break;
				case 5:System.out.println("Friday");
						break;
				case 6:System.out.println("Satarday");
						break;
				default: System.out.println("Invalid input...");
			}
		}

	}

}
