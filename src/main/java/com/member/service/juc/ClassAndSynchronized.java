package com.member.service.juc;

/**
 * @Classname: ClassAndSynchronized
 * @Description: TODO
 * @Date: 2019-08-06 11:01
 * @Author: Yu.Liu
 **/
public class ClassAndSynchronized {

    public synchronized void demo1(){
        System.out.println(this.demo2());
    }

    public synchronized String demo2(){
        return "2";
    }
}
