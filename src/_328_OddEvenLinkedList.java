import util.ListNode;

/**
 * Created by Eakon on 2017/8/9.
 */
public class _328_OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode o = odd;
        ListNode even = new ListNode(-1);
        ListNode e = even;
        ListNode tag = head;
        int num=1;
        while(head != null){
            if(isOdd(num++)){
                o.next = head;
                o = o.next;
            }else{
                e.next = head;
                e = e.next;
            }
            head = head.next;
        }

        e.next = null;
        o.next = even.next;
        return odd.next;
    }

    private boolean isOdd(int num){
        return num%2==1;
    }
}
