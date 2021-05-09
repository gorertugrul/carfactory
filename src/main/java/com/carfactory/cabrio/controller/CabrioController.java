package com.carfactory.cabrio.controller;


import com.carfactory.cabrio.service.CabrioService;
import com.carfactory.car.controller.CarController;
import com.carfactory.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cabrio")
@CrossOrigin(origins = "*")
public class CabrioController extends CarController {

    @Autowired
    CabrioService cabrioService;

    @Override
    public CarService getService() {
        return cabrioService;
    }
}
