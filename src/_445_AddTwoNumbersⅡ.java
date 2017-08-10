import util.ListNode;

import java.util.LinkedList;

/**
 * Created by Eakon on 2017/8/9.
 */
public class _445_AddTwoNumbersⅡ {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<ListNode> stack1 = new LinkedList<>();
        LinkedList<ListNode> stack2 = new LinkedList<>();
        while(l1 !=null) {
            stack1.push(l1);
            l1 = l1.next;
        }

        while(l2 != null){
            stack2.push(l2);
            l2 = l2.next;
        }
        int carry = 0;//是否有进位
        ListNode dummy = new ListNode(-1);
        ListNode cur = null;
        ListNode next = null;
        while(carry == 1 || !stack1.isEmpty() || !stack2.isEmpty()){
            int sum = (stack1.peek()==null?0:stack1.pop().val) + (stack2.peek()==null?0:stack2.pop().val) + carry;
            cur = new ListNode(sum%10);
            cur.next = next;
            dummy.next = cur;
            next = cur;
            carry = sum/10;
        }

        return dummy.next;
    }
}
