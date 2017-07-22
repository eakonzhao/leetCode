/**
 * Created by Eakon on 2017/7/22.
 */
public class _168_ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while(n>0){
            n--;
            result.insert(0,(char)('A'+n%26));
            n/=26;
        }
        return result.toString();
    }
}
