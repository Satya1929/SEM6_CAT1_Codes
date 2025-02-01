import java.io.*;
import java.util.*;

public class LoopDetection {//array of fixed size for hashing

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading size of the list
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        // Reading elements into the ArrayList
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Initialize a hash array to keep track of visited nodes (using a fixed size for the hash array)
        boolean[] visited = new boolean[100000];  // Fixed size hash array
        // by default false in java
        
        // Cycle detection using the hash array (boolean array)
        for (int i = 0; i < n; i++) {
            int num = list.get(i);

            // If the number is already visited, cycle is detected
            if (visited[num]) {
                System.out.println("YES");
                return;
            }

            // Mark this number as visited
            visited[num] = true;
        }

        // No cycle detected
        System.out.println("NO");
    }
}


public class LoopDetection {//HashSet , contains , add use
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (st.contains(m)) {
                System.out.println("YES");
                return;
            }
            st.add(m);
        }

        System.out.println("NO");
    }
}





public class LoopDetection {// arraylist fixed size for hashing

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading size of the list
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        // Reading elements into the ArrayList
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Initialize a hash ArrayList with fixed size
        int maxValue = 100000; // Assuming a fixed range for input elements
        ArrayList<Boolean> visited = new ArrayList<>(Collections.nCopies(maxValue, false));

        // Cycle detection using the hash ArrayList (boolean list)
        for (int i = 0; i < n; i++) {
            int num = list.get(i);

            // If the number is already visited, cycle is detected
            if (visited.get(num)) {
                System.out.println("YES");
                return;
            }

            // Mark this number as visited
            visited.set(num, true);
        }

        // No cycle detected
        System.out.println("NO");
    }
}







/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

class Solution {//141. Linked List Cycle
    public boolean hasCycle(ListNode head) {
        ListNode fast_ptr = head; 
        ListNode slow_ptr = head; 

        //Endpoint not present , bcz it doesnot in cycle , then apply algo checks
        //continue only when this is met , coz otherwise no need to do anything , just say it as linear LL        
        // Traverse the list as long as fast_ptr and fast_ptr.next are not null
        while (fast_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next; // Move two steps
            slow_ptr = slow_ptr.next;     // Move one step

            // If fast pointer meets slow pointer, there is a cycle
            if (fast_ptr == slow_ptr) return true;
    
        }
        // If traversal ends, there is no cycle
        //yaah , end point present , so cannot have cycle ever
        return false;
    }
}

