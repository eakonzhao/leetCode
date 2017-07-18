import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Eakon on 2017/7/18.
 */
public class _599_MinimumIndexSumOfTwoLists {

    /**
     *
     * @param list1
     * @param list2
     * @return
     */
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<Integer,List<String>> map = new HashMap<>();
        for(int i=0; i<list1.length; i++){
            for(int j=0; j<list2.length; j++){
                if(list1[i].equals(list2[j])){
                    if(!map.containsKey(i+j)){
                        map.put(i+j,new ArrayList<String>());
                    }
                    map.get(i+j).add(list1[i]);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int index:map.keySet()){
            min=Math.min(index,min);
        }
        return map.get(min).toArray(new String[0]);
    }


    public String[] findRestaurant2(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(int i=0; i<list1.length; i++){
            map.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0; i<list2.length; i++){
            if(map.containsKey(list2[i])){
                int sum=map.get(list2[i])+i;
                if(sum<=min){
                    if(sum<min){
                        list.clear();
                        min=sum;
                    }
                    list.add(list2[i]);
                }
            }
        }
        return list.toArray(new String[0]);
    }
}
