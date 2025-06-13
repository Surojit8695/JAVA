//11.Write a program to calculate simple interest while taking principal (p), time in years (n), and rate of interest (r) as command-line inputs.
public class InterestCalculation {
	
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java InterestCalculation <principal> <years> <rate>");
            return;
        }
        //convert string to double
        double principal = Double.parseDouble(args[0]);
        double time = Double.parseDouble(args[1]);
        double rate = Double.parseDouble(args[2]);

        //Formula I = (P * t * r) / 100
        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}