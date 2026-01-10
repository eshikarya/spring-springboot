package com.example.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Driver {

    @Autowired
//    @Qualifier("bike") --- when this line is commented we get Car Starts because car has @Primary Annotation.
//    So we see how qualifier is used when multiple beans of same type exist i.e. Car and Bike being implementations of the same interface Vehicle.
    private Vehicle defaultVehicle;


    public String driverVehicle(){
        return defaultVehicle.start();
//        System.out.println(vehicleCar.start());
//        System.out.println(vehicleBike.start());
    }

}
