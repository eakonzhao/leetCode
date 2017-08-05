package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Eakon on 2017/8/5.
 */
public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //System.out.println(list.toString());
        int[] array = {1,2,3,4,5};
        //System.out.println(array.toString());
        List list2 = Arrays.asList(array);
        System.out.println(list2.get(0));
    }
}
