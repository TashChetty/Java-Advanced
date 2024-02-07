package lesson4;
import static java.lang.Math.*;

public class TestStaticImport {
    public static void main(String[] args) {
        System.out.println("random number is  " + random());
        System.out.println("square root is " + sqrt(99.00));
        System.out.println("rounded random " + round(random() *100));
        System.out.println("absolute  " + abs(9));
    }
}
