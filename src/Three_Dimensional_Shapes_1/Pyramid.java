package Three_Dimensional_Shapes_1;

public class Pyramid extends Shape{
    private double square;
    private double height;

    public Pyramid(double s, double h) {
        super(h * s * 4 / 3);
        this.square = s;
        this.height = h;
    }
}
