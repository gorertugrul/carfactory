package com.carfactory.hatchback.repository;

import com.carfactory.car.model.Car;
import com.carfactory.car.repository.CarRepository;
import com.carfactory.hatchback.model.Hatchback;
import org.springframework.stereotype.Repository;

@Repository
public class HatchbackRepository  extends CarRepository {
    @Override
    public Car produce() {
        return new Hatchback();
    }
}
