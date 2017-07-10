import java.util.LinkedList;

/**
 * Created by Eakon on 2017/7/10.
 */
public class _20_ValidParentheses {
    public static boolean isValid(String s) {
       if(s==null||s.length()==0||s.length()%2==1) return false;
        LinkedList<Character> stack=new LinkedList<>();
        for(Character c:s.toCharArray()){
            if(c=='(') stack.push(')');
            else if(c=='[') stack.push(']');
            else if(c=='{') stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop()) return false;
        }
        return stack.isEmpty();
    }
}
