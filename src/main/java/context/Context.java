package context;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private static Context instance;
    private static Map<String, Object> context = new HashMap<>();

    public static Context get(String value) {
        return instance == null ? new Context() : instance;
    }

    public static void clear() {
        context.clear();
    }

    public static <T> void put(String key, T object) {
        context.put(key, object);
    }

    public static <T> T get(String key, Class<T> object) {
        Object obj;
        try {
            obj = context.get(key);
        } catch (NullPointerException ex) {
            throw new AssertionError(String.format("Object with  key %s has not been set yet", key));
        }
        return object.cast(obj);
    }
}