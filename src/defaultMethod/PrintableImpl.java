package defaultMethod;

/**
 * Created by f.taleb on 6/19/2017.
 */
public class PrintableImpl implements Printable {

    @Override
    public void printString() {
        System.out.println("Print Overriden Method");
    }
}
