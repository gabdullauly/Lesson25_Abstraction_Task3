/*
Create an abstract Engine class with parameters:
 - double engineVolume;
- int cylinderAmount;
- double engineWeight;
Parameterized constructors and the default constructor Getters and Setters
•	+  abstract double efficiency ();
•	+  abstract double throttleEnergy ();
•	+  abstract double breakEnergy ();
•	+  double getMaxSpeed () {
return (throttleEnergy () - breakEnergy ()) * efficiency (); }
 */

public abstract class Engine {
    private double engineVolume;
    private int cylinderAmount;
    private double engineWeight;
    private String nameCar;

    public abstract double efficiency();
    public abstract double throttleEnergy();
    public abstract double breakEnergy();

    public double getMaxSpeed(){
        return (throttleEnergy()-breakEnergy())*efficiency();
    }

    public Engine (){}
    public Engine(double engineVolume, int cylinderAmount, double engineWeight, String nameCar){
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
        this.nameCar = nameCar;
    }

    public double getEngineVolume (){
        return engineVolume;
    }

    public int getCylinderAmount(){
        return cylinderAmount;
    }

    public double getEngineWeight(){
        return engineWeight;
    }

    public String getNameCar(){
        return nameCar;
    }

    public void setEngineVolume(double engineVolume){
        this.engineVolume = engineVolume;
    }

    public void setCylinderAmount(int cylinderAmount){
        this.cylinderAmount = cylinderAmount;
    }

    public void setEngineWeight(double engineWeight){
        this.engineWeight = engineWeight;
    }

    public void setNameCar(String nameCar){
        this.nameCar = nameCar;
    }
}
