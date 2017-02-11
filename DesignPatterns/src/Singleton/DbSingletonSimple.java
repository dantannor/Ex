package Singleton;

/**
 * Created by Daniel on 2/11/2017.
 */
public class DbSingletonSimple {
    private static DbSingletonSimple instance = new DbSingletonSimple();

    private DbSingletonSimple(){

    }

    public static DbSingletonSimple getInstance(){
        return instance;
    }
}

