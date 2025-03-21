package org.example.arge;

import java.util.concurrent.CyclicBarrier;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name,String description,double avgKmPerLitre,int batterySize,int cylinders){
        super(name,description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.batterySize=batterySize;
        this.cylinders= cylinders;
    }
    public double getAvgKmPerLiter(){
        return avgKmPerLitre;
    }
    public int getBatterySize(){
        return batterySize;
    }
    public int getCylinders(){
        return cylinders;
    }


    @Override
    public void startEngine(){
        System.out.println("Hybrid Car Start Engine");
    }

}
