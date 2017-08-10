import util.ListNode;

/**
 * Created by Eakon on 2017/8/9.
 */
public class _86_PartitionList {
    public static ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode dummy1 = new ListNode(-1);//存放val小于x的node
        ListNode cur1 = dummy1;
        ListNode dummy2 = new ListNode(-1);//存放val大于等于x的node
        ListNode cur2 = dummy2;

        while(head != null){
            if(head.val < x){
                cur1.next = head;
                cur1 = cur1.next;
            }else {
                cur2.next = head;
                cur2 = cur2.next;
            }
            head = head.next;
        }

        cur2.next = null;
        cur1.next = dummy2.next;
        return dummy1.next;
    }
}
