import java.util.LinkedList;
import java.util.List;

/**
 * Created by Eakon on 2017/7/14.
 */
public class _412_FizzBuzz {
    /**
     * 没有用%操作
     * @param n
     * @return
     */
    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        if(n>0){
            for(int i=1,Fizz=0,Buzz=0; i<=n; i++){
                Fizz++;
                Buzz++;
                if(Fizz==3&&Buzz==5){
                    list.add("FizzBuzz");
                    Fizz=0;
                    Buzz=0;
                }else if(Fizz==3){
                    list.add("Fizz");
                    Fizz=0;
                }else if(Buzz==5){
                    list.add("Buzz");
                    Buzz=0;
                }else list.add(String.valueOf(i));
            }
        }
        return list;
    }

    /**
     * 进行了%操作
     * @param n
     * @return
     */
    public List<String> fizzBuzz2(int n) {
        List<String> list = new LinkedList<>();
        if(n>0){
            for(int i=1; i<=n; i++){
                StringBuilder sb = new StringBuilder();
                if(i%3==0||i%5==0) {
                    if (i % 3 == 0) sb.append("Fizz");
                    if (i % 5 == 0) sb.append("Buzz");
                    list.add(sb.toString());
                }else{
                    sb.append(i);
                    list.add(sb.toString());
                }
            }
        }
        return list;
    }
}
