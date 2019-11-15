package com.manashee.springup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {

    @GetMapping(value = "/circle/{l}")
    public double circle(@PathVariable(name = "l") int l) throws UnknownShapeException {
        return new Shape(Shape.SHAPES.CIRLCE,l,1).area(); // CHANGE
    }

    @GetMapping(value = "/square/{l}")
    public double square(@PathVariable(name = "l") int l) throws UnknownShapeException {
        return new Shape(Shape.SHAPES.SQUARE,l,1).area(); // CHANGE
    }

    // CHANGE
    @GetMapping(value = "/rectangle")
    public double square(@RequestParam(name = "l") int l, @RequestParam(name = "b") int b) throws UnknownShapeException {
        return new Shape(Shape.SHAPES.RECTANGLE,l,b).area();
    }
}
