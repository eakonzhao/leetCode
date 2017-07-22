/**
 * Created by Eakon on 2017/7/21.
 */
public class _171_ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int result=0;
        for(int i=0; i<s.length(); i++){
            result=result*26+s.charAt(i)-'A'+1;
        }
        return result;
    }
}
