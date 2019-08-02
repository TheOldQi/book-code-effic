package com.qixiafei.book.code.effic.c4;

import java.lang.reflect.InvocationTargetException;

/**
 * <P>Description: 字节码. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/7/1 21:04</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class ByteCode {

    final long unique;

    private ByteCode() {
        unique =  System.currentTimeMillis();
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, InterruptedException {
//        int a = -2;
//        int b = -1;
//        int c = 0;
//        int d = 300;
//        int e = 20000;
//        int f = 40000;
//
//        int g = a + b;
//        int h = c * d;
//        int i = e - f;
//        System.out.println(Thread.currentThread().getContextClassLoader());
//        System.out.println(Thread.currentThread().getContextClassLoader().getParent());
//        System.out.println(Thread.currentThread().getContextClassLoader().getParent().getParent());
//        Class classA = Obj.class;
//        Constructor declaredConstructor = classA.getDeclaredConstructor(int.class);
//        declaredConstructor.setAccessible(true);
//        declaredConstructor.newInstance(1);
//        int i = 0;
//        int y = i++;
//        int z = ++i;
//
//        ByteCode byteCode1 = new ByteCode();
//
//        System.out.println(byteCode1.unique);
//        Thread.sleep(20);
//        ByteCode byteCode2 = new ByteCode();
//        System.out.println(byteCode2.unique);
    }
}
