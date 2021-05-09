package com.carfactory.hatchback.service;

import com.carfactory.car.model.Car;
import com.carfactory.car.service.CarService;
import com.carfactory.hatchback.repository.HatchbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HatchbackService extends CarService {

    @Autowired
    HatchbackRepository repository;

    @Override
    public Car produce() {
        return repository.produce();
    }
}
