package com.qixiafei.book.code.effic.c4;

import java.util.Arrays;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/7/2 11:41</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Oom {

    public static void main(String[] args) {
        byte[] mb1 = new byte[1 << 20];
        byte[] mb2 = new byte[1 << 20];
        byte[] mb4 = new byte[1 << 20];

//        System.out.println(Arrays.toString(mb1));
//        System.out.println(Arrays.toString(mb2));
//        System.out.println(Arrays.toString(mb4));
    }
}
