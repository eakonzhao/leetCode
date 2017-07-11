import util.ListNode;

/**
 * Created by Eakon on 2017/7/11.
 */
public class _25_ReverseNodesInKGroup {
    /*public static ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null) return head;
        ListNode result=null;
        ListNode preOfLeft=null;
        ListNode preOfRight=null;
        ListNode nextOfLeft=null;
        ListNode nextOfRight=null;
        ListNode right=null;
        ListNode left=head;
        preOfRight=getPreOfRight(left,k);
        if(preOfRight==null) return head;
        right=preOfRight.next;
        while(left!=null&&right!=null){
            nextOfRight=right.next;
            nextOfLeft=left.next;
            left.next=nextOfRight;
            preOfRight.next=left;


            right.next=nextOfLeft;
            if(preOfLeft!=null) preOfLeft.next=right;
            if(result==null) result=right;

            preOfLeft=left;
            left=preOfLeft.next;
            preOfRight=getPreOfRight(left,k);
            if(preOfRight==null) break;
            right=preOfRight.next;
        }
        return result;
    }


    private static ListNode getPreOfRight(ListNode left,int k){
        ListNode preOfRight=null;
        int count=1;
        while(count<k-1&&left!=null){
            left=left.next;
            count++;
        }
        if(count==k-1){
            preOfRight=left;
        }
        return preOfRight;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(0);
        reverseKGroup(head,2);
    }*/

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null || head.next == null)
            return head;
        ListNode first = head, last = head;
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode preGroup = preHead, nextGroup = preHead;
        int count = 1;
        while (last != null) {
            if (count == k) {
                nextGroup = last.next;
                reverseList(first, last);
                preGroup.next = last;
                preGroup = first;
                first.next = nextGroup;
                first = nextGroup;
                last = nextGroup;
                count = 1;
                continue;
            }
            last = last.next;
            count++;
        }
        return preHead.next;
    }

    private void reverseList(ListNode head, ListNode tail) {
        ListNode pre = new ListNode(-1), node = head;
        pre.next = head;
        while (pre != tail) {
            ListNode temp = node.next;
            node.next = pre;
            pre = node;
            node = temp;
        }
    }
}
