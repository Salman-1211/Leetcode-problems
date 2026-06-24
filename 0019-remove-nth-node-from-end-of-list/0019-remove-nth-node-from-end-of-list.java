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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int cnt = 0;
        ListNode temp = head;

        if(head == null){
            return null;
        }

        // Count total number of nodes
        while(temp != null){
            cnt++;
            temp= temp.next;
        }
         
        // If N equals total nodes → delete head
        if(cnt == n){
            return head.next;
        }

        // Calculate position from start
        int res = cnt - n;
        temp = head;

        // Traverse to the node before target
         while (temp != null) {
            res--;
            if (res == 0) {
                break;
            }
            temp = temp.next;
        }
        
        // Delete the node
        temp.next = temp.next.next;

        return head;
    }
}
// Brute Force :- Tc-O(L)+(L-N), SC- O(1)