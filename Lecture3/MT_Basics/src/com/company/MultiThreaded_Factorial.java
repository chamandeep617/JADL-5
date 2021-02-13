package com.company;

import java.math.BigInteger;

public class MultiThreaded_Factorial {

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {10000, 20000, 30000, 45000, 53000, 45000, 20000, 30000};

        long start = System.currentTimeMillis();

        MyThread[] threads = new MyThread[arr.length];
        for(int i = 0 ; i < threads.length ; i++){
            threads[i] = new MyThread(arr[i]);
            threads[i].start();

        }

        for(int i = 0 ; i < threads.length ; i++){
            threads[i].join();
        }

        for(int i = 0 ; i < threads.length ; i++){
            System.out.println(threads[i].result);
        }

        System.out.println("Time Consumed = "+(System.currentTimeMillis()-start));
    }

    public static class MyThread extends Thread{

        private int num;
        private BigInteger result;

        public MyThread(int num){
            this.num = num;
            this.result = BigInteger.ONE;
        }

        @Override
        public void run() {
//            try {
//                sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            calculateFactorial();
        }

        private void calculateFactorial() {

            for(int i = 2 ; i <= num ; i++){
                result = result.multiply(BigInteger.valueOf(i));
            }

        }
    }
}
