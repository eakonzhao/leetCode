import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Eakon on 2017/8/11.
 */
public class _94_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root != null){
            LinkedList<TreeNode> stack = new LinkedList<>();
            while(!stack.isEmpty() || root!=null){
                if(root != null){
                    stack.push(root);
                    root = root.left;
                }else{
                    root = stack.pop();
                    list.add(root.val);
                    root = root.right;
                }
            }
        }
        return list;
    }
}
