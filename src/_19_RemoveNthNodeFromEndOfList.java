import util.ListNode;

/**
 * Created by Eakon on 2017/7/10.
 */
public class _19_RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null) return null;
        ListNode slow=head;
        ListNode pre=null;
        ListNode fast=head;
        for(int i=1; i<n&&fast!=null; i++){
         fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            pre=slow;
            slow=slow.next;
        }
        if(slow==head) return head.next;
        pre.next=slow.next;
        return head;
    }
}
