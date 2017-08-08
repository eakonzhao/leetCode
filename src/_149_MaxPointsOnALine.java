import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eakon on 2017/8/8.
 */
class Point{
    int x;
    int y;
    Point() { x = 0; y = 0; }
    Point(int a, int b) { x = a; y = b; }
}


public class _149_MaxPointsOnALine {
    public int maxPoints(Point[] points) {
        if(points == null) return 0;
        if(points.length < 2) return points.length;
        Map<Integer,Map<Integer,Integer>> map = new HashMap<>();
        int result=0;
        for(int i=0; i<points.length; i++){
            map.clear();
            int overlap=0, max=0;
            for(int j=i+1; j<points.length; j++){
                int x = points[j].x - points[i].x;
                int y = points[j].y - points[i].y;
                if(x==0 && y==0){
                    overlap++;
                    continue;
                }
                int gcd = generateGCD(x,y);
                if(gcd != 0){
                    x /= gcd;
                    y /= gcd;
                }

                if(map.containsKey(x)){
                    map.get(x).put(y,map.get(x).getOrDefault(y,0)+1);
                }else{
                    Map<Integer,Integer> m = new HashMap<>();
                    m.put(y,1);
                    map.put(x,m);
                }
                max = Math.max(max,map.get(x).get(y));
            }
            result = Math.max(result,overlap+max+1);
        }
        return result;
    }

    private int generateGCD(int a, int b){
        return b==0?a:generateGCD(b,a%b);
    }
}
