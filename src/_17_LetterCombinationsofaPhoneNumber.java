import java.util.LinkedList;
import java.util.List;

/**
 * Created by Eakon on 2017/6/18.
 */
public class _17_LetterCombinationsofaPhoneNumber {

    public static List<String> letterCombinations(String digits){
        LinkedList<String> ans = new LinkedList<>();
        if(digits==null||digits.length()==0) return ans;
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ans.add("");
        for(int i=0; i<digits.length(); i++){
            int x=Character.digit(digits.charAt(i),10);
            while(ans.peek().length()==i){
                String t=ans.remove();
                for(char s:mapping[x].toCharArray()){
                    ans.add(t+s);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<String> list = letterCombinations("23");
        System.out.println(list.toString());
    }
}
