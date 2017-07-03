package reflectionsAPI;

import generics.GenericsTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * Created by f.taleb on 7/3/2017.
 */
public class ReflectionAndGenerics {
    public Map<String, Map<Integer, List<String>>> testField;

    public List<Number> testMethod(final Map<String, Double> arg) {
        return null;
    }
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        final Method method = GenericsTest.class.getMethod("testMethod", Map.class);
        final Field field = GenericsTest.class.getField("testField");

        System.out.println("Method Parameters");
        final Type parameterType = method.getGenericParameterTypes()[0];

    }

    private static void displayGenericType(final Type type, final String prefix) {
        System.out.println(prefix + type.getTypeName());
        if (type instanceof ParameterizedType) {
            for (final Type subtype : ((ParameterizedType) type).getActualTypeArguments()) {
                displayGenericType(subtype, prefix + "\t");
            }
        }
    }


}
