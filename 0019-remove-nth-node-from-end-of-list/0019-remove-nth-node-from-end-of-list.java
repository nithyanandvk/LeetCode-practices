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
        ListNode curr=head;
        int s=0;
        while(curr!=null){
            curr=curr.next;
            s++;
        }
        int c=0;
        curr=head;
        int i=s-n-1;
        if(s==1 && n==1){
            head=null;
            return head;
        }
        if(i==-1){
            head=head.next;
            return head;
        }
        //System.out.println(s+" "+i);
        while(curr!=null && c<i){
            curr=curr.next;
            c++;
        }
        curr.next=curr.next.next;
        return head;
    }
}