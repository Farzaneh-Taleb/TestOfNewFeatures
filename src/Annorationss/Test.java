package Annorationss;

/**
 * Created by f.taleb on 7/3/2017.
 */


/*Until Java 8, two instances of the same annotation could not be applied to a single element.
        The standard workaround was to use a container annotation holding an array of some other annotation:*/



@Authors({
        @Author("Mary"),
        @Author("SAM")
})
public class Test {
    public static void main(String[] args){
        Author[]  authors = Test.class.getAnnotation(Authors.class).value() ;
        for (Author author : authors){
            System.out.println(author.value());
        }
    }
}
