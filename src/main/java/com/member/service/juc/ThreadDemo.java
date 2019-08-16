package com.member.service.juc;


import com.member.service.uitl.ThreadUitl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * @Classname: ThreadDemo
 * @Description: TODO
 * @Date: 2019-07-31 16:03
 * @Author: Yu.Liu
 **/
public class ThreadDemo {

    public static void  main(String[] args){
//        ExecutorService es = new ThreadPoolExecutor(5,10,10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5));
//        for(int i =0;i<3;i++){
//            ThreadUitl threadUitl = new ThreadUitl();
//            es.execute(threadUitl);
//        }
       // es.execute();


//        ThreadUitl threadUitl = new ThreadUitl();
//        Thread t1 = new Thread(threadUitl, "窗口1");
//        Thread t2 = new Thread(threadUitl, "窗口2");
//        t1.start();
//        t2.start();

        List<String> str =new ArrayList<String>();
        str.add("1");
        str.add("2");
        str.add("3");
        for(String s:str){
            if(s.equals("3")){
                str.add("4");
                //str.remove(s);
            }
        }
        System.out.println(Arrays.toString(str.toArray()));
    }

    public static String dome(String str){
        try {
            throw  new Exception();
        }catch (Exception e){
            str ="1";
        }finally {
            str="2";
        }
        return  str;
    }
}
