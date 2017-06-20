package defaultMethod;

/**
 * Created by f.taleb on 6/19/2017.
 */
public interface Summable {
     int getA() ;
    int getB() ;
    default int calculateSum(){
        return getA() + getB() ;
    };

}
