/**
 * Created by Eakon on 2017/7/13.
 */
public class _476_NumberComplement {
    public int findComplement(int num) {
        int carry=0;
        int orNum=0;
        while(orNum<num){
            orNum+=Math.pow(2,carry);
            carry++;
        }
        return num^orNum;
    }
}
