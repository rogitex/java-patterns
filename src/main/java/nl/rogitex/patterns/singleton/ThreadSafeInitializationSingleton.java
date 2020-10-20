package nl.rogitex.patterns.singleton;

/**
 * thread-safe lazy initialization
 */
public class ThreadSafeInitializationSingleton {

    /** Create one instance of ThreadSafeInitializationSingleton. */
    private static final ThreadSafeInitializationSingleton INSTANCE = new ThreadSafeInitializationSingleton();

    /**
     * Private constructor, use getInstance().
     */
    private ThreadSafeInitializationSingleton() {
    }

    /**
     * @return the instance of this class
     */
    public static ThreadSafeInitializationSingleton getInstance() {
        return INSTANCE;
    }

}