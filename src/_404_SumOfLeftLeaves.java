import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Eakon on 2017/7/21.
 */
public class _404_SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root!=null){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                if(node.left!=null&&node.left.left==null&&node.left.right==null) sum+=node.left.val;
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
        }
        return sum;
    }
}
