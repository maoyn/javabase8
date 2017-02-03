package java8Thread;

/**
 * Author:Administrator
 * Date:  2016/8/18
 * Time: 14:49
 */

public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
    default String abc() {
        return "sasdasda";
    }
}
