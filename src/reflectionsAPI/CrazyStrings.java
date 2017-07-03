package reflectionsAPI;

import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by f.taleb on 7/3/2017.
 */
public class CrazyStrings {
  /*  The Reflection API could be used to change values of private and final fields even in the JDK default library.
    This could be used to manipulate the behaviour of some well known classes as we will see.*/


   /* Lets start first with the only limitation means the only field we can't change with Reflection.
   That is the Java SecurityManager. It is declared in java.lang.System as

    private static volatile SecurityManager security = null;
    But it won't be listed in the System class if we run this code

            for(Field f : System.class.getDeclaredFields())
            System.out.println(f);
    Thats because of the fieldFilterMap in sun.reflect.Reflection that holds the map itself and the security field in the System.class
    and protects them against any access with Reflection. So we could not deactivate the SecurityManager.*/

    static {
        try {
            Field f = String.class.getDeclaredField("value") ;
            f.setAccessible(true);
            f.set("hello" , "you stink!".toCharArray());

            Field value = Integer.class.getDeclaredField("value");
            value.setAccessible(true);
            value.setInt(Integer.valueOf(1), 42);


            Field field = Boolean.class.getField("FALSE");
            field.setAccessible(true);
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
            field.set(null, true);

        } catch (NoSuchFieldException |IllegalAccessException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args){
        System.out.println("hello");
        System.out.println(Integer.valueOf(1));
        System.out.format("Everything is %s", false);
    }
}
