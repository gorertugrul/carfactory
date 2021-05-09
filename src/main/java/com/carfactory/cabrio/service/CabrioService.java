package com.carfactory.cabrio.service;

import com.carfactory.cabrio.repository.CabrioRepository;
import com.carfactory.car.service.CarService;
import com.carfactory.car.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabrioService extends CarService {
    @Autowired
    CabrioRepository repository;

    @Override
    public Car produce() {
        return repository.produce();
    }
}
