package test;

/**
 * Created by Eakon on 2017/8/5.
 */
public class Son extends Father{
    public int add(int a, int b){
        assert a>=0;
        return a+b;
    }
}
