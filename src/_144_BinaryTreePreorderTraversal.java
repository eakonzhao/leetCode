import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Eakon on 2017/8/11.
 */
public class _144_BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root != null){
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while(!stack.isEmpty() || root!=null){
                root = stack.pop();
                list.add(root.val);
                if(root.right != null) stack.push(root.right);
                if(root.left != null) stack.push(root.left);
            }
        }
        return list;
    }
}
