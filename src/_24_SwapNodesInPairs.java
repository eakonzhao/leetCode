import util.ListNode;

/**
 * Created by Eakon on 2017/7/11.
 */
public class _24_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;//链表为空或者链表只有一个节点
        ListNode result=null;//最后返回的头节点
        ListNode left=head;
        ListNode right=head.next;
        ListNode pre=null;
        while(left!=null&&right!=null){
            if(result==null){
                result=right;
            }
            if(pre!=null){
                pre.next=right;
                left.next=right.next;
                right.next=left;
            }else{
                left.next=right.next;
                right.next=left;
            }
            pre=left;
            left=pre.next;
            if(left!=null){
                right=left.next;
            }
        }
        return result;
    }
}
