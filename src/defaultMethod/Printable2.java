package defaultMethod;

/**
 * Created by f.taleb on 6/20/2017.
 */
public interface Printable2 {
    default String hello() {
        return "hi" ;
    }
}
