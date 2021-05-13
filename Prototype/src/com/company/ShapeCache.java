package com.company;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String , Shape> shapeMap = new Hashtable<String , Shape>();
    public static Shape getShape(String shapeID){
        Shape cachedShaped = shapeMap.get(shapeID);
        return (Shape) cachedShaped.clone();
    }

    public static void loadCache(){
    Circle circle = new Circle();
    circle.setID("1");
    shapeMap.put(circle.getID(), circle);

    Square square = new Square();
    square.setID("2");
    shapeMap.put(square.getID() , square);

    Rectangle rectangle = new Rectangle();
    rectangle.setID("3");
    shapeMap.put(rectangle.getID() , rectangle);

    }
}
