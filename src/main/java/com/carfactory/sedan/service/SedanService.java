package com.carfactory.sedan.service;

import com.carfactory.car.model.Car;
import com.carfactory.car.service.CarService;
import com.carfactory.sedan.repository.SedanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SedanService extends CarService {

    @Autowired
    SedanRepository repository;

    @Override
    public Car produce() {
        return repository.produce();
    }
}
