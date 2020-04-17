package project.thread.test;

/**
 *
 * 例子：创建三个窗口买票，总票数为100张，使用继承Thread类的方式
 *
 * 使用同步代码块解决继承Thread类的方式的线程安全问题
 *
 * 说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑用当前类
 *      充当同步监视器
 *
 * @author yuan_zhigang Eamil:3155799044@qq.com
 * @create 2019-11-19 10:55
 */

class WindowThread extends Thread{

    private static int ticket = 100;

    private static Object obj = new Object();

    @Override
    public void run() {

        while (true){
            //正确的
//            synchronized(obj) {
            synchronized(WindowThread.class){//Class clazz = WindowThread.class, WindowThread.class只会加载一次
//            synchronized(this) { //this在此表示t1,t2,t3
                if (ticket > 0) {

                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(getName() + "：买票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }

    }
}

public class WindowThreadTest {
    public static void main(String[] args) {
        WindowThread w1 = new WindowThread();
        WindowThread w2 = new WindowThread();
        WindowThread w3 = new WindowThread();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
