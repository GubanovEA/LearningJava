package Three_Dimensional_Shapes_1;

import java.util.ArrayList;

public class Box extends Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double a, double b, double h) {
        super(a * b * h);
    }

    public boolean add(Shape shape) {
        double leftSpace = this.getVolume();
        if (this.getVolume() >= shape.getVolume()) {
            shapes.add(shape);
            leftSpace -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}