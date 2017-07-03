package Annorationss;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by f.taleb on 7/3/2017.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String value() ;
}
