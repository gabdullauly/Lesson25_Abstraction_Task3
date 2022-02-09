/*
Create a FerrariEngine class that inherits from the Engine class. Parameterized constructors and the default constructor
Implement all abstract methods
In FerrariEngine, you will evaluate abstract methods using the formula:
Efficiency: 0.25
Throttle energy: engineVolume * cylinderAmount * 100
Break energy: engineWeight * 2
 */

public class FerrariEngine extends Engine{
    @Override
    public double efficiency(){
        return 0.25;
    }

    @Override
    public double throttleEnergy(){
        return getEngineVolume()*getCylinderAmount()*100;
    }

    @Override
    public double breakEnergy(){
        return getEngineWeight()*2;
    }

    public FerrariEngine(){}
    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight, String carName){
        super(engineVolume, cylinderAmount, engineWeight, carName);
    }
}
