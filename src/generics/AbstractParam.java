package generics;

/**
 * Created by f.taleb on 7/1/2017.
 */

/*AbstractParam is an abstract class declared with a type parameter of T.
        When extending this class, that type parameter can be replaced by a type argument written inside <>,
        or the type parameter can remain unchange*/
public abstract class AbstractParam<T> {
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    private T value ;

}

