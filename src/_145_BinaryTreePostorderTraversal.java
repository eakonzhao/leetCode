import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Eakon on 2017/8/11.
 */
public class _145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = node;
        while(node!=null){
            while(node.left!=null){
                stack.push(node);
                node = node.left;
            }
            while(node!=null && (node.right==null || node.right==pre)){
                list.add(node.val);
                pre = node;
                if(stack.isEmpty()) return list;
                node = stack.pop();
            }
            stack.push(node);
            node = node.right;
        }
        return list;
    }
}
