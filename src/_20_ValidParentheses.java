import java.util.LinkedList;

/**
 * Created by Eakon on 2017/7/10.
 */
public class _20_ValidParentheses {
    public boolean isValid(String s) {
        if(s==null || s.length()==0) return false;
        LinkedList<Character> stack = new LinkedList<>();
        for(char ch : s.toCharArray()){
            switch(ch){
                case '(':stack.push(')');break;
                case '[':stack.push(']');break;
                case '{':stack.push('}');break;
                default :if(stack.isEmpty() || ch!=stack.pop()) return false;break;
            }
        }
        return stack.isEmpty();
    }
}
