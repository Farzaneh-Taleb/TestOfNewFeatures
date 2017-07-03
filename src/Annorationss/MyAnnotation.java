package Annorationss;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by f.taleb on 7/1/2017.
 */



/*Annotation types are defined with @interface. Parameters are defined similar to methods of a regular interface.*/

/*Meta-annotations are annotations that can be applied to other annotations.
     Special predefined meta-annotation define how annotation types can be used.*/

/*The @Target meta-annotation restricts the types the annotation can be applied to.*/

/*The @Retention meta-annotation defines where and when the annotation is visible.
        By default, annotations are included in the .class files, but are not visible at runtime.
        To make an annotation accessible at runtime, RetentionPolicy.RUNTIME has to be set on that annotation.*/



/*RetentionPolicy	Effect
        CLASS	The annotation is available in the class file, but not at runtime
        RUNTIME	The annotation is available at runtime and can be accessed via reflection
        SOURCE	The annotation is available at compile time, but not added to the class files. The information can be used e.g. by an annotation processor.*/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD , ElementType.FIELD})
@interface MyAnnotation {
    String param1() default "someValue" ;
    boolean param2() ;
    int[] param3() ;
}


/*    ElementType	target	example usage on target element
        ANNOTATION_TYPE	annotation types
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation
CONSTRUCTOR	constructors
        @MyAnnotation
        public MyClass() {}
        FIELD	fields, enum constants
        @XmlAttribute
        private int count;
        LOCAL_VARIABLE	variable declarations inside methods
        for (@LoopVariable int i = 0; i < 100; i++) {
@Unused
    String resultVariable;
            }
            PACKAGE	package (in package-info.java)
@Deprecated
package very.old;
        METHOD	methods
@XmlElement
public int getCount() {...}
        PARAMETER	method/constructor parameters
public Rectangle(
@NamedArg("width") double width,
@NamedArg("height") double height) {
        ...
        }
        TYPE	classes, interfaces, enums
@XmlRootElement
public class Report {}*/



   /* The annotation processor
        The SetterProcessor class is used by the compiler to process the annotations.
        It checks, if the methods annotated with the @Setter annotation are public,
        non-static methods with a name starting with set and having a uppercase letter as 4th letter.
        If one of these conditions isn't met, a error is written to the  Messager. The compiler writes this to stderr,
        but other tools could use this information differently.
        E.g. the NetBeans IDE allows the user specify annotation processors that are used to display error messages in the editor.*/