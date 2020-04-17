package project.string.test;

import org.junit.Test;

/**
 * @author yuan_zhigang Eamil:3155799044@qq.com
 * @create 2020-01-04 10:44
 */
public class IDEADebug {

    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());//4

        System.out.println(sb);//"null"

        StringBuffer sb1 = new StringBuffer(str);//抛异常
        System.out.println(sb1);
    }

}
