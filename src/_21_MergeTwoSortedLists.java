import util.ListNode;

/**
 * Created by Eakon on 2017/7/10.
 */
public class _21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode result=null;
        ListNode curr=null;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                if(result==null){
                    result=l1;
                    curr=result;
                }else{
                    curr.next=l1;
                    curr=curr.next;
                }
            l1=l1.next;
            }else{
                if(result==null){
                    result=l2;
                    curr=result;
                }else{
                    curr.next=l2;
                    curr=curr.next;
                }
                l2=l2.next;
            }
        }
        if(l1!=null||l2!=null){
            if(l1==null) curr.next=l2;
            else curr.next=l1;
        }
        return result;
    }
}
