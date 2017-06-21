package serialization;

/**
 * Created by f.taleb on 6/21/2017.
 */
public class Main {
    /*Serialization is the process of converting an object's state (including its references) to a sequence of bytes,
    as well as the process of rebuilding those bytes into a live object at some future time.
    Serialization is used when you want to persist the object.
    It is also used by Java RMI to pass objects between JVMs, either as arguments in a method invocation from
    a client to a server or as return values from a method invocation, or as exceptions thrown by remote methods.
    In general, serialization is used when we want the object to exist beyond the lifetime of the JVM.*/

    /*To persist an object the respective class must implement the java.io.Serializable interface.*/

    /*
    Versioning and serialVersionUID
    When you implement java.io.Serializable interface to make a class serializable, the compiler looks for a static final field named serialVersionUID of type long.
     If the class doesn't have this field declared explicitly then the compiler will create one such field and assign it with a value which comes out of a implementation dependent computation of serialVersionUID.
      This computation depends upon various aspects of the class and it follows the Object Serialization Specifications given by Sun.
       But, the value is not guaranteed to be the same across all compiler implementations.

    This value is used for checking the compatibility of the classes with respect to serialization and this is done while de-serializing a saved object.
     The Serialization Runtime verifies that serialVersionUID read from the de-serialized data and the serialVersionUID declared in the class are exactly the same. If that is not the case,
      it throws an InvalidClassException.*/



}
