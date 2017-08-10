import util.ListNode;

/**
 * Created by Eakon on 2017/8/9.
 */
public class _92_ReverseLinkedListII {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || m < 1 || n < 1 || head.next==null || m==n) return head;
        int length = length(head);
        if(n > length) n = length;
        ListNode first = null;//first 是被reverse的链表部分的前一个node


        ListNode last = getNode(head,n+1);// last是第n+1个节点，即被reverse的链表部分的下一个节点

        ListNode pre = last;
        ListNode cur = head;

        if(m!=1){
            first = getNode(head,m-1);
            cur = first.next;
        }
        ListNode next = cur.next;

        while(cur != last){
            cur.next = pre;
            pre = cur;
            cur = next;
            if(cur != last) next = cur.next;
        }
        if(first !=null){
            first.next = pre;
            return head;
        }
        return pre;
    }

    private static int length(ListNode head){
        ListNode node = head;
        int count = 0;
        while(node != null){
            count++;
            node = node.next;
        }
        return count;
    }

    private static ListNode getNode(ListNode head, int num){
        ListNode node = null;
        if(num != 0){
            node = head;
            while( num>1){
                node = node.next;
                num--;
            }
        }
        return node;
    }

    private static void print(ListNode node){
        while(node != null){
            System.out.printf(node.val+" ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        int[] array = {3,5};
        for(int i=0; i<array.length; i++){
            cur.next = new ListNode(array[i]);
            cur = cur.next;
        }
        ListNode result = reverseBetween(head.next,1,2);
        print(result);
    }


    /**
     * 更优雅的解法
     * @param head
     * @param m
     * @param n
     * @return
     */
    public  ListNode reverseBetween2(ListNode head, int m, int n) {
        if( head == null || m < 1 || n < 1 || head.next == null || m==n ) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i=0; i<m-1; i++){
            pre = pre.next;
        }
        ListNode cur = pre.next;
        ListNode next = cur.next;

        for(int i=0; i<n-m; i++){
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
            next = cur.next;
        }
        return dummy.next;
    }
}
