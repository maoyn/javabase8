package java8Thread;

/**
 * Author:Administrator
 * Date:  2016/8/18
 * Time: 15:56
 */
public interface Defaulable {
    default String notRequired() {
        return "Default implementation";
    }
}
