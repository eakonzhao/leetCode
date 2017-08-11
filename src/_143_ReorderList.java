import util.ListNode;

/**
 * Created by Eakon on 2017/8/10.
 */
public class _143_ReorderList {
    /**
     * 用一个双端队列
     * @param head
     */
    /*public void reorderList(ListNode head) {
        if(head == null || head.next == null) return ;
        Deque<ListNode> deque = new LinkedList<>();
        while(head !=null){
            deque.offerLast(head);
            head = head.next;
        }
        head = deque.pollFirst();
        head.next = null;
        ListNode cur = head;
        int index = 2;
        while(!deque.isEmpty()){
            ListNode node = null;
            if(index%2 != 0){
                node = deque.pollFirst();
                node.next = null;
                cur.next = node;
            }else{
                node = deque.pollLast();
                node.next = null;
                cur.next = node;
            }
            cur = cur.next;
            index++;
        }
    }*/


    /**
     *
     * @param head
     */
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;

        //Find the middle of the list
        ListNode p1=head;
        ListNode p2=head;
        while(p2.next!=null&&p2.next.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }

        //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
        ListNode preMiddle=p1;
        ListNode preCurrent=p1.next;
        while(preCurrent.next!=null){
            ListNode current=preCurrent.next;
            preCurrent.next=current.next;
            current.next=preMiddle.next;
            preMiddle.next=current;
        }

        //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
        p1=head;
        p2=preMiddle.next;
        while(p1!=preMiddle){
            preMiddle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=preMiddle.next;
        }
    }
}
