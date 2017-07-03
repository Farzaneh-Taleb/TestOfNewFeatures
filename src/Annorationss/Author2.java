package Annorationss;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by f.taleb on 7/3/2017.
 */


@Repeatable(Authors2.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Author2 {
    String value() ;
}