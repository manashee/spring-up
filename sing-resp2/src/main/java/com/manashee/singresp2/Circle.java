package com.manashee.singresp2;

import lombok.AllArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
public class Circle {

    double radius;

    public double area() {
        return Math.PI * radius * radius;
    }
}
