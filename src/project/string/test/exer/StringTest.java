package project.string.test.exer;

/**
 * @author yuan_zhigang Eamil:3155799044@qq.com
 * @create 2020-01-03 21:30
 */
public class StringTest {

    String str = new String("good");
    char[] ch = {'t','e','s','t'};

    public void change(String str, char ch[]){
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args){
        StringTest ex = new StringTest();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str);//good
        System.out.println(ex.ch);//best
    }

}
