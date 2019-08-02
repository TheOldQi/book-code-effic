package com.qixiafei.book.code.effic.c7;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/7/3 16:11</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Moniter {

    public static void main(String[] args) {
        Moniter moniter = new Moniter();
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    moniter.add();
                }
            }).start();
        }
    }

    static int i = 1;

    public synchronized void add() {
        i++;
    }
    public void add2() {
        synchronized(this){
            i++;

        }
    }
}
