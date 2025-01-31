import java.io.*;
import java.util.*;

public class PriorityQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> arr = new ArrayList<>();  // ArrayList to hold the elements in the queue
     
        while (true) {
            int n = sc.nextInt();  // User input to choose the operation
            
            if (n == 1) { // Insert - Adds a new number with its priority to the queue (as an array of two integers: [num, priority]).
                int num = sc.nextInt();  // Number to add to the queue
                int p = sc.nextInt();  // Priority for the number
                arr.add(new int[]{num, p});  // Add the number and priority as an array to the list
                arr.sort(Comparator.comparingInt(a -> a[1]));  // Sort the list based on priority

            }

            else if (n == 2) { // Delete - Remove the first element (highest priority) 
                if (!arr.isEmpty()) {
                    // arr.sort(Comparator.comparingInt(a -> a[1]));  // Sort the list based on priority
                    arr.remove(0);  // Remove the first element (highest priority)
                }
                else {
                    System.out.println("Error List Empty");  // Error message if the list is empty
                }
            }

            else if (n == 3) { // Current state of Queue
                // arr.sort(Comparator.comparingInt(a -> a[1]));  // Sort the list by priority
                if (arr.size() == 0) {
                    System.out.println("Empty");  // Print "Empty" if the list is empty
                } else {
                    System.out.print("Queue: ");  // Display the current state of the queue
                    for (int[] a : arr) {
                        System.out.printf("%d %d ", a[0], a[1]);  // Print each element and its priority
                    }
                    System.out.println();
                }
            }

            else if (n == 4) { // Exit the program
                return;  
            }

            else {
                System.out.println("Wrong Choice");  // Handle invalid input
            }
        }
    }
}