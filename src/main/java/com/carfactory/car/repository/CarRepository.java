package com.carfactory.car.repository;

import com.carfactory.car.model.Car;
import org.springframework.stereotype.Repository;

@Repository
public abstract class CarRepository {
    public abstract Car produce();
}
