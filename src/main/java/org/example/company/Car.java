package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders,String name){
        this.engine=true;
        this.cylinders=cylinders;
        this.name=name;
        this.wheels=4;
    }
    public String getName(){
        return name;
    }
    public int getCylinders(){
        return cylinders;
    }

    public boolean equals(Object car){
        return (((Car)car).name ==name && (((Car)car).wheels) == wheels);
    }
    public String toString(){
        return "Name: " + name+ "Cylinders: " +cylinders+ "Engine" + engine+ "Wheels: " +wheels;
    }
    public String startEngine(){
        String simple= getClass().getSimpleName();
        System.out.println(simple);
        return "the car's engine is starting";
    }
    public String accelerate(){
        String simple= getClass().getSimpleName();
        System.out.println(simple);
        return "the car is accelerating";
    }
    public String brake(){
        String simple= getClass().getSimpleName();
        System.out.println(simple);
        return "the car is braking";
    }


}
