package ru.stqa.pft.sandbox;

public class Test {
	public static void main (String[] args){
        hello("world");
        hello("Marina");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = "+ r.area());
/*
	    Point p1 = new Point();
	    p1.x = 3;
	    p1.y = 6;

        Point p2 = new Point();
        p2.x = 5;
        p2.y = 4;
        System.out.println("Расстояние между двумя точками ="+ distance(p1,p2));
*/
        Point p1 = new Point(3, 6);
        Point p2 = new Point(5, 4);
        System.out.println("Расстояние между двумя точками ="+ p2.distance(3,6));

	}

    public static void hello (String some){
        System.out.println("Hello, " + some + "!");
    }
    /*
        //функция вычисления расстояния между точками
        public static double distance(Point p1, Point p2){
            return Math.sqrt((p2.x-p1.x)*((p2.x-p1.x))+(p2.y-p1.y)*(p2.y-p1.y));
        }
*/


}