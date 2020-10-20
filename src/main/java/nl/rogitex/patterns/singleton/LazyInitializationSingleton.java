package nl.rogitex.patterns.singleton;

/**
 * thread-safe lazy initialization
 */
public class LazyInitializationSingleton {

    /**
     * Private constructor, use getInstance().
     */
    private LazyInitializationSingleton() {
    }

    /**
     * LazyHolder for making the Singleton pattern Thread safe.
     */
    private static class LazyHolder {
        static final LazyInitializationSingleton INSTANCE = new LazyInitializationSingleton();
    }

    /**
     * @return the instance of this class
     */
    public static LazyInitializationSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

}