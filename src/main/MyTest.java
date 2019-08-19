package main;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyTest {
    private Lock innerLock = new ReentrantLock();
    private Lock lock = new ReentrantLock();
    public void m1() throws InterruptedException {
        innerLock.lock();
        System.out.println("lock..." + Thread.currentThread().getName());
        Thread.sleep(3000);
        innerLock.unlock();
    }

    public void m2() {
        lock.lock();
        System.out.println("m2...");
        innerLock.unlock();
    }

}
