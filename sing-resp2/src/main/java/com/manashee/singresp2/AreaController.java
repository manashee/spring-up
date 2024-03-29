package com.manashee.singresp2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaController {


    // Seperate types for each shape. Area compute functions distributed
    // However, still one controller function for each type of shape
    // It needs changes every time a new Shape is added.
    // Could we avoid this?
    // useful to name functions seperately
    @GetMapping("/circle/area")
    public double circleArea(@RequestParam(name = "radius") double radius) {
        return new Circle ( radius ).area();
    }

    @GetMapping("/rectangle/area")
    public double rectangleArea (@RequestParam(name = "length") double length,
                         @RequestParam(name = "breadth") double breadth ) {
        return new Rectangle ( length, breadth ).area();
    }

    @GetMapping("/square/area")
    public double squareArea (@RequestParam(name = "length") double length ) {
        return new Rectangle ( length, length ).area();
    }

}
