package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }


    public String startEngine(){
        String simple= getClass().getSimpleName();
        System.out.println(simple);
        return "the Ford's engine is starting";
    }
    public String accelerate(){
        String simple= getClass().getSimpleName();
        System.out.println(simple);
        return "the Ford is accelerating";
    }
    public String brake(){
        String simple= getClass().getSimpleName();
        System.out.println(simple);
        return "the Ford is braking";
    }
}
