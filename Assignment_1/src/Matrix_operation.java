//22.Write a program to perform 
//addition, subtraction, and multiplication of two matrices using a menu-driven program.
import java.util.Scanner;

public class Matrix_operation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix m1= new Matrix();
        while (true) {
            System.out.println("\n\n----MENU----");
            System.out.println("1. ADDITION\n2. SUBTRACTION\n3. MULTIPLICATION\n4. EXIT");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1: m1.MatrixAddition(); break;
                case 2: m1.MatrixSubtraction(); break;
                case 3: m1.MatrixMultiplication(); break;
                case 4: System.exit(0);
                default: System.out.println("Wrong choice...");
            }
			sc.close();
        }
    }

    
}




class Matrix{
	// Method for matrix addition
     void MatrixAddition() {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for matrix 1:");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        System.out.print("Enter rows and columns for matrix 2:");
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        if (r1 != r2 || c1 != c2) {
            System.out.println("\nAddition not possible");
            
        }
        else
        {
        	int a[][]=new int [r1][c1];
        	int b[][]=new int [r2][c2];
        	int result[][]=new int [r1][c1];
        	System.out.println("Enter the value for matrix 1:");
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c1; j++) {
	                a[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("Enter the value for matrix 2:");
	        for (int i = 0; i < r2; i++) {
	            for (int j = 0; j < c2; j++) {
	                b[i][j] = sc.nextInt();
	            }
	        }
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c1; j++) {
	                result[i][j] = a[i][j] + b[i][j];
	            }
	        }
	        System.out.println("After addition the matrix is:");
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c1; j++) {
	               System.out.print(result[i][j]+"\t");
	            }
	            System.out.println();
	        }
        }
        sc.close();
    }

    // Method for matrix subtraction
    void MatrixSubtraction() {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for matrix 1:");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        System.out.print("Enter rows and columns for matrix 2:");
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        
        if (r1 != r2 || c1 != c2) {
            System.out.println("Subtraction not possible");
        }

        else
        {
        	
        	int a[][]=new int [r1][c1];
        	int b[][]=new int [r2][c2];
        	int result[][]=new int [r1][c1];
        	System.out.println("Enter the value for matrix 1:");
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c1; j++) {
	                a[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("Enter the value for matrix 2:");
	        for (int i = 0; i < r2; i++) {
	            for (int j = 0; j < c2; j++) {
	                b[i][j] = sc.nextInt();
	            }
	        }
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c1; j++) {
	                result[i][j] = a[i][j] - b[i][j];
	            }
	        }
	        System.out.println("After Subtraction the matrix is:");
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c1; j++) {
	               System.out.print(result[i][j]+"\t");
	            }
	            System.out.println();
	        }
        }
        sc.close();
    }

    // Method for matrix multiplication
    void MatrixMultiplication() {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for first matrix: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        System.out.print("Enter rows and columns for second matrix: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Multiplication not possible (columns of first matrix must match rows of second matrix)");
        }
        else {
	        int a[][]=new int [r1][c1];
	    	int b[][]=new int [r2][c2];
	    	int result[][]=new int [r1][c2];
	    	System.out.println("Enter the value for matrix 1:");
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c1; j++) {
	                a[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("Enter the value for matrix 2:");
	        for (int i = 0; i < r2; i++) {
	            for (int j = 0; j < c2; j++) {
	                b[i][j] = sc.nextInt();
	            }
	        }
	        
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c2; j++) {
	                for (int k = 0; k < c1; k++) {
	                    result[i][j] += a[i][k] * b[k][j];
	                }
	            }
	        }

	        System.out.println("After Multiplication the matrix is:");
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c2; j++) {
	               System.out.print(result[i][j]+"\t");
	            }
	            System.out.println();
	        }
	    }
        sc.close();

    } 
}