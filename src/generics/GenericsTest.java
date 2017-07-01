package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by f.taleb on 7/1/2017.
 */

/*Generics are a facility of generic programming that extend Java's type system to allow a type or method to operate on objects of various types
        while providing compile-time type safety.*/

public class GenericsTest {



    public static void main(String[] args){
        Param<Integer> integerParam = new Param<>() ;


        Email email = new Email() ;
        email.setValue("farzaneh@gmail");
        String retrievedEmail = email.getValue();

        Age age = new Age() ;
        age.setValue(22);
        int retreivedAge = age.getValue() ;

        Height<Integer> heightInInt = new Height<>() ;
        heightInInt.setValue(168);

        Height<Float> heightInFloat = new Height<>()  ;
        heightInFloat.setValue(168.5f);

        MultiParam<String , Double> multiParam = new MultiParam<>();
        multiParam.setValue(3.3);

        AbstractParam<Double> height = new AbstractParam<Double>() {
        };
        height.setValue(198.0);

        MultiGenericParam<String, String> aParam = new MultiGenericParam<String, String>("value1", "value2");
        MultiGenericParam<Integer, Double> dayOfWeekDegrees = new MultiGenericParam<Integer, Double>(1, 2.6);




         /*    ? extends T represents an upper bounded wildcard. The unknown type represents a type that must be a subtype of T, or type T itself.
         ? super T represents a lower bounded wildcard. The unknown type represents a type that must be a supertype of T, or type T itself.
         As a rule of thumb, you should use:
        ? extends T if you only need "read" access ("input")
        ? super T if you need "write" access ("output")
        T if you need both ("modify")*/


        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple()) ;
        fruits.add(new Orange()) ;
        FruitHelper fruitHelper = new FruitHelper() ;
        fruitHelper.addApple(fruits);
        fruitHelper.eatAll(fruits);


        Collection<Orange> oranges = new ArrayList<>() ;
        oranges.add(new Orange());
        fruitHelper.eatAll(oranges);

//        Collection


    }
}
