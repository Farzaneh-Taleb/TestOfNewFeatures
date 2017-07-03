package Annorationss;

/**
 * Created by f.taleb on 7/3/2017.
 */

/*Java 8 provides a cleaner, more transparent way of using container annotations,
        using the @Repeatable annotation. First we add this to the Author class:

        This tells Java to treat multiple @Author annotations as though they were surrounded by the @Authors container.
        We can also use Class.getAnnotationsByType() to access the @Author array by its own class, instead of through its container:-*/
@Author2("Farzaneh")
@Author2("Maryam")
public class Test2 {
    public static void main(String[] args){
        Author2[]  authors = Test2.class.getAnnotation(Authors2.class).value() ;
        for (Author2 author : authors){
            System.out.println(author.value());
        }
    }
}
