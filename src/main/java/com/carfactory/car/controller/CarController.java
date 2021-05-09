package com.carfactory.car.controller;

import com.carfactory.car.model.Car;
import com.carfactory.car.model.Messages;
import com.carfactory.car.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public abstract class CarController {
    public abstract CarService getService();

    @PostMapping(path = "/produce")
    public ResponseEntity<String> produce() {
        System.out.println();
        try {
            Car producedCar = getService().produce();
            return new ResponseEntity<>(getMessage(producedCar), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(getErrorMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private String getMessage(Car producedCar) {
        return String.format("%s %s", producedCar.getType(), Messages.CAR_PRODUCE_MESSAGE);
    }

    private String getErrorMessage() {
        return Messages.CAR_PRODUCE_ERROR_MESSAGE;
    }

}
