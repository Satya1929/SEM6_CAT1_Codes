public class Bitonic_DLL_Sort {
    
}


import java.io.*;
import java.util.*;

public class Solution {//cheat
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {
            String[] input = br.readLine().trim().split(" ");
            List<Integer> list = new ArrayList<>();

            for (String s : input) {
                int val = Integer.parseInt(s);
                if (val == -1) break;
                list.add(val);
            }

            // Sort the entire list using built-in function
            Collections.sort(list);

            // Print sorted list
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    System.out.print(list.get(i));
                } else {
                    System.out.print(list.get(i) + " ");
                }
            }
            System.out.println();
        }
    }
}


















public class Solution {//actual

    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {
            String[] input = br.readLine().trim().split(" ");
            List<Integer> list = new ArrayList<>();

            for (String s : input) {
                int val = Integer.parseInt(s);
                if (val == -1) break;
                list.add(val);
            }

            // Convert list to doubly linked list
            Node head = createDoublyLinkedList(list);

            // Sort the bitonic doubly linked list
            head = sortBitonicDLL(head);

            // Print sorted list
            printList(head);
        }
    }

    // Function to create a doubly linked list from list of values
    private static Node createDoublyLinkedList(List<Integer> list) {
        if (list.isEmpty()) return null;

        Node head = new Node(list.get(0));
        Node curr = head;
        for (int i = 1; i < list.size(); i++) {
            Node newNode = new Node(list.get(i));
            curr.next = newNode;
            newNode.prev = curr;
            curr = newNode;
        }
        return head;
    }

    // Function to split and sort the bitonic doubly linked list
    private static Node sortBitonicDLL(Node head) {
        if (head == null || head.next == null) return head;

        // Find the point where the decreasing sequence starts
        Node curr = head;
        while (curr.next != null && curr.data <= curr.next.data) {
            curr = curr.next;
        }

        if (curr.next == null) {
            return mergeSortedLists(head, null);
        }

        Node decHead = curr.next;
        curr.next = null;
        decHead.prev = null;

        // Reverse the decreasing part and merge
        decHead = reverseList(decHead);

        // Merge the two sorted lists
        return mergeSortedLists(head, decHead);
    }

    // Function to reverse a doubly linked list
    private static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev == null ? head : prev.prev;
    }

    // Function to merge two sorted doubly linked lists
    private static Node mergeSortedLists(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1.prev = tail;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2.prev = tail;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        if (head1 != null) {
            tail.next = head1;
            head1.prev = tail;
        }
        if (head2 != null) {
            tail.next = head2;
            head2.prev = tail;
        }

        dummy.next.prev = null;
        return dummy.next;
    }

    // Function to print the sorted doubly linked list
    private static void printList(Node head) {
        Node curr = head;
        boolean first = true;
        while (curr != null) {
            if (first) {
                System.out.print(curr.data);
                first = false;
            } else {
                System.out.print(" " + curr.data);
            }
            curr = curr.next;
        }
        System.out.println();
    }
}