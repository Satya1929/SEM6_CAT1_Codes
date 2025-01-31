import java.io.*;
import java.util.*;

public class Odd_even_LL  {//cheat

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input into an ArrayList
        ArrayList<Integer> inputList = new ArrayList<>();
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break; // Stop input when -1 is encountered
            inputList.add(num);
        }

        // First pass: Print all odd numbers
        for (int num : inputList) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

        // Second pass: Print all even numbers
        for (int num : inputList) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println(); // Print newline after output
    }
}


























/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 class Solution {//328. Odd Even Linked List //actual
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; 
        }

        ListNode odd = head;          
        ListNode even = head.next;    
        ListNode evenhead = even;

        // wrong, see by dry run , but once the next pointer link is changed then , changing
        // value needs just next
        // while (even != null && even.next.next != null)
        // {
        //     odd.next = odd.next.next ;
        //     even.next = even.next.next ;

        //     odd = odd.next.next ;
        //     even = even.next.next ;
        // }   

        while (even != null && even.next != null)
        {
            odd.next = odd.next.next ;
            even.next = even.next.next ;

            odd = odd.next ;
            even = even.next ;
        }     

        odd.next = evenhead ;

        return head ;
    }
}









/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 class Solution { // 328. Odd Even Linked List //actual
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = head;          
        ListNode even = head.next;    
        ListNode evenhead = even;

        if (head == null || head.next == null) {
            return head; 
        }

        while (even != null && even.next != null) { 
            odd.next = odd.next.next; // Link odd to the next odd node
            even.next = even.next.next; // Link even to the next even node

            odd = odd.next; // Move odd pointer to the next odd node
            even = even.next; // Move even pointer to the next even node
        }     

        odd.next = evenhead; // Append even list at the end of the odd list

        return head;
    }
}
