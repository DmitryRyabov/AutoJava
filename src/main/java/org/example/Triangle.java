package org.example;

public class Triangle {


    int a = 1;
    int b = 2;
    int c = 3;

    public double triangleArea(int a, int b, int c) throws MyException {
        if(a<=0 || b<=0 || c<=0) throw new MyException("Это не треугольник");
        double area = 0;
        double s = (a + b + c)/2;
        area = Math.sqrt(s*(s - a)*(s - b)*(s - c));
        return area;

    }
}
