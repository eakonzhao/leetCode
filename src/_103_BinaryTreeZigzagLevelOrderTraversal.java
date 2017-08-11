import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Eakon on 2017/8/11.
 */
public class _103_BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> listAll = new ArrayList<>();
        if(root != null){
            int layer = 1; //odd level or even level
            LinkedList<TreeNode> stack1 = new LinkedList<>(); //用来存放奇数层节点
            LinkedList<TreeNode> stack2 = new LinkedList<>(); //用来存放偶数层节点
            stack1.push(root);
            while(!stack1.isEmpty() || !stack2.isEmpty()){
                List<Integer> list;
                if(layer%2==0){
                    list = new ArrayList<>();
                    while(!stack2.isEmpty()){
                        TreeNode node = stack2.pop();
                        list.add(node.val);
                        if(node.right != null) stack1.push(node.right);
                        if(node.left != null) stack1.push(node.left);
                    }
                }else{
                    list = new ArrayList<>();
                    while(!stack1.isEmpty()){
                        TreeNode node = stack1.pop();
                        list.add(node.val);
                        if(node.left != null) stack2.push(node.left);
                        if(node.right != null) stack2.push(node.right);
                    }
                }
                if(!list.isEmpty()) listAll.add(list);
                layer++;
            }
        }
        return listAll;
    }
}
