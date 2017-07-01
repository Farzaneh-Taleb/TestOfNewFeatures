package LambdaExpressions;

public class Java8Tester {

    public static void main(String[] args) {

        MathOperation addition = (int a, int b) -> a+b ;

        MathOperation subtraction = (a , b ) -> a - b ;

        MathOperation multiplication = (int a ,int b) ->{ return a*b ; } ;

        MathOperation devision = (int a , int b) ->  a/b ;

        GreetingService greetingService1 = (sayMsg) -> System.out.println("Hello:" + sayMsg) ;

        GreetingService greetingService2 = (sayMsg) -> System.out.println("Hi:" + sayMsg) ;



        Java8Tester tester = new Java8Tester() ;

        System.out.println(" 10 + 5 =" + tester.operate(5,10,addition) );
        System.out.println(" 10 / 5 =" + tester.operate(10 , 5 , devision) ) ;
        System.out.println(" 10 - 5 =" + tester.operate(10 , 5 , subtraction));
        System.out.println("10 * 5 =" + tester.operate(10,5,multiplication));
        greetingService1.sayMessage("Farzaneh");
        greetingService2.sayMessage("Maryam");





    }

    private int operate(int a , int b , MathOperation mathOperation) {
        return mathOperation.operation(a,b) ;
    }
}
