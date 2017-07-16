import util.TreeNode;

import java.util.LinkedList;

/**
 * Created by Eakon on 2017/7/15.
 */
public class _606_ConstructStringFromBinaryTree {

    /**
     * 递归方法
     * ①当前结点为空
     * ②左右子节点都为空
     * ③右子节点为空
     * ④左子节点为空
     * @param t
     * @return
     */
    public String tree2str(TreeNode t) {
        if(t==null) return "";
        if(t.left==null&&t.right==null) return t.val+"";
        if(t.right==null) return t.val+"("+tree2str(t.left)+")";
        return t.val+"("+tree2str(t.left)+")"+"("+tree2str(t.right)+")";
    }


    /**
     * 基于双栈的非递归方式
     * @param t
     * @return
     */
    public String tree2str2(TreeNode t){
        if(t==null) return "";
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(t);
        LinkedList<TreeNode> visited = new LinkedList<>();
        StringBuilder sb  = new StringBuilder();
        while(!stack.isEmpty()){
            t=stack.peek();
            if(visited.contains(t)){
                stack.pop();
                sb.append(")");
            }else{
                visited.add(t);
                sb.append("(").append(t.val);
                if(t.left==null&&t.right!=null) sb.append("()");
                if(t.right!=null) stack.push(t.right);
                if(t.left!=null) stack.push(t.left);
            }
        }
        return sb.substring(1,sb.length()-1);
    }
}
