package reflectionsAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by f.taleb on 7/1/2017.
 */


/*Reflection is commonly used by programs which require the ability to examine or modify the runtime behavior of applications running in the JVM
        Java Reflection API is used for that purpose where it makes it possible to inspect classes, interfaces, fields and methods at runtime,
        without knowing their names at compile time. And It also makes it possible to instantiate new objects, and to invoke methods using reflection.*/



/*The Reflection API allows one to check the class structure of the code at runtime and invoke code dynamically.
        This is very powerful, but it is also dangerous since the compiler is not able to statically determine whether dynamic invocations are valid.*/



public class ReflectionTest {

    // This is a object representing the String class (not an instance of String!)
    Class<String> clazz  =  String.class ;
    // returns all public constructors of String
    Constructor<?> [] constructors = clazz.getConstructors() ;
    // returns all public methods from String and parents
    Method[] methods = clazz.getMethods() ;
   /* With this information it is possible to instance the object and call different methods dynamically.*/




}
