import util.ListNode;

/**
 * Created by Eakon on 2017/8/10.
 */
public class _147_InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode next = null;

        while(cur != null){
            next = cur.next;
            if(pre==null || pre.next==null || pre.next.val>=cur.val){
                pre = dummy;
            }
            while(pre.next!=null && pre.next.val<cur.val){
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
        }
        return dummy.next;
    }
}
