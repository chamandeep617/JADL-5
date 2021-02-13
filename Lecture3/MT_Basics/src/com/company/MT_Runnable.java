package com.company;

public class MT_Runnable {
    public static void main(String[] args) {

        MyThread obj = new MyThread();
        Thread thread = new Thread(obj);
        thread.start();

    }

    public static class A{

    }

    public static class MyThread extends A implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
