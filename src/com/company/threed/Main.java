package com.company.threed;


/*
Домашнее задание № 2 - сделать абстрактный класс «трёхмерная фигура»,
с методами «объём» и «площадь поверхности». Написать его реализации для шара,
куба, прямоугольного параллепипеда.
 */

public class Main {

    public static void main(String[] args) {
Objects3D cube1= new Rectangular3D(1);
        Objects3D cube2= new Rectangular3D(3, 3, 3);
Objects3D sphere1 = new Spherical3D(10);
System.out.println("volume " + cube1.getVolume(cube1.length));
        System.out.println("volume " + cube2.getVolume(cube2.length));
        System.out.println("volume " + sphere1.getVolume(sphere1.length));
    }
}
