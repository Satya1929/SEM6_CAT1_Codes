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