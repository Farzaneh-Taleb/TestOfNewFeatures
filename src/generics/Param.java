package generics;

/**
 * Created by f.taleb on 7/1/2017.
 */

/*Generics enable classes, interfaces, and methods to take other classes and interfaces as type parameters.
        This example uses generic class Param to take a single type parameter T, delimited by angle brackets (<>):*/
public class Param<T> {
   /* Unlike other identifiers, type parameters have no naming constraints.
    However their names are commonly the first letter of their purpose in upper case. (This is true even throughout the official JavaDocs.)
    Examples include T for "type", E for "element" and K/V for "key"/"value".*/
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
