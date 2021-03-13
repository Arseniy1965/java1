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
        return n <= 2 ? BigInteger.ONE : (fibonacci(n -1).add(fibonacci(n - 2)));
    }

    public static void main(String[] args) {

    System.out.println(fastPow(BigDecimal.valueOf(21),13));
    System.out.println(fibonacci(3));

    }
}
