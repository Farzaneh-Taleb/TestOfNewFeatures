package defaultMethod;

/**
 * Created by f.taleb on 6/19/2017.
 */
public class PrintableImpl3 implements Printable {
    @Override
    public String hello() {
        return Printable.super.hello() + " Farzaneh!" ;
    }
}
