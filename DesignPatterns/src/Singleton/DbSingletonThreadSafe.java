package Singleton;

/**
 * Created by Daniel on 2/11/2017.
 */
public class DbSingletonThreadSafe {
    // static because we can't create an instance due to the private ctor
    private static volatile DbSingletonThreadSafe instance = null;

    private DbSingletonThreadSafe(){

    }

    public static DbSingletonThreadSafe getInstance(){
        // this check is purely for performance, we don't need to have threads waiting for the synchronized if the instance is already recognized to be instantiated
        if (instance == null)
            synchronized (DbSingletonThreadSafe.class){
                if (instance == null)
                    instance = new DbSingletonThreadSafe();
            }
        return instance;
    }
}
