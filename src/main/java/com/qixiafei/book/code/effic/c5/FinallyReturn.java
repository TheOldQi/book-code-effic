package com.qixiafei.book.code.effic.c5;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/7/2 18:21</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class FinallyReturn {

    static int x = 1;
    static int y = 10;
    static int z = 100;

    public static void main(String[] args) {
        int value = test();
        System.out.println("value:" + value);
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("z:" + z);
    }

    private static int test() {
        try {
            return x++;
        } catch (Exception e) {
            return y++;
        } finally {
            return ++z;
        }
    }
}
