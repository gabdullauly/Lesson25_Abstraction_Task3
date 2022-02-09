/*
3)In the main Main class, create 10 FerrariEngine and RenaultEngine objects with different values.
Add everything to the array of the Engine class.
Output the maximum speeds of each object
 */

import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        FerrariEngine ferrariEngine = new FerrariEngine();
        ferrariEngine.setEngineVolume(2.5);
        ferrariEngine.setCylinderAmount(6);
        ferrariEngine.setEngineWeight(4.1);
        ferrariEngine.setNameCar("Ferrari_1");


        FerrariEngine ferrariEngine1 = new FerrariEngine(2.9, 8, 3.9, "Ferrari_2");
        FerrariEngine ferrariEngine2 = new FerrariEngine(2.8, 10, 4.2, "Ferrari_3");
        FerrariEngine ferrariEngine3 = new FerrariEngine(2.7, 12, 4.3, "Ferrari_4");
        FerrariEngine ferrariEngine4 = new FerrariEngine(2.6, 14, 4.4, "Ferrari_5");
        FerrariEngine ferrariEngine5 = new FerrariEngine(3.0, 16, 4.6, "Ferrari_6");
        FerrariEngine ferrariEngine6 = new FerrariEngine(3.1, 18, 4.7, "Ferrari_7");
        FerrariEngine ferrariEngine7 = new FerrariEngine(3.2, 20, 4.8, "Ferrari_8");
        FerrariEngine ferrariEngine8 = new FerrariEngine(3.3, 22, 4.9, "Ferrari_9");
        FerrariEngine ferrariEngine9 = new FerrariEngine(3.4, 24, 5.0, "Ferrari_10");

        RenaultEngine renaultEngine = new RenaultEngine();
        renaultEngine.setEngineVolume(1.1);
        renaultEngine.setCylinderAmount(2);
        renaultEngine.setEngineWeight(2.9);
        renaultEngine.setExtraTurboEnergy(10.1);
        renaultEngine.setNameCar("Renault_1");


        RenaultEngine renaultEngine1 = new RenaultEngine(1.2, 4, 3.0, 10.2, "Renault_2");
        RenaultEngine renaultEngine2 = new RenaultEngine(1.3, 6, 3.1, 10.3, "Renault_3");
        RenaultEngine renaultEngine3 = new RenaultEngine(1.4, 8, 3.2, 10.4, "Renault_4");
        RenaultEngine renaultEngine4 = new RenaultEngine(1.5, 10, 3.3, 10.4, "Renault_5");
        RenaultEngine renaultEngine5 = new RenaultEngine(1.6, 12, 3.4, 10.5, "Renault_6");
        RenaultEngine renaultEngine6 = new RenaultEngine(1.7, 14, 3.5, 10.6, "Renault_7");
        RenaultEngine renaultEngine7 = new RenaultEngine(1.8, 16, 3.6, 10.7, "Renault_8");
        RenaultEngine renaultEngine8 = new RenaultEngine(1.9, 16, 3.7, 10.7, "Renault_9");
        RenaultEngine renaultEngine9 = new RenaultEngine(2.0, 16, 3.8, 10.8, "Renault_10");

        Engine[] engines = {ferrariEngine5, ferrariEngine6, ferrariEngine7, ferrariEngine8, ferrariEngine9, ferrariEngine,
                ferrariEngine4,ferrariEngine3,ferrariEngine2,ferrariEngine1, renaultEngine9, renaultEngine8,renaultEngine7,
                renaultEngine6,renaultEngine5, renaultEngine,renaultEngine1,renaultEngine2,renaultEngine3,renaultEngine4};

//        for (int i=0; i<engines.length; i++){
//            if(engines[i] instanceof FerrariEngine){
//                System.out.println(engines[i].getNameCar()+": "+engines[i].getMaxSpeed());
//            }
//        }
//        for (int i=0; i< engines.length; i++){
//            if(engines[i] instanceof RenaultEngine){
//                System.out.println(engines[i].getNameCar()+": "+engines[i].getMaxSpeed());
//            }
//        }


        for (int i=0; i< engines.length-1; i++){
            for(int j=0; j< engines.length-i-1; j++){
                if(engines[j].getNameCar().compareTo(engines[j+1].getNameCar())>0){
                    Engine temp = engines[j];
                    engines[j] = engines[j+1];
                    engines[j+1] = temp;
                }
            }
        }

        for (int i=0; i< engines.length; i++){
            System.out.println(engines[i].getNameCar()+": "+engines[i].getMaxSpeed());
        }
    }
}
