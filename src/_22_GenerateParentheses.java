import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eakon on 2017/7/10.
 */
public class _22_GenerateParentheses {
    public  List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(list,"",0,0,n);
        return list;
    }

    private void generate(List list,String string,int open,int close,int max){
        if(string.length()==2*max){
            list.add(string);
            return;
        }
        if(open<max){
            generate(list,string+"(",open+1,close,max);
        }
        if(close<open){
            generate(list,string+")",open,close+1,max);
        }
    }
}
