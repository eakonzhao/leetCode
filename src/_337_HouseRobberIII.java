import util.TreeNode;

import java.util.HashMap;

/**
 * Created by Eakon on 2017/7/30.
 */
public class _337_HouseRobberIII {
    /**
     * 递归
     * @param root
     * @return
     */
    public int rob1(TreeNode root) {
        if(root==null) return 0;
        int val=0;
        if(root.left!=null){
            val+=rob1(root.left.left)+rob1(root.left.right);
        }
        if(root.right!=null){
            val+=rob1(root.right.left)+rob1(root.right.right);
        }
        return Math.max(val+root.val,rob1(root.right)+rob1(root.left));
    }


    /**
     * dp 在rob1考虑了最优子结构的基础上还考虑了重叠子问题
     * @param root
     * @return
     */
    public int rob2(TreeNode root){
        return robMap(root,new HashMap());
    }

    private int robMap(TreeNode root,HashMap<TreeNode,Integer> map){
        if(root==null) return 0;
        if(map.containsKey(root)) return map.get(root);
        int val=0;
        if(root.left!=null){
            val+=robMap(root.left.left,map)+robMap(root.left.right,map);
        }
        if(root.right!=null){
            val+=robMap(root.right.left,map)+robMap(root.right.right,map);
        }
        val = Math.max(root.val+val,robMap(root.left,map)+robMap(root.left,map));
        map.put(root,val);
        return val;
    }
}
