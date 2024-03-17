package ru.geekbrains.oop.lesson4.homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    public Box()
    {
        this.fruits = new ArrayList<T>();
    }
    private ArrayList<T> fruits;

    // d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    // вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    // e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    // подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    // Можно сравнивать коробки с яблоками и апельсинами;
    public float getWeight(Box box)
    {
        float sumWeigth = 0; 
        for (T fruit : fruits) {
            sumWeigth = sumWeigth + fruit.getWeight();
 
        }
        return sumWeigth;
    }

    public  ArrayList<T> getList()
    {
        return this.fruits;
    }

    public void add (T fruit)
    {
        this.fruits.add(fruit);
        // for (T t : fruits) {
        //     System.out.println(t);
        // }
    }
}
