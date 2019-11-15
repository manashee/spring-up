package com.manashee.singresp3;

import com.manashee.singresp3.Shape;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle implements Shape {

    double length;
    double breadth;

    @Override
    public double area() {
        return length * breadth;
    }
}
