package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Myclass {
    private final Lock lock=new ReentrantLock();
    public  void executeLock(){
        lock.lock();
        try{
            //implement some logic
        }finally {
            //this will surely execute,no matter try will work or not.
            lock.unlock();
        }
    }
}
