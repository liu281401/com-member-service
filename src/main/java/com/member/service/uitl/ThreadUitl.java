package com.member.service.uitl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname: ThreadUitl
 * @Description: TODO
 * @Date: 2019-07-29 10:54
 * @Author: Yu.Liu
 **/
public  class ThreadUitl extends Thread {

    private int count = 100;
    private static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run(){
        try {
            for(int i=0 ;i<1000;i++){
                lock.lock();
                count=i;
                System.out.println(count);
            }
        }finally {
            lock.unlock();
        }
    }

//    @Override
//    public void run() {
//        while (count>0){
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            sala();
//        }
//    }
//    public  synchronized void sala(){
//        while (count>0) {
//            System.out.println(Thread.currentThread().getName() + ",出售第" + (100 - count + 1) + "张票");
//            count--;
//        }
//    }
}

