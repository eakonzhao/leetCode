import util.ListNode;

/**
 * Created by Eakon on 2017/7/11.
 */
public class _24_SwapNodesInPairs {

    /**
     * 递归
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode node = head.next;
        head.next = swapPairs(head.next.next);
        node.next = head;
        return node;
    }

    /**
     * 非递归
     * @param head
     * @return
     */
    public ListNode swapPairs2(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode cur = head;
        ListNode next = cur.next;
        ListNode pre = dummy;
        while(cur!=null && next!=null){
            cur.next = next.next;
            next.next = cur;
            pre.next = next;
            pre = cur;
            cur = cur.next;
            if(cur != null) next = cur.next;
        }
        return dummy.next;
    }
}