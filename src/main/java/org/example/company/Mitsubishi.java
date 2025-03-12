package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }



    public String startEngine(){
        String simple= getClass().getSimpleName();
        System.out.println(simple);
        return "the Mitsubishi's engine is starting";
    }
    public String accelerate(){
        String simple= getClass().getSimpleName();
        System.out.println(simple);
        return "the Mitsubishi is accelerating";
    }
    public String brake(){
        String simple= getClass().getSimpleName();
        System.out.println(simple);
        return "the Mitsubishi is braking";
    }
}
