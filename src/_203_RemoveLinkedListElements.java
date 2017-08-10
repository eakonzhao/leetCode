import util.ListNode;

/**
 * Created by Eakon on 2017/8/10.
 */
public class _203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null || (head.next==null && head.val!=val)) return head;
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode next = cur.next;
        while(cur != null){
            if(cur.val == val){
                pre.next = next;
            }else{
                pre.next = cur;
                pre = cur;
            }
            cur = next;
            if(cur != null) next = cur.next;
        }
        return dummy.next;
    }
}