import util.ListNode;

/**
 * Created by Eakon on 2017/7/24.
 */
public class _206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head!=null){
            ListNode pre=null;
            ListNode cur=head;
            ListNode next=cur.next;
            while(cur!=null){
                cur.next=pre;
                pre=cur;
                cur=next;
                if(cur!=null) next=cur.next;
            }
            return pre;
        }
        return head;
    }
}
