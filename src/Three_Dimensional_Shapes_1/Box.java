package Three_Dimensional_Shapes_1;

import java.util.ArrayList;

public class Box extends Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double leftSpace;

    public Box(double a, double b, double h) {
        super(a * b * h);
        leftSpace = this.getVolume();
    }


    public boolean add(Shape shape) {
        if (leftSpace >= shape.getVolume()) {
            shapes.add(shape);
            leftSpace -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}