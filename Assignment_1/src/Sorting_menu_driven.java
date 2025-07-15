//19.Write a program to implement Bubble Sort, Selection Sort, and Insertion Sort in a single menu-driven program.
import java.util.Scanner;

public class Sorting_menu_driven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Sorting_technique sort=new Sorting_technique();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sort.bubbleSort(arr.clone());
                    break;
                case 2:
                    sort.selectionSort(arr.clone());
                    break;
                case 3:
                    sort.insertionSort(arr.clone());
                    break;
                case 4:
                    System.out.println("Exit....");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

}
class Sorting_technique{
	// Bubble Sort
     void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr, "Bubble Sort");
    }

    // Selection Sort
     void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        printArray(arr, "Selection Sort");
    }

    // Insertion Sort
     void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        printArray(arr, "Insertion Sort");
    }
//print the array
    void printArray(int[] arr, String sortType) {
        System.out.println("\nSorted array using " + sortType + ":");
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}