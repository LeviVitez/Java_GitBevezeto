package hu.petrik.javabevezeto;

public class feladat15 {
    public static void main(String[] args) {
        double[] tomb = new double[25];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i]=Math.random()*200-100; //-100 és 100 között random szám
        }
    }
}
