package ru.stqa.pft.sandbox;

import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main (String[] args){
        /*
        String[] langs = new String[4]; //переменная типа массив строк. Размер указывается при создании и изменить нельзя
         */
        /*
        langs[0] = "Java";
        langs[1] = "C#";
        langs[2] = "Python";
        langs[3] = "PHP";
        */
        String[] langs = {"Java", "C#", "Python", "PHP"};
        /*for (int i =0; i< langs.length; i++){
            System.out.println("Я хочу выучить" + langs[i]);
        }*/

        //Список это обычный объект
        // <String> - внутри тип элементов входящих в список
        // можно не указывать тип, тогда в список можно поместить любые разные типы,
        // но указать в цикле тогда не сможем. Надо будет указывать тип Object
        /*List<String> languages = new ArrayList<String>(); //размер не указываем, можно наполнять постепенно
        languages.add("Java"); //размер списка стал еденица
        languages.add("C#"); //размер списка увеличился еще на еденицу
        languages.add("Python#");*/

        List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");

        for (String l : langs){ //l -  ссылка на элемент массива. Последоваательно на все элементы массива
            System.out.println("Я хочу выучить" + l);
        }

        /*for (String l : languages){ //l -  ссылка на элемент массива. Последоваательно на все элементы массива
            System.out.println("Я хочу выучить" + l);  //такой цикл удобней, чем слудующий
        }*/

        for (int i = 0;i < languages.size(); i++){
            System.out.println("Я хочу выучить" + languages.get(i));
        }
    }
}
