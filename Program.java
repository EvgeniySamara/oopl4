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
        Apple apl3 = new Apple();         
  
        Box<Apple> box1 = new Box<>();
        box1.add(apl1);
        box1.add(apl2);
        box1.add(apl3);        

        Orange or1 = new Orange();
        Orange or2 = new Orange();
        Orange or3 = new Orange();       
        Box <Orange> box2 = new Box<>();  
        Box <Orange> box3= new Box<>();          
        box2.add(or1); 
        box2.add(or2);    
        box3.add(or3);                 



        System.out.println("Сравнение коробок");
        System.out.println( String.format("Коробка №1 Вес: %f", box1.getWeight()));
        System.out.println( String.format("Коробка №2 Вес: %f", box2.getWeight()));
        System.out.println( String.format("Коробка №3 Вес: %f", box3.getWeight()));

        System.out.println("Результат сравнения 1 и 2 : "+  String.valueOf(box1.compare(box2)));
        System.out.println("Результат сравнения 1 и 3 : "+  String.valueOf(box1.compare(box3)));    

    
        String s = box2.getFruitsType();
      
        String substring = s.substring(s.lastIndexOf(".") + 1);
        System.out.println("В коробке: "+substring);

        box2.listBox();
        System.out.println("********");
        box3.listBox();
        System.out.println("********");
        int res = box2.moveTo(box3);
        if (res == 1) System.out.println("Успешно переложили"); 
        else  System.out.println("Несовместимые коробки"); 
        box2.listBox();
        System.out.println("********");
        box3.listBox();
        
    }

}
