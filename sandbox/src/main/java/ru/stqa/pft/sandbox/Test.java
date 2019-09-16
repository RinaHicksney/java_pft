package ru.stqa.pft.sandbox;

public class Test {
	public static void main (String[] args){
        hello("world");
        hello("Marina");

        double l =5;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

        double a = 5;
        double b = 7;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = "+ area(a,b));
}
    public static void hello (String some){
        System.out.println("Hello, " + some + "!");
    }

    public static double area(double a){
	    return a*a;
    }

    public static double area(double a, double b){
	    return a*b;
    }
}