package Annorationss;

import java.lang.annotation.*;

/**
 * Created by f.taleb on 7/3/2017.
 */

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface InheritedAnnotationType {
}
