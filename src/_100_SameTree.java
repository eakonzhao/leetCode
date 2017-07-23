import util.TreeNode;

/**
 * Created by Eakon on 2017/7/23.
 */
public class _100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val==q.val){
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
        return false;
    }
}
