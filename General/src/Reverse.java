import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by Daniel on 2/5/2017.
 */
public class Reverse {
    public String reverseWords(String a) {
        if(a == "")
            return "";

        a = a.replaceAll("\\s+", " ");
        if(a.charAt(0) != ' ')
            a = " " + a;

        StringBuilder sb = new StringBuilder();
        int cur = 0;
        while ((cur = a.lastIndexOf(" ")) != -1) {
            sb.append(a.substring(cur + 1)).append(" ");
            a = a.substring(0, cur);
        }

        return sb.toString().trim();
    }

    public String reverseWords2(String a) {
        List<String> res = asList(a.split(" "));
        Collections.reverse(res);
        return String.join(" ", res);
    }
}
