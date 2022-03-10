package com.company.threed;

public class Rectangular3D extends Objects3D {

    public Rectangular3D(double length, double width, double height) {
        super(length, width, height);
    }

    public Rectangular3D(double length) {
        super(length);
    }


    //Cube
    @Override
    public double getVolume(double length ){
        return length*length*length;
    }

    //block
    public double getVolume(){
        return length * width * height;
    }

    public double getSquare(double length, double width){
        return length * width;
    }
    @Override
    public double getSquare(double length){
        return length*length;
    }
}
