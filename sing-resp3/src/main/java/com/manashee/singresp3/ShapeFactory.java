package com.manashee.singresp3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ShapeFactory {
    public static Shape fromString(String type, String shapeAsString) throws UnknownShapeException, JsonProcessingException{
            return createObj(shapeAsString, typeNameToClass(type));
    }

    private static <T> T createObj(String from,Class clazz) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        T t = (T) objectMapper.readValue(from, clazz);
        return t;
    }

    private static Class typeNameToClass(String type) throws UnknownShapeException {
        Class clazz = switch (type) {
            case "circle" -> Circle.class;
            case "rectangle" -> Rectangle.class;
            case "square" -> Square.class;
            default -> throw new UnknownShapeException(String.format("%s is not a recognized Shape", type));
        };

        return clazz;
    }
}