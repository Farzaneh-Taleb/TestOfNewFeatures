package defaultMethod;

/**
 * Created by f.taleb on 6/20/2017.
 */

/*static methods Can be used within an interface,
        primarily intended to be used as a utility method for default methods.*/

/*Cannot be overridden by subclasses or by a sub-interface (is hidden to them).
However as is the case with static methods even now, each class or interface can have its own.*/


public interface SummableStatic {
   static int getA() {
      return  3 ;
    }
 static   int getB() {
        return 4 ;
    }
    default int calculateSum(){
        return getA() + getB() ;
    };
}
