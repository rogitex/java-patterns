package nl.rogitex.patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class LazyInitializationSingletonTest {

    @Test
    public void lazyInitializationSingletonTest() {
        LazyInitializationSingleton singleton = LazyInitializationSingleton.getInstance();
        assertNotNull(singleton);
    }
}
