package com.carfactory.car.service;

import com.carfactory.car.model.Car;
import org.springframework.stereotype.Service;

@Service
public abstract class CarService {

    public abstract Car produce();

}
