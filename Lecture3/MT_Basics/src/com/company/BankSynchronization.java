package com.company;

public class BankSynchronization {

    public static void main(String[] args) throws InterruptedException {

        Bank obj1 = new Bank(1,100);
        Bank obj2 = new Bank(2,300);

        long start = System.currentTimeMillis();
        MyThread[] threads = new MyThread[6];

        threads[0] = new MyThread(obj1,true, 50);
        threads[1] = new MyThread(obj1,false, 100);
        threads[2] = new MyThread(obj1,true, 250);

        threads[3] = new MyThread(obj2,false, 100);
        threads[4] = new MyThread(obj2,true, 300);
        threads[5] = new MyThread(obj2,false, 150);

        for(int i = 0 ; i < threads.length ; i++){
            threads[i].start();
        }

        for(int i = 0 ; i < threads.length ; i++){
            threads[i].join();
        }

        System.out.println("Amount in account1 = "+ obj1.getBalance());
        System.out.println("Amount in account2 = "+ obj2.getBalance());
        System.out.println("Time consumed : "+(System.currentTimeMillis()-start));


    }

    public static class MyThread extends Thread{
        private Bank obj;
        private boolean isDeposit;
        private int amount;

        public MyThread(Bank obj, boolean isDeposit, int amount){
            this.obj = obj;
            this.isDeposit = isDeposit;
            this.amount = amount;
        }

        @Override
        public void run() {
            if(this.isDeposit){
                deposit();
            }else{
                withdraw();
            }

        }

        private void deposit() {

            synchronized (obj){
                System.out.println("In deposit function : account"+ obj.getAccountNo()+" and in thread " +currentThread().getName());
                int balance = obj.getBalance();
                obj.setBalance(balance+amount);
            }
        }

        private void withdraw() {
            synchronized (obj) {
                System.out.println("In withdraw function : account" + obj.getAccountNo() + " and in thread " + currentThread().getName());
                int balance = obj.getBalance();
//                try {
//                    sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                obj.setBalance(balance - amount);
            }
        }

    }
}
