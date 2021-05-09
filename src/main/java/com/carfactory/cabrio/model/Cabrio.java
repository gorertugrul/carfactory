package com.carfactory.cabrio.model;

import com.carfactory.car.model.Car;
import com.carfactory.car.model.CarType;

public class Cabrio implements Car {
    @Override
    public String getType() {
        return CarType.CABRIO.getType();
    }
}
