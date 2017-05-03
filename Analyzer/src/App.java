import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abuser on 5/2/2017.
 */
public class App {
    public static void main(String[] args) {
        Parser countryParser = new CountryParser();
        Parser osParser = new OsParser();

        List<Parser> parsers = new ArrayList<>();
        parsers.add(countryParser);
        parsers.add(osParser);

        Analyzer analyzer = new Analyzer("Analyzer\\file.txt", parsers);

        analyzer.analyze();
    }
}
