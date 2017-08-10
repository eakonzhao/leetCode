import util.ListNode;

/**
 * Created by Eakon on 2017/6/16.
 */
public class _2_AddTwoNumbers {
    /**
     * 下面是我第一次AC时的写法
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode node=new ListNode(-1);
        ListNode result=node;
        int carry=0;
        int tempSum=0;
        while(l1!=null&&l2!=null){
            tempSum=l1.val+l2.val+carry;
            if(tempSum<10){
                node.next=new ListNode(tempSum);
                carry=0;
            }else{
                node.next=new ListNode(tempSum%10);
                carry=1;
            }
            l1=l1.next;
            l2=l2.next;
            node=node.next;
        }
        if(l1!=null||l2!=null){
            if(l2!=null){
                while(l2!=null){
                    int endSum=carry+l2.val;
                    if(endSum<10){
                        node.next=new ListNode(endSum);
                        carry=0;
                    }else{
                        node.next=new ListNode(endSum%10);
                        carry=1;
                    }
                    node=node.next;
                    l2=l2.next;
                }
            }else if(l1!=null){
                while(l1!=null){
                    int endSum=carry+l1.val;
                    if(endSum<10){
                        node.next=new ListNode(endSum);
                        carry=0;
                    }else{
                        node.next=new ListNode(endSum%10);
                        carry=1;
                    }
                    node=node.next;
                    l1=l1.next;
                }
            }
        }
        if(carry==1) node.next=new ListNode(1);
        return result.next;
    }































    /**
     * 参考别人答案之后写下的更优的解法
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int carry = 0;
        while(carry==1 || l1!=null || l2 !=null){
            int sum = (l1==null?0:l1.val) + (l2==null?0:l2.val) + carry;
            cur.next = new ListNode(sum%10);
            carry = sum/10;
            cur = cur.next;
            l1 = (l1==null)?l1:l1.next;
            l2 = (l2==null)?l2:l2.next;
        }
        return dummy.next;
    }
}
