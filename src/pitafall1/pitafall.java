package pitafall1;

import java.io.File;
import java.io.IOException;

/**
 * Created by f.taleb on 6/18/2017.
 */
public class pitafall {
    public static void main(String[] args) {

        /********************String Pitdall****************/
        String s1 = "hello";
        String s2 = "hel" + "lo";  //evaluated at compile time
        String s3 = " mum";
        if (s1 == s2) {
            System.out.println("1. same");
        } else {
            System.out.println("1. different");
        }
        if (s1 + s3 == "hello mum") {//evaluated at run time and we compare two different String objects
            System.out.println("2. same");
        } else {
            System.out.println("2. different");
        }



    }


    /********************File Pitfall**************************/
    public static File getValidatedFile(String path) throws IOException {
        File f = new File(path);
        if (!f.exists()) throw new IOException("Error: not found: " + path);
        if (!f.isFile()) throw new IOException("Error: Is a directory: " + path);
        if (!f.canRead()) throw new IOException("Error: cannot read file: " + path);
        return f;
    }


  /* For Java variables which have a reference type (either a class or an array type) the variable holds a reference.
    All copies of a reference are indistinguishable. References may point to objects, or they may be null which means that they point to no object.*/

    /*Variables are not objects in either case, and they don't contain objects in either case.
    They may contain references to objects, but that is saying something different.*/


}
