package Annorationss;

/**
 * Created by f.taleb on 7/3/2017.
 */
public class TestAnnotations {

    public static void main(String[] args){
        System.out.println(new A().getClass().getAnnotation(InheritedAnnotationType.class));
        System.out.println(new B().getClass().getAnnotation(InheritedAnnotationType.class));
        System.out.println(new C().getClass().getAnnotation(InheritedAnnotationType.class));
        System.out.println("_________________________________");
        System.out.println(new A().getClass().getAnnotation(UninheritedAnnotationType.class));
        System.out.println(new B().getClass().getAnnotation(UninheritedAnnotationType.class));
        System.out.println(new C().getClass().getAnnotation(UninheritedAnnotationType.class));
    }
}
