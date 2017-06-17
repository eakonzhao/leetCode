/**
 * Created by Eakon on 2017/6/17.
 */
public class _10_RegularExpressionMatching {
    public boolean isMatch(String str, String regex) {
        if (str == null || regex == null) return false;
        return match(str, 0, regex, 0);
    }

    private boolean match(String str, int strIndex, String regex, int reIndex) {
        int strLen = str.length();
        int reLen = regex.length();
        if (strIndex < strLen && reIndex == reLen) return false;
        if (strIndex == strLen && reIndex == reLen) return true;
        if (reIndex + 1 < reLen && regex.charAt(reIndex + 1) == '*') {
            if (regex.charAt(reIndex) == '.' || strIndex < strLen && str.charAt(strIndex) == regex.charAt(reIndex)) {
                return match(str, strIndex + 1, regex, reIndex + 2) ||
                        match(str, strIndex + 1, regex, reIndex) ||
                        match(str, strIndex, regex, reIndex + 2);
            } else {
                return match(str, strIndex, regex, reIndex + 2);
            }
        }
            if (reIndex<reLen&&strIndex<strLen&&regex.charAt(reIndex)=='.' || reIndex<reLen&&strIndex<strLen&&str.charAt(strIndex)==regex.charAt(reIndex)) {
                return match(str, strIndex + 1, regex, reIndex + 1);
            }
            return false;
        }
    }
