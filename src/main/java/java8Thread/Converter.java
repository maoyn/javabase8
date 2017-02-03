package java8Thread;

/**
 * Author:Administrator
 * Date:  2016/8/18
 * Time: 11:05
 */
@FunctionalInterface
interface Converter<O, T> {
    T convert(O from);
}