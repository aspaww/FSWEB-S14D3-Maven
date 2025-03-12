package org.example.arge;

public class GasPoweredCar extends  CarSkeleton{
    private double avgmKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name,String description,double avgmKmPerLitre,int cylinders){
        super(name,description);
        this.avgmKmPerLitre=avgmKmPerLitre;
        this.cylinders=cylinders;
    }

    public double getAverageKmPerLiter(){
        return avgmKmPerLitre;
    }
    public int getCylinders(){
        return cylinders;
    }


    @Override
    public void startEngine(){
        System.out.println("Gaz powered CaR Start Engine");
    }


}
