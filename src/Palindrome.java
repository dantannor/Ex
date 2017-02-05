/**
 * Created by Daniel on 2/5/2017.
 */
public class Palindrome {
    public boolean palindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean recursive(String s) {
        if (s == "" || s.length() == 1)
            return true;

        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;

        return recursive(s.substring(1, s.length() - 1));
    }
}
