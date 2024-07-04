package com.Test.Components;

public class AbstractClassExample {
    public static void main(String[] args) {
        Car obj=new WagonR();
        obj.drive();
        obj.music();
    }
}
abstract class Car{
    public abstract void drive();


    public void music(){
        System.out.println("Play Music");
    }

}
class WagonR extends Car{
    public void drive(){
        System.out.println("Implementation for WagonR");
    }
}
