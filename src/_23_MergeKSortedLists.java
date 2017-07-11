import util.ListNode;

/**
 * Created by Eakon on 2017/7/10.
 */
public class _23_MergeKSortedLists {
    public  ListNode mergeKLists(ListNode[] lists){
        if(lists==null||lists.length==0) return null;
        if(lists.length==1) return lists[0];
        if(lists.length==2) return mergeTwoLists(lists[0],lists[1]);
        return merge(lists,0,lists.length-1);
    }

    private ListNode merge(ListNode[] lists,int begin,int end){
        if(end-begin==0) return lists[begin];
        if(end-begin==1) return mergeTwoLists(lists[begin],lists[end]);
        return mergeTwoLists(merge(lists,begin,(begin+end)/2-1),merge(lists,(begin+end)/2,end));
    }

    private ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head=null;
        ListNode curr=null;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                if(head==null){
                    head=l1;
                    curr=l1;
                }else{
                    curr.next=l1;
                    curr=curr.next;
                }
                l1=l1.next;
            }else{
                if(head==null){
                    head=l2;
                    curr=l2;
                }else{
                    curr.next=l2;
                    curr=curr.next;
                }
                l2=l2.next;
            }
        }
        if(l1==null) l1=l2;
        curr.next=l1;
        return head;
    }
}
