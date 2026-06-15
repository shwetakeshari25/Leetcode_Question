import java.util.*;
public class MidDeleteLL {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode deleteMiddle(ListNode head) { 
    if (head == null || head.next == null)
    return null;    
    ListNode slow=head;
    ListNode fast=head;
    ListNode prev=null;
    while(fast!=null && fast.next!=null){
        prev=slow;
        slow=slow.next;
        fast=fast.next.next;
    }   
    prev.next=slow.next;
    return head;
}
public static void print(ListNode head) {
    while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
    }
}
public static void main(String[] args) {
   ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(6);
        head = deleteMiddle(head);
        print(head);
    }
}   

