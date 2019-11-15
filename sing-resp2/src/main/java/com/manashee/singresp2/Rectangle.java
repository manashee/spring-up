package com.manashee.singresp2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle {

    double length;
    double breadth;

    public double area() {
        return length * breadth;
    }
}
