import util.TreeNode;

import java.util.LinkedList;

/**
 * Created by Eakon on 2017/7/15.
 */
public class _606_ConstructStringFromBinaryTree {
    public String tree2str(TreeNode t) {
        LinkedList<TreeNode> stack=new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        if(t!=null){
            stack.push(t);
            while(!stack.isEmpty()){
                TreeNode node=stack.pop();
                sb.append("(");
                if(node!=null){
                    sb.append(node.val);
                    stack.push(node.right);
                    stack.push(node.left);
                }
                sb.append(")");
            }
        }
        return sb.toString();
    }
}
