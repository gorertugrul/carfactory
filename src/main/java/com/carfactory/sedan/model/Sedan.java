package com.carfactory.sedan.model;

import com.carfactory.car.model.Car;
import com.carfactory.car.model.CarType;

public class Sedan implements Car {
    @Override
    public String getType() {
        return CarType.SEDAN.getType();
    }
}
