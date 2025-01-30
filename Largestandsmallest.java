import java.util.Scanner;

public class Largestandsmallest {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Initialize the array
        int[] array = new int[size];
        
        // Input elements into the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();  // Read element and store in the array
        }
        
        // Initialize variables to store the largest and smallest elements
        int largest = array[0];
        int smallest = array[0];
        
        // Find the largest and smallest elements
        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        
        // Display the results
        System.out.println("The largest element is: " + largest);
        System.out.println("The smallest element is: " + smallest);
        
        // Close the scanner
        scanner.close();
    }
}
