package com.qixiafei.book.code.effic.c7;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/7/3 10:41</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class MultiThreads {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        final ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 30, 10, TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
//
//        for (int i = 0; i < 50; i++) {
//            final int i1 = i;
//            executor.execute(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(i1 + "号线程");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        }

        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-2));
        System.out.println(Integer.toBinaryString(-3));
//        executor.shutdown();
    }
}
