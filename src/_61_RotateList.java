import util.ListNode;

/**
 * Created by Eakon on 2017/8/10.
 */
public class _61_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k<=0) return head;
        ListNode pre = null;
        ListNode slow = head;
        ListNode fast = head;

        int length = getLength(head);
        if(k%length==0){
            return head;
        }else{
            k = k%length;
        }

        for(int i=1; i<k&&fast!=null; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            pre = slow;
            slow = slow.next;
            fast =fast.next;
        }

        pre.next = null;
        fast.next = head;
        return slow;
    }

    private int getLength(ListNode head){
        if(head==null) return 0;
        ListNode node = head;
        int count = 0;
        do{
            count++;
            node = node.next;
        }while(node!=null);
        return count;
    }
}
