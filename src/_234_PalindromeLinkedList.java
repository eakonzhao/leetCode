import util.ListNode;

/**
 * Created by Eakon on 2017/8/11.
 */
public class _234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // 对链表后半段进行反转
        ListNode mid = slow;
        ListNode cur = mid.next;
        ListNode pre = null;
        ListNode next = cur.next;
        while(cur != null){
            cur.next = pre;
            pre = cur;
            cur = next;
            if(cur != null) next = cur.next;
        }
        slow = head;
        fast = pre;
        while(fast != null){
            if(fast.val != slow.val){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
}
