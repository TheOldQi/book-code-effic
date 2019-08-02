package com.qixiafei.book.code.effic.c2.overload;

import java.math.BigDecimal;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/7/1 11:15</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Overloaded {


    public static void main(String[] args) {
        Overloaded overloaded = new Overloaded();
        overloaded.m((char) 1);
        Obj i = new Obj();
        overloaded.m(i);
        BigDecimal a = new BigDecimal("0");
        BigDecimal b = new BigDecimal("0.0");
        System.out.println(a.scale());
        System.out.println(b.scale());
        System.out.println(a.compareTo(b));
        System.out.println(0.1);
        BigDecimal.valueOf(0.1);
        i.hello();
    }

//    public void m(byte i) {
//        System.out.println("这是byte");
//    }

//    public void m(char i) {
//        System.out.println("这是 char");
//    }

    public void m(short i) {
        System.out.println("这是 short");
    }

    public void m(int i) {
        System.out.println("这是 int");
    }

    public void m(long i) {
        System.out.println("这是 long");
    }

    public void m(float i) {
        System.out.println("这是 float");
    }

    public void m(double i) {
        System.out.println("这是 double");
    }


    public void m(byte... i) {
        System.out.println("这是byte...");
    }

    public void m(char... i) {
        System.out.println("这是 char...");
    }

    public void m(short... i) {
        System.out.println("这是 short...");
    }

    public void m(int... i) {
        System.out.println("这是 int...");
    }

    public void m(long... i) {
        System.out.println("这是 long...");
    }

    public void m(float... i) {
        System.out.println("这是 float...");
    }

    public void m(double... i) {
        System.out.println("这是 double...");
    }

    public void m(Byte i) {
        System.out.println("这是 Byte");
    }

    public void m(Character i) {
        System.out.println("这是 Character");
    }

    public void m(Short i) {
        System.out.println("这是 Short");
    }

    public void m(Integer i) {
        System.out.println("这是 Integer");
    }

    public void m(Long i) {
        System.out.println("这是 Long");
    }

    public void m(Float i) {
        System.out.println("这是 Float");
    }

    public void m(Double i) {
        System.out.println("这是 Double");
    }

    public void m(Byte... i) {
        System.out.println("这是 Byte...");
    }

    public void m(Character... i) {
        System.out.println("这是 Character....");
    }

    public void m(Short... i) {
        System.out.println("这是 Short...");
    }

    public void m(Integer... i) {
        System.out.println("这是 Integer...");
    }

    public void m(Long... i) {
        System.out.println("这是 Long...");
    }

    public void m(Float... i) {
        System.out.println("这是 Float...");
    }

    public void m(Double... i) {
        System.out.println("这是 Double...");
    }


    public void m(Object i) {
        System.out.println("这是 Object");
    }

    public void m(Object... i) {
        System.out.println("这是 Object...");
    }

    public void m(Obj a) {
        System.out.println("这是obj");
    }

    public void m(Obj... a) {
        System.out.println("这是obj...");
    }

    public void m(ObjP a) {
        System.out.println("这是objP");
    }

    public void m(ObjG a) {
        System.out.println("这是objG");
    }

    public void m(IB a) {
        System.out.println("这是IB");
    }

    public void m(IA a) {
        System.out.println("这是IA");
    }

}
