package ru.geekbrains.oop.lesson4.homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    public Box()
    {
        this.fruits = new ArrayList<T>();
    }
    private ArrayList<T> fruits;

    public String getFruitsType() {
        //System.out.println(fruits.get(0).getClass());
        return String.valueOf(fruits.get(0).getClass());
    }


    // e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    // подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    // Можно сравнивать коробки с яблоками и апельсинами;

    public Boolean compare(Box box)
    {
        if (this.getWeight() == box.getWeight()) return true;
        else return false;
    }


    public float getWeight()
    {
     //    float sumWeigth = 0; 
    //     for (T fruit : fruits) {
    //         sumWeigth = sumWeigth + fruit.getWeight();
 
    //     }
         
        float sumWeigth = fruits.size()*fruits.get(0).getWeight();
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
