/**
 * Created by Eakon on 2017/6/17.
 */
public class _6_ZigZagConversion {
    public static String convert(String s, int numRows) {
        if(s==null || s.length()==0) return s;
        char[] charArray = s.toCharArray();
        StringBuilder[] sbArray = new StringBuilder[numRows];
        for(int i=0; i<sbArray.length; i++) sbArray[i] = new StringBuilder();
        int charIndex = 0;
        while(charIndex<charArray.length){
            for(int i=0; charIndex<charArray.length&&i<sbArray.length; i++){//垂直向下
                sbArray[i].append(charArray[charIndex++]);
            }
            for(int i=numRows-2; charIndex<charArray.length&&i>=1; i--){//倾斜向上
                sbArray[i].append(charArray[charIndex++]);
            }
        }
        for(int i=1; i<numRows; i++){
            sbArray[0].append(sbArray[i]);
        }
        return sbArray[0].toString();
    }
}