package com.qixiafei.book.code.effic.c6;

import com.qixiafei.book.code.effic.c2.overload.Obj;
import com.qixiafei.book.code.effic.c2.overload.ObjP;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/7/2 18:57</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class ArrayDemo {
    public static void main(String[] args) {

        Object[] objArray = new Object[3];
        objArray[0] = 1;
        objArray[1] = "2";
        objArray[2] = new Object();

        System.out.println(Arrays.toString(objArray));

        List a1 = new ArrayList();
        a1.add(new Object());
        a1.add(new Integer(1));
        a1.add(new String("hello a1a1"));
        System.out.println(a1);

        List<Object> a2 = a1;

        a2.add(new Object());
        a2.add(new Integer(2));
        a2.add(new String("hello a2a2"));

        List<Integer> a3 = a1;
        a3.add(new Integer(3));
//        a3.add(new Object());
//        a3.add(new String("hello a3a3"));

        List<?> a4 = a1;
        a4.remove(0);
        a4.clear();
//        a4.add(new Object());

        List<? super Obj> list = new ArrayList<>();
        List<ObjP> list1 = new ArrayList<>();
        list = list1;

    }
}
