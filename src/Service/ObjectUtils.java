package Service;

import java.lang.reflect.Field;

public class ObjectUtils {
    // ia ser usado nos updates do repository
    public static void copyAttributes(Object origin, Object destination) throws IllegalAccessException {
        Class<?> originClass = origin.getClass();

        Field[] fields = originClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object valor = field.get(origin);
            field.set(destination, valor);
        }
    }
}