import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Eakon on 2017/7/13.
 */
public class _637_AverageOfLevelsInBinaryTree {
    /**
     * BFS
     * @param root
     * @return
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if(root!=null){
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                int levelCount=queue.size();
                double levelSum=0;
                int nodes=0;
                while(nodes<levelCount){
                    TreeNode node=queue.poll();
                    levelSum+=node.val;
                    if(node.left!=null)queue.add(node.left);
                    if(node.right!=null)queue.add(node.right);
                    nodes++;
                }
                list.add(levelSum/levelCount);
            }
        }
        return list;
    }
}
