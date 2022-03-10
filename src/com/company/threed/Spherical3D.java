package com.company.threed;

public class Spherical3D extends Objects3D {

 //   private double length;
    public Spherical3D(double length) {
        super(length);
    }

    //Ball
    @Override
    public double getVolume(double length ){
        return 4*Math.PI*length*length*length/3;
    }
    @Override
    public double getSquare(double length){
        return Math.PI*length*length;
    }
}
