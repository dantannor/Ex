/**
 * Created by Abuser on 5/2/2017.
 */
public class OsParser implements Parser {
    @Override
    public String parse(String line) {
        String res = null;

        if (line.toLowerCase().indexOf("windows") >= 0) {
            res = "Windows";
        } else if (line.toLowerCase().indexOf("mac") >= 0) {
            res = "Mac";
        } else if (line.toLowerCase().indexOf("x11") >= 0) {
            res = "Unix";
        } else if (line.toLowerCase().indexOf("android") >= 0) {
            res = "Android";
        } else if (line.toLowerCase().indexOf("iphone") >= 0) {
            res = "IPhone";
        } else {
            res = "UnKnown";
        }

        return res;
    }

    @Override
    public String getName() {
        return "OS";
    }
}
