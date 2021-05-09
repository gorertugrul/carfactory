package com.carfactory.sedan.repository;

import com.carfactory.car.model.Car;
import com.carfactory.car.repository.CarRepository;
import com.carfactory.sedan.model.Sedan;
import org.springframework.stereotype.Repository;

@Repository
public class SedanRepository extends CarRepository {
    @Override
    public Car produce() {
        return new Sedan();
    }
}
