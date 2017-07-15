import util.TreeNode;

/**
 * Created by Eakon on 2017/7/15.
 */
public class _538_ConvertBSTToGreaterTree {
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
      convert(root);
        return root;
    }

    private void convert(TreeNode node){
        if(node==null) return;
        convert(node.right);
        node.val+=sum;
        sum=node.val;
        convert(node.left);
    }
}
