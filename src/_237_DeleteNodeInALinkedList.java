import util.ListNode;

/**
 * Created by Eakon on 2017/7/23.
 */
public class _237_DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
