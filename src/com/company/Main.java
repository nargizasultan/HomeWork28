package com.company;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        UnaryOperator<Double>sqrt=(x)->Math.sqrt(x);
        System.out.println(sqrt.apply(4d));

    }
}
