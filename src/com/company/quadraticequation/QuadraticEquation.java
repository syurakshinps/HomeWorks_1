package com.company;

public class QuadraticEquation {
    /*
    Алгоритм решения квадратного уравнения ax2 + bx + c = 0:
вычислить его значение дискриминанта по формуле D = b2−4ac;
если дискриминант отрицательный, зафиксировать, что действительных корней нет;
если дискриминант равен нулю, вычислить единственный корень уравнения по формуле х = −b/2a;
    */

    private double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private double Discriminant()
    {
        return b * b - 4 * a * c;
    }

    public void Solution()
    {
        System.out.println("Disclaimer: I don't check for division by zero (a = 0)" + "\n");
        if ( Discriminant() == 0)
        {
            double root = -b / (2 * a);
            System.out.println("Disriminats is " + Discriminant() + "." +
                    "\n" + "We only have one root. It's " + root);
        }
        else if (Discriminant() < 0)
        {
            System.out.println("Disriminats is " + Discriminant() + "." +
                    "\n" + "We have no real roots");
        }
        else if ( Discriminant() > 0)
        {
            double root1 = (-b + Math.sqrt ( Discriminant() ) ) / (2*a);
            double root2 = (-b - Math.sqrt ( Discriminant() ) ) / (2*a);
            System.out.println("Disriminats is " + Discriminant() + "." +
                    "\n" + "The discriminant is greater than 0 and we have 2 roots." +
                    "\n" + "Root 1 is " + root1 + "." +
                    "\n" + "Root 2 is " + root2 + ".");
        }

    }


}
