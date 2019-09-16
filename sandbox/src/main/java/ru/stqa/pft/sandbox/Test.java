package ru.stqa.pft.sandbox;

public class Test {
	public static void main (String[] args){
        hello("world");
        hello("Marina");

        Square s = new Square();
        s.l =5;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle();
        r.a = 5;
        r.b = 7;
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = "+ area(r));
}
    public static void hello (String some){
        System.out.println("Hello, " + some + "!");
    }

    public static double area(Square s){
	    return s.l * s.l;
    }

    public static double area(Rectangle r){
	    return r.a * r.b;
    }
}