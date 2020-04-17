package project.string.test.java;

import org.junit.Test;

/**
 * @author yuan_zhigang Eamil:3155799044@qq.com
 * @create 2020-01-03 21:51
 */
public class StringMethodTest {

/*
int length()：返回字符串的长度：return value.length
char charAt(int index)：返回某索引处的字符return value[index]
boolean isEmpty()：判断是否是空字符串：return value.length == 0
String toLowerCase()：使用默认语言环境，将String中的所有字符转换为小写
String toUpperCase()：使用默认语言环境，将String中的所有字符转换为大写
String trim()：返回字符串的副本，忽略前导空白和尾部空白
boolean equals(Object obj)：比较字符串的内容是否相同
boolean equalsIgnoreCase(String anotherString)：与equals方法类似，忽略大小写
String concat(String str)：将指定字符串连接到此字符串的结尾。等价于“+”
int compareTo(String anotherString)：比较两个字符串的大小
String substring(int beginIndex)：返回一个新的字符串，他是此字符串的从beginIndex
    开始截取到最后的一个子字符串。
String substring(int beginIndex,int endIndex)：返回一个新的字符串，他是此字符串的从beginIndex
    开始截取到endIndex(不包含)的一个子字符串。
 */
    @Test
    public void test1(){
        String s1 = "HelloWorld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(9));
//        System.out.println(s1.charAt(10));
        s1 = "";

    }
}
