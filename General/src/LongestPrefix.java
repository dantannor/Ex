import java.util.ArrayList;

/**
 * Created by Daniel on 2/5/2017.
 */
public class LongestPrefix {
    public String longestCommonPrefix(ArrayList<String> a) {
        String prefix = a.get(0);

        for (String s : a) {
            while(!prefix.isEmpty() && !s.startsWith(prefix))
                prefix = prefix.substring(0, prefix.length() - 1);
        }

        return prefix;
    }
}
