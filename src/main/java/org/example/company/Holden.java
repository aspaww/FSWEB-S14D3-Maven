package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }


    public String startEngine(){
        String simple= getClass().getSimpleName();
        System.out.println(simple);
        return "the Holden's engine is starting";
    }
    public String accelerate(){
        String simple= getClass().getSimpleName();
        System.out.println(simple);
        return "the Holden is accelerating";
    }
    public String brake(){
        String simple= getClass().getSimpleName();
        System.out.println(simple);
        return "the Holden is braking";
    }
}
