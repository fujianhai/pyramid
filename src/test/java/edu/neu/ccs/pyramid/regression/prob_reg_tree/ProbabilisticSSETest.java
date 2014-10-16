package edu.neu.ccs.pyramid.regression.prob_reg_tree;

import static org.junit.Assert.*;

public class ProbabilisticSSETest {
    public static void main(String[] args) {
        test1();
    }

    private static void test1(){
        double[] labels = {1,2};
        double[] probs = {0.3,0.2};
        System.out.println(ProbabilisticSSE.mean(labels,probs));
        System.out.println(ProbabilisticSSE.sse(labels,probs));
    }

}