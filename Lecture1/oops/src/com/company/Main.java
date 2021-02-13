package com.company;

class Singleton
{
    // static variable single_instance of type Singleton
    private static Singleton single_instance = null;
    // variable of type String
    public String s;
    // private constructor restricted to this class itself
    private Singleton() {
        s = "Hello I am a string part of Singleton class";
        System.out.println("object Created");
    }
    // static method to create instance of Singleton class
    public static Singleton getInstance() {
        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}

public class Main {



    public static void main(String[] args) {
//        calculator obj1 = new calculator();
//        System.out.println(obj1.findSum(1,2));
//        System.out.println(obj1.findSum(1.0,2.0));


//        int a = 5;
//        int b = 6;
//        int c = Math.max(a,b);

        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();


        Math.max
        // write your code here
    }
}
