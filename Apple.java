package ru.geekbrains.oop.lesson4.homework;

public class Apple extends Fruit {
    public Apple() {
        super(1f);
    }
  @Override
  public String toString() {
      
      return String.format("Яблоко, вес: %f",this.getWeight()) ;
  }  
}
