package com.company;

public class MT_ExtendingThreadClass {

    public static void main(String[] args) throws InterruptedException {
        MyThread obj = new MyThread();
        obj.setDaemon(true);
//        obj.run();
        obj.start();
//        Thread.sleep(2000);
//        obj.join();
        System.out.println("In the this "+ Thread.currentThread().getName());
    }

    public static class MyThread extends Thread{

        @Override
        public void run() {
            System.out.println("In the this "+ currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            calculate();
        }

        private void calculate() {
            int sum = 0;

            for(int i = 1 ; i <= 100 ; i++){
                sum+=i;
            }
            System.out.println("sum = "+sum);
        }
    }
}
