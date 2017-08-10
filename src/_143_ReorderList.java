import util.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Eakon on 2017/8/10.
 */
public class _143_ReorderList {
    public void reorderList(ListNode head) {
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
    }
}
