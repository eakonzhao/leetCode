package test;

/**
 * Created by Eakon on 2017/8/5.
 */
public class Father {
    public int add(int a, int b){
        return 2*(a+b);
    }

    public static void main(String[] args) {
        Father subject = new Son();
        System.out.println(subject.add(-8,1));
    }
}
