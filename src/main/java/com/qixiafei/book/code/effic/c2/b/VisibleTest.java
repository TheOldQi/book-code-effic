package com.qixiafei.book.code.effic.c2.b;

import com.qixiafei.book.code.effic.c2.a.VisibleScope;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/6/28 18:29</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class VisibleTest {

    public static void main(String[] args) {
        VisibleScope scope = new VisibleScope();

        VisibleSon son = new VisibleSon();

    }


    public static class VisibleSon extends VisibleScope{

        @Override
        public void protec(){}

        public static void main(String[] args) {
            VisibleSon son = new VisibleSon();
            son.protec();
        }
    }
}
