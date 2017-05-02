import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Abuser on 5/2/2017.
 */
public class Analyzer {
    private final List<Parser> parsers;
    private final String fileName;

    public Analyzer(String fileName, List<Parser> parsers) {
        this.fileName = fileName;
        this.parsers = parsers;
    }

    public void analyze() {
        HashMap<String,HashMap<String,Integer>> res = getParserMaps();
        print(res);
    }

    private void print(HashMap<String, HashMap<String, Integer>> res) {
        for (Map.Entry<String, HashMap<String, Integer>> category : res.entrySet()) {
            System.out.println("---" + category.getKey() + "---");

            int count = category.getValue().size();
            for (Map.Entry<String, Integer> type: category.getValue().entrySet()) {
                int percentage = type.getValue() / count * 100;

                if (percentage != 0)
                    System.out.println(type.getKey() + ": " + percentage + "%");
            }

            System.out.println("--------");
        }
    }

    private HashMap<String,HashMap<String,Integer>> getParserMaps() {
        HashMap<String,HashMap<String,Integer>> res = new HashMap<>();

        for (Parser parser : parsers) {
            String parserName = parser.getName();

            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                HashMap<String, Integer> map = new HashMap<>();

                while ((line = br.readLine()) != null) {
                    String type = parser.parse(line);
                    int count = map.containsKey(type) ? map.get(type) : 0;
                    map.put(type, count + 1);
                }

                res.put(parserName, sort(map));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return res;
    }

    private HashMap<String, Integer> sort(HashMap<String, Integer> res) {
        return res.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }
}

