import java.util.LinkedList;

/**
 * Created by Eakon on 2017/8/11.
 */
public class _150_EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        if(tokens==null || tokens.length==0) return 0;
        LinkedList<Integer> stack = new LinkedList<>();
        int num1, num2;
        for(String str : tokens){
            switch (str){
                case "+" :
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2+num1);
                    break;
                case "-" :
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2-num1);
                    break;
                case "*" :
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2*num1);
                    break;
                case "/" :
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2/num1);
                    break;
                default  : stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}
