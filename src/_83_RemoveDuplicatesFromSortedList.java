import util.ListNode;

/**
 * Created by Eakon on 2017/8/9.
 */
public class _83_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode pre = head;
        ListNode cur = pre.next;
        while(cur != null){
            while(cur != null && cur.val == pre.val){
                cur = cur.next;
            }
            pre.next = cur;
            pre = cur;
            if(pre != null) cur = pre.next;
        }
        return head;
    }
}
