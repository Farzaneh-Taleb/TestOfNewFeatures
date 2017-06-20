package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by f.taleb on 6/14/2017.
 */
public class streams {
    public static void main(String[] args) {
    Stream<String> fruits = Stream.of("farzaneh" , "maryam" , "sara" ,  "narges" , "fahimeh") ;
        fruits.filter( s -> s.contains("h"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        List<Integer> integerList = Arrays.asList(0 , 1,2,3,4,5,6,7,8,9,10) ;
        long count = integerList.stream().filter(e -> e % 2 == 0)
                .count();
        System.out.println("COUNT:" + count);

        long count1 = integerList.parallelStream().filter(e -> e % 2 != 0).count();
        System.out.println("COUNT:" + count1);

       /*terminal operations
li          ke count() forEach() collect()*/

        /*A Stream will only be traversed when there is a terminal operation. Otherwise, no operation on the Stream will be performed.
         After the terminal operation is performed, the Stream is consumed and cannot be reused
         */

        //intermediate operations

       // the Stream is consumed and cannot be reused

        /*Although a given stream object cannot be reused, it's easy to create a reusable Iterable that delegates to a stream pipeline.
        This can be useful for returning a modified view of a live data set without having to collect results into a temporary structure.*/

        List<String> list  = Arrays.asList("farzaneh" , "narges" , "fahimeh" , "maryam" , "sara" ) ;
        Iterable<String> iterable = () ->list.stream().map(String::toLowerCase).iterator() ;

        for (String str : iterable){
            System.out.println(str);
        }
        for (String str : iterable){
            System.out.println(str);
        }


        /*The downstream operation is itself a collector (Collectors.counting()) that operates on elements of type String and produces a result of type Long.
        The result of the collect method call is a Map<String, Long>*/
        Stream.of("farzaneh" , "maryam" , "farzaneh" ,"narges" , "sara" , "fahimeh" , "farzaneh" , "maryam")
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);

        // Generate infinite stream - 1, 2, 3, 4, 5, 6, 7, ...
        IntStream naturalNumbers = IntStream.iterate(1 , x -> x+1) ;

        // Print out only the first 5 terms
        naturalNumbers.limit(5).forEach(System.out::println);

// Generate an infinite stream of random numbers Print out only the first 10 numbers
        Stream<Double> infiniteRandomNumbers = Stream.generate(Math::random);
        infiniteRandomNumbers.limit(10).forEach(System.out::println);

        System.out.println("******************");

        Optional<String> op1 = Optional.empty() ;
        Optional<String> op2  = Optional.of("Helllo Dear Farzaneh!!") ;
        List<String> result = Stream.of(op1 , op2).
        filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList()) ;
        System.out.println(result);

    }
}
