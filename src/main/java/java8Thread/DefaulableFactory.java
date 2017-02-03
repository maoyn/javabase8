package java8Thread;

import java.util.function.Supplier;

/**
 * Author:Administrator
 * Date:  2016/8/18
 * Time: 16:03
 */
public interface DefaulableFactory {
    static Defaulable create( Supplier< Defaulable > supplier ) {
        return supplier.get();
    }
}
