package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;


public class BigAlgebra {


    //Бинарное возведение в степень

    static BigDecimal fastPow(BigDecimal num, int pow) {

        switch (pow) {
            case 0: return BigDecimal.ONE;
            case 1: return num;
        }

    BigDecimal big = fastPow(num,pow/2).multiply(fastPow(num,pow/2));

        if (pow%2==0) {
            return big;
        } else {
            return big.multiply(num);
        }

    }

    static BigInteger fibonacci(int n) {

        if (n <= 2) return BigInteger.ONE;

        BigInteger big1 = BigInteger.ONE;
        BigInteger big2 = BigInteger.ONE;
        BigInteger result = null;
        for (int i = 3; i < n; i++) {
            result = big1.add(big2);
            big2 = big1;
            big1 = result;
        }
        return result;
    }

    public static void main(String[] args) {

    System.out.println(fastPow(BigDecimal.valueOf(21),13));//21 13
    System.out.println(Math.pow(21.0,13.0));
    System.out.println(fibonacci(100));
    }
}
