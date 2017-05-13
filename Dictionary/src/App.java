import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Daniel on 13-May-17.
 */
public class App {
    public static void main(String[] args) {
        Dictionary dict = new Dictionary();

        Collection<String> paths = new ArrayList<>();
        paths.add("C:\\Users\\Daniel\\Source\\Repos\\Ex\\Dictionary\\file.txt");
        paths.add("C:\\Users\\Daniel\\Source\\Repos\\Ex\\Dictionary\\file3.txt");
        paths.add("C:\\Users\\Daniel\\Source\\Repos\\Ex\\Dictionary\\file2.txt");

        dict.loadFiles(paths);
        dict.display();
    }
}
