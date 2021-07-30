package oop;

import java.lang.Math;

public class Vector { // после финальных сделал "Class can be a record"
    private  double x; // идея сказала, что они должны быть финальными
    private  double y;
    private  double z;
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

    public static Vector[] createArrVec(int n){
        Vector[] Vectors = new Vector[n];
        for(int i =0; i < n; i++){
            Vectors[i] = new Vector(Math.random() * 100, Math.random() * 100, Math.random() * 100);
        }
        return Vectors;
    }

    @Override
    public String toString() {
        return "x = " + x + " y = " + y + " z = " + z;
    }

    public static void main(String[] args) {
        Vector[] vector = createArrVec(5);
        System.out.println(vector[0].lengthVector());
        System.out.println(vector[0].scalProd(vector[1]));
        System.out.println(vector[0].vecProd(vector[1]));
        System.out.println(vector[0].cos(vector[1]));
        System.out.println(vector[0].add(vector[1]));
        System.out.println(vector[0].subtr(vector[1]));
    }
}
