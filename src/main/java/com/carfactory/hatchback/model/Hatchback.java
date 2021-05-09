package com.carfactory.hatchback.model;

import com.carfactory.car.model.Car;
import com.carfactory.car.model.CarType;

public class Hatchback implements Car {
    @Override
    public String getType() {
        return CarType.HATCHBACK.getType();
    }
}
