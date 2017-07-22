import util.TreeNode;

/**
 * Created by Eakon on 2017/7/21.
 */
public class _530_MinimumAbsoluteDifferenceInBST {
    Integer prev=null;
    Integer min=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if(root==null) return min;
        getMinimumDifference(root.left);
        if(prev!=null){
            min=Math.min(min,root.val-prev);
        }
        prev=root.val;
        getMinimumDifference(root.right);
        return min;
    }
}
