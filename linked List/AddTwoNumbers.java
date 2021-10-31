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
    public ListNode addTwoNumbers(ListNode first, ListNode second) {
        ListNode newhead= new ListNode(0);
        ListNode temp=newhead;
        int prev=0;
        int data;
        while(first!=null && second!=null){
            data=first.val+second.val+prev;
            prev=data/10;
            temp.next=new ListNode(data%10);
            temp=temp.next;
            first=first.next;
            second=second.next;
        }
        while(first!=null){
            data=first.val+prev;
            prev=data/10;
            temp.next=new ListNode(data%10);
            first=first.next;
            temp=temp.next;
        }
        while(second!=null){
            data=second.val+prev;
            prev=data/10;
            temp.next=new ListNode(data%10);
            second=second.next;
            temp=temp.next;
        }
        if(prev!=0){
            temp.next=new ListNode(prev);
            temp=temp.next;}
        newhead=newhead.next;
        return newhead;
    }
}
