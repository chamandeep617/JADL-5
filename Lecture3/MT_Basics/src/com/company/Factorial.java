package com.company;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        int[] arr = {10000, 20000, 30000, 45000,53000, 45000, 20000,30000};

        long start = System.currentTimeMillis();
        for(int i : arr){
            System.out.println(calculateFactorial(i));
        }

        System.out.println("time Consumed = "+ (System.currentTimeMillis()-start));
    }

    private static BigInteger calculateFactorial(int number) {
        BigInteger result = BigInteger.ONE;
        for(int i = 2 ; i <= number ; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }


}
