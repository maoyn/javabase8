package listObjectTest;

/**
 * Author:Administrator
 * Date:  2016/8/16
 * Time: 10:40
 */
public class pojo {
    private String a;
    private String b;
    private String c;

    @Override
    public String toString() {
        return "pojo{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }

    public pojo() {
    }

    public pojo(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public pojo(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
