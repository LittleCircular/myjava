package project.lambda.test;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author yuan_zhigang Eamil:3155799044@qq.com
 * @create 2019-12-25 18:45
 */
public class LambdaTest {

    @Test
    public void test(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        int compare1 = com1.compare(12,21);
        System.out.println(compare1);

        System.out.println("--------------------");

        Comparator<Integer> com2 = (o1,o2)->Integer.compare(o1,o2);

        int compare2 = com2.compare(31,21);
        System.out.println(compare2);
    }

    @Test
    public void test2(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        con.accept("谎言和誓言的区别是什么？");

        System.out.println("-----------------------");

        Consumer<String> con1 = s -> System.out.println(s);
        con1.accept("一个是听的人当真了，一个是说的人当真了");
    }

}
