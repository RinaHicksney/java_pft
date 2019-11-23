package ru.stqa.pft.sandbox;

public class Equality {
    public static void main (String[] args ){

        //для сравнения объектов использовать EQUALS

        //одинаковый результат , успешно
        //String s2 = s1; - тут скопировалась ссылка на сущ. объект
        //s1 == s2 это сравнение ссылок (физическое)
        String s1 = "firefox";
        String s2 = s1;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        //разный результат/ 1 - не равны. 2. равны
        // equals - сравниваются не ссылки, а сами объекты (логическое)
        String s3 = "firefox";
        String s4 = new String(s3);

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        //java считает что переменные ссылаюются на один и тот же физический объект
        //компилятор оптимизирует код
        //части переменной склеит уже на этапе компиляции
        String s5 = "firefox";
        String s6 = "fir" + "efox";

        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
    }
}
