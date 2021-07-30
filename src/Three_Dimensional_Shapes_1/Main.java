package Three_Dimensional_Shapes_1;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, 4);
        Cylinder cylinder2 = new Cylinder(2, 4);
        Pyramid pyramid = new Pyramid(500,100);
        Box box = new Box(5, 2, 10);

        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
        System.out.println(box.add(cylinder2));
    }
}
