package com.devix.company;
//1.Method with out return type  and without arguments.

public class Main {

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.add();
    }
}

class Sample {
    public void add() {
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);
    }
}
