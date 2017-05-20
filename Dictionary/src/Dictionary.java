import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

/**
 * Load words from multiple files and display each word's count
 */
public class Dictionary {
    private final Map<String, Integer> map;
    private Object lock;

    public Dictionary() {
        this.map = new ConcurrentHashMap<>();
        lock = new Object();
    }

    public void loadFiles(Collection<String> paths){
        ExecutorService es = Executors.newCachedThreadPool();
        Collection<Callable<Object>> todo = new ArrayList<Callable<Object>>();

        for (String path :
                paths) {
            todo.add(Executors.callable(() -> loadFile(path)));
        }

        try {
            es.invokeAll(todo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void loadFiles2(Collection<String> paths){
        ArrayList<Thread> threads = new ArrayList<>();

        for (String path :
                paths) {
            Thread t = new Thread(new Runnable(){

                @Override
                public void run() {
                    loadFile(path);
                }
            });
            t.start();
            threads.add(t);
        }

        for (Thread thread :
                threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void loadFile(String path){
        try {
            try(BufferedReader br = new BufferedReader(new FileReader(path))) {

                String line;
                while ((line = br.readLine()) != null) {
                    String[] words = line.split(" ");

                    for (String word : words) {
                        synchronized (lock) {
                            int count;

                            Integer wordCount = map.get(word);
                            if (wordCount == null)
                                count = 1;
                            else
                                count = wordCount + 1;

                            map.put(word, count);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void display(){
        for (Map.Entry<String, Integer> entry:
             map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
