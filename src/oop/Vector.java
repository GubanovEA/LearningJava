package oop;

import java.lang.Math;

public class Vector { // после финальных сделал "Class can be a record"
    private final double x; // идея сказала, что они должны быть финальными
    private final double y;
    private final double z;
//    private  double x; // идея сказала, что они должны быть финальными
//    private  double y;
//    private  double z;


    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double lengthVector() { // почему-то не дал работать с флоатом
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalProd(Vector vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector vecProd(Vector vector){
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    public double cos(Vector vector) {
        return scalProd(vector) / (lengthVector() * vector.lengthVector());
    }

    public Vector add(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }

    public Vector subtr(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }

    public double[] showVac(){
        double[] Result = new double[3];
        Result[0] = x;
        Result[1] = y;
        Result[2] = z;
        return Result;
    }
    public static Vector[] createArrVec(int n){
        Vector[] Vectors = new Vector[n];
        for(int i =0; i < n; i++){
            Vectors[i] = new Vector(Math.random() * 100, Math.random() * 100, Math.random() * 100);
        }
        return Vectors;
    }

    public static void main(String[] args) {
        Vector Vec1 = new Vector(1, 2, 3);
        Vector Vec2 = new Vector(2, 3, 4);
        System.out.println(Vec1.lengthVector());
        System.out.println(Vec1.scalProd(Vec2));
        //System.out.println(ResVec.x, ResVec.y, ResVec.z);  //не дал мне так сделать
        System.out.println(Vec1.vecProd(Vec2));
        System.out.println(Vec1.cos(Vec2));
        System.out.println(Vec1.add(Vec2));
        System.out.println(Vec1.subtr(Vec2));
        Vector[] vector = createArrVec(5);
        System.out.println(Vec1.showVac()); // Implicit call to 'toString()' on array returned by call to 'Vec1.showVac()'
    }
}
