package com.manashee.singresp3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square implements Shape {

    double length;

    @Override
    public double area() {
        return length * length;
    }
}
