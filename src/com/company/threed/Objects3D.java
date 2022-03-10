package com.company.threed;

public abstract class Objects3D {

    protected double length;
    protected double width;
    protected double height;

    public Objects3D(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Objects3D(double length) {
        this.length = length;

    }

    //Cube

    //Ball
    public abstract double getVolume(double length);
    public abstract double getSquare(double length);

    //block
    /*
    public abstract double getVolume(double length, double width, double height);
    public abstract double getSquare(double length, double width);
    */
}
