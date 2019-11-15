package com.manashee.singresp3;

import com.manashee.singresp3.Shape;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Circle implements Shape {

    private double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
// {"radius":10.0}