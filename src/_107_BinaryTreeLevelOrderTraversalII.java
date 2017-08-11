import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Eakon on 2017/8/11.
 */
public class _107_BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> listAll = new ArrayList<>();
        if(root != null){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                int levelSize = queue.size();
                List<Integer> list = new ArrayList<>();
                while(levelSize > 0){
                    root = queue.poll();
                    list.add(root.val);
                    if(root.left != null) queue.offer(root.left);
                    if(root.right != null) queue.offer(root.right);
                    levelSize--;
                }
                listAll.add(0,list);
            }
        }
        return listAll;
    }
}
