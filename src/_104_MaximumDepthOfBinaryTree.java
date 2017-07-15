import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Eakon on 2017/7/15.
 */
public class _104_MaximumDepthOfBinaryTree {

    /**
     * BFS
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        int level=0;
        if(root!=null){
            Queue<TreeNode> queue=new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                int levelSize=queue.size();
                while(levelSize>0){
                    TreeNode node=queue.poll();
                    if(node.left!=null) queue.offer(node.left);
                    if(node.right!=null) queue.offer(node.right);
                    levelSize--;
                }
                level++;
            }
        }
        return level;
    }

    /**
     * simple method use recursion
     * @param root
     * @return
     */
    public int maxDepthRecursion(TreeNode root){
        int depth=0;
        if(root!=null){
            return Math.max(maxDepthRecursion(root.left)+1,maxDepthRecursion(root.right)+1);
        }
        return depth;
    }
}
