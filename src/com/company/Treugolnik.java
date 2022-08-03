package com.company;

public class Treugolnik {
    double a;
    double b;
    double c;

    public void area() {

        double s = (a + b + c) / 2;
        System.out.println("ploshad treugolnika: " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));

    }
}
