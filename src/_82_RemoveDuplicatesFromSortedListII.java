import util.ListNode;

/**
 * Created by Eakon on 2017/8/10.
 */
public class _82_RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode next = cur.next;

        while(cur != null){
            if(next!=null &&cur.val==next.val){
                while(next!=null && next.val==cur.val){
                    next = next.next;
                }
                cur = next;
                pre.next = cur;
            } else {
                pre.next = cur;
                pre = cur;
                cur = next;
            }
            if(cur !=null) next = cur.next;
        }

        return dummy.next;
    }
}
