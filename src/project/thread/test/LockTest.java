package project.thread.test;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * 解决线程安全问题的方式三：Lock锁  --> JDK5.0新增
 *
 * 1.面试题：synchronized 与 Lock 的异同
 *         相同点：二者都是解决线程安全问题的
 *         不同点：synchronized 机制在执行完相应的同步代码块以后，自动的释
 *                放同步监视器。
 *                lock需要手动的启动同步（lock()）,同时结束同步也需要手动
 *                的实现（unlock()）
 *
 *
 * @author yuan_zhigang Eamil:3155799044@qq.com
 * @create 2019-11-24 14:11
 */

class Window implements Runnable {

    private int ticket = 100;
    //1.实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while(true){
            try {

                //调用锁定方法lock()
                lock.lock();

                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "：售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }finally {
                //3.调用解锁方法：unlock()
                lock.unlock();
            }
        }
    }
}
public class LockTest {
    public static void main(String[] args) {
        Window W = new Window();

        Thread t1 = new Thread(W);
        Thread t2 = new Thread(W);
        Thread t3 = new Thread(W);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
