package com.manashee.singresp3;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaController {
    // Seperate types for each shape. Area compute functions distributed
    // Here there is no need for seperate controller functions.
    // And no need to change the controlller every time a new Shape is added.
    // The client code always refers to concrete types and instances through a generic interface.
    // But is this less type safe?
    @GetMapping("/area")
    public double area(@RequestParam(name = "type") String type,
                       @RequestParam(name = "shapeAsString") String shapeAsString) throws UnknownShapeException, JsonProcessingException {
        Shape shape = ShapeFactory.fromString(type,shapeAsString);
        return shape.area();
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
