package Singleton;

/**
 * Created by Daniel on 2/11/2017.
 */
public class Program {
    public static void main(String[] args) {
        DbSingleton singleton = DbSingleton.getInstance();
        DbSingleton singleton2 = DbSingleton.getInstance();

        System.out.println(singleton == singleton2);
    }
}
