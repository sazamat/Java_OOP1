package com.company;

public class Points {
    private double x, y;

    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double Distance(int x2,int y2){
        double distance=Math.sqrt((x2-x)*(x2-x)+(y2-y)*(y2-y));
        return distance;

    }
}
