package nl.rogitex.patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ThreadSafeInitializationSingletonTest {

    @Test
    public void threadSafeInitializationSingletonTest() {
        ThreadSafeInitializationSingleton singleton = ThreadSafeInitializationSingleton.getInstance();
        assertNotNull(singleton);
    }
}
