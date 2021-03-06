package edu.neu.ccs.pyramid.util;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Created by chengli on 10/2/16.
 */
public class MathUtilTest{
    public static void main(String[] args) {
        test4();
    }

    private static void test1(){
        double[] p  = {0.5, 0.5};
        System.out.println(Arrays.toString(MathUtil.inverseSoftMax(p)));
    }

    private static void test2(){
        double[] p  = {0.3, 0.7};
        System.out.println(Arrays.toString(MathUtil.inverseSoftMax(p)));
    }

    private static void test3(){
        double[] p  = {0, 1};
        System.out.println(Arrays.toString(MathUtil.inverseSoftMax(p)));
    }

    private static void test4(){
        double[] s = {-5,5};
        System.out.println(Arrays.toString(MathUtil.softmax(s)));
    }

}