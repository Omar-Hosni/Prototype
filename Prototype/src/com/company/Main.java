package com.company;

abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getID(){
        return id;
    }

    public void setID(String id){
        this.id = id;
    }

    public Object clone(){
        Object clone = null;

        try{
            clone = super.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}

class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method");
    }
}

class Square extends Shape{
    public Square(){
        type = "Square";
    }
    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method");
    }
}

class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }
    @Override
    public void draw(){
        System.out.println("Inside Circle::draw() method");
    }
}

public class Main{
    public static void main(String[] args){
        ShapeCache.loadCache();
        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType());
    }
}

