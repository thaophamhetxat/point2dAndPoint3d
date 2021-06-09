package com.codegym;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Point2D point2D = new Point2D(2,5);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D);

        Point3D point3D = new Point3D(6,7,6);

        System.out.println(point3D);
    }
}
