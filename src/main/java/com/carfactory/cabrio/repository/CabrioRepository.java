package com.carfactory.cabrio.repository;

import com.carfactory.cabrio.model.Cabrio;
import com.carfactory.car.model.Car;
import com.carfactory.car.repository.CarRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CabrioRepository extends CarRepository {

    @Override
    public Car produce() {
        return new Cabrio();
    }
}
