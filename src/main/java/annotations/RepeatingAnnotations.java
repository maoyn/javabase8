package annotations;

import java.lang.annotation.*;

/**
 * Author:Administrator
 * Date:  2016/8/17
 * Time: 15:39
 */
public class RepeatingAnnotations {
    @Target(ElementType.TYPE)

    @Retention(RetentionPolicy.RUNTIME)

    public @interface Filters {

        Filter[] value();
    }

    @Target(ElementType.TYPE)

    @Retention(RetentionPolicy.RUNTIME)

    @Repeatable(Filters.class)

    public @interface Filter {

        int value();

    }
    @Filter(1)

    @Filter(2)

    public interface Filterable {

    }

    public static void main(String[] args) {

        for (Filter filter : Filterable.class.getAnnotationsByType(Filter.class)) {

            System.out.println(filter.value());
        }



    }
}
