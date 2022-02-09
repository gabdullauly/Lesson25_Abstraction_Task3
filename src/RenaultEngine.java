/*
Create a RenaultEngine class that inherits from the Engine class.
- double extraTurboEnergy;
Parameterized constructors and the default constructor
Implement all abstract methods
In RenaultEngine, you will evaluate abstract methods using the formula:
Efficiency: 0.27
Throttle energy: engineVolume * cylinderAmount * 110 + extraTurboEnergy
Break energy: engineWeight * 2.1
 */

import java.security.PrivateKey;
import java.security.PublicKey;

public class RenaultEngine extends Engine{
    private double extraTurboEnergy;

    public RenaultEngine(){}
    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy, String nameCar){
        super(engineVolume, cylinderAmount, engineWeight, nameCar);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double getExtraTurboEnergy(){
        return extraTurboEnergy;
    }

    public void setExtraTurboEnergy(double extraTurboEnergy){
        this.extraTurboEnergy = extraTurboEnergy;
    }

    @Override
    public double efficiency(){
        return 0.27;
    }

    @Override
    public double throttleEnergy(){
        return getEngineVolume()*getCylinderAmount()*110*extraTurboEnergy;
    }

    @Override
    public double breakEnergy() {
        return getEngineWeight()*2.1;
    }
}
