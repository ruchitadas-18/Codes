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
    public ListNode swapNodes(ListNode head, int k) {
        //intializing two variables with same value given in code
        ListNode ln = head, rn=head;
        
        //traversing till the K th element from begining
        for(int i=1; i<k; i++){
            ln = ln.next;
        }
        
        // intializing new node
        ListNode value = ln;
        
        // traversing the kth element from end
        while(value.next!=null){
            value = value.next;
            rn = rn.next;
        }
        
        //swaping the nodes
        int a = ln.val;
        ln.val = rn.val;
        rn.val = a;
        
        return head; 
    }
}

        
        
        
        