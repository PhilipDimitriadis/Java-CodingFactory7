package gr.aueb.cf.ch13.exersices;

import gr.aueb.cf.ch13.exersices.PointXYZ;

public class Main {

    public static void main(String[] args) {
        PointXYZ point = new PointXYZ(3, 5, 1);

        System.out.println("Point: " + point);
        System.out.println("Distance from origin (XYZ): " + point.getXYZDistance());
        System.out.println("Distance in XY: " + point.getXYDistance());
        System.out.println("Distance in XZ: " + point.getXZDistance());
        System.out.println("Distance in YZ: " + point.getYZDistance());
    }
}
