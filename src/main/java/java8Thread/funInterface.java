package java8Thread;

import org.junit.Test;

import java.util.Optional;
import java.util.function.*;

/**
 * Author:Administrator
 * Date:  2016/8/18
 * Time: 10:57
 */
public class funInterface  {
    private static class DefaultableImpl implements Defaulable {
    }

    private static class OverridableImpl implements Defaulable {
        @Override
        public String notRequired() {
            return "Overridden implementation";
        }
    }

    @Test
    public void test(){
        Converter<Integer, Double> converter = (from) -> Double.valueOf(from);
        Double convert = converter.convert(321);
        // 123
        System.out.println(convert);
    }
@Test
    public void test2() {
        Formula formula = (a)-> Math.sqrt(a * 0.01);
        Double a =formula.calculate(100); // 100.0
        Double b = formula.sqrt(16); // 4.0
    System.out.println(a);
    System.out.println(b);
    }
    @Test
    public void test3(){
        Defaulable defaulable = DefaulableFactory.create( DefaultableImpl::new );
        System.out.println( defaulable.notRequired() );

        defaulable = DefaulableFactory.create( OverridableImpl::new );
        System.out.println( defaulable.notRequired() );



        // Function<T, R> -T作为输入，返回的R作为输出
        Function<Integer,Integer> function = (x) -> {System.out.print(x+": ");return 32123;};
        System.out.println(function.apply(12321));

        //Predicate<T> -T作为输入，返回的boolean值作为输出
        Predicate<String> pre = (x) ->{System.out.print(x);return false;};
        System.out.println(": "+pre.test("hello World"));

        //Consumer<T> - T作为输入，执行某种动作但没有返回值
        Consumer<String> con = (x) -> {System.out.println(x);};
        con.accept("hello world");

        //Supplier<T> - 没有任何输入，返回T
        Supplier<String> supp = () -> {return "Supplier";};
        System.out.println(supp.get());

        //BinaryOperator<T> -两个T作为输入，返回一个T作为输出，对于“reduce”操作很有用
        BinaryOperator<String> bina = (x,y) ->{System.out.print(x+" "+y);return "BinaryOperator";};
        System.out.println("  "+bina.apply("hello ","world"));


        Optional<String> optional = Optional.of("bam");

        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));
    }


}
