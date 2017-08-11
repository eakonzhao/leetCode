import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Eakon on 2017/8/11.
 */
public class _71_SimplifyPath {
    public String simplifyPath(String path) {
        if(path==null || path.length()==0) return path;
        StringBuilder sb = new StringBuilder("/");
        Deque<String> deque = new LinkedList<>();
        for(String str : path.split("/")){
            if(str.equals("/")){
                deque.pollLast();
            }else if(!str.equals("") && !str.equals(".")){
                deque.addLast(str);
            }
        }
        for(String str : deque){
            sb.append(str).append("/");
        }
        if(!deque.isEmpty()) sb.setLength(sb.length()-1);
        return sb.toString();
    }
}
