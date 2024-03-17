package ru.geekbrains.oop.lesson4.homework;

import java.util.ArrayList;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */

    public static void main(String[] args) {
        Apple apl1 = new Apple();
        Apple apl2 = new Apple();   
        Orange or1 = new Orange();
        System.out.println(or1);
        Box box1 = new Box<>();
        box1.add(apl1);
        box1.add(apl2);
        ArrayList<Apple> apples = box1.getList();
        for (Apple apple : apples) {
            System.out.println(apple);
        }
        System.out.println(box1.getWeight());
        //System.out.println(box1.getClass());
        String s = box1.getFruitsType();
        // String s = "class ru.geekbrains.oop.lesson4.homework.Apple"
        String substring = s.substring(s.lastIndexOf(".") + 1);
        System.out.println(substring);
    }

}
