package com.Test.Components;

class b implements A{
    @Override
    public void show() {
        System.out.println("Test");
    }

    @Override
    public void config() {
        System.out.println("COnfiguration part");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        A obj;
        obj = new b();
        obj.show();
        obj.config();
        System.out.println(A.age);


    }

}
interface A{
    int age= 24;//Final and static
    String area = "Salem";  //Final and static
    void show();
    void config();
}

