package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("In the main function:- before calling funtion1");
        func1();
        System.out.println("In the main function:- After calling funtion1");
    }

    private static void func1() {
        System.out.println("In the function1:- before calling funtion2");
        func2();
        System.out.println("In the function1:- After calling funtion2");
    }

    private static void func2() {
        System.out.println("In the funtion2");
    }
}
