package defaultMethod;

/**
 * Created by f.taleb on 6/19/2017.
 */
public class functional {
    public static void main(String[] args){
       /* Why use Default Methods?
        The simple answer is that it allows you to evolve an existing interface without breaking existing implementations.*/
PrintableImpl p1 = new PrintableImpl() ;
        p1.printString();

        PrintableImpl2 p2 = new PrintableImpl2() ;
        p2.printString();

        PrintableImpl3 p3 = new PrintableImpl3() ;
        System.out.println(p3.hello());

        PrintableImpl4 p4 = new PrintableImpl4();
        System.out.println(p4.hello());

        PrintableImp5 p5 = new PrintableImp5() ;
        System.out.println(p5.hello());

        SummableImpl summable = new SummableImpl();
        System.out.println("Sum:"  + summable.calculateSum());

        SummableStaticImpl summableStatic = new SummableStaticImpl() ;
        System.out.println("Static Sum:" + summableStatic.calculateSum());
    }
}
