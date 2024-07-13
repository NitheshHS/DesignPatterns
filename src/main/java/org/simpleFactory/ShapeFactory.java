package org.simpleFactory;

public class ShapeFactory {

    public static Shape drawShape(String shapeType){
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        else if(shapeType.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }
        else{
            return null;
        }
    }
}
