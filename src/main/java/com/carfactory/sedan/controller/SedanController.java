package com.carfactory.sedan.controller;

import com.carfactory.sedan.service.*;
import com.carfactory.car.controller.CarController;
import com.carfactory.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sedan")
@CrossOrigin(origins = "*")
public class SedanController extends CarController {

    @Autowired
    SedanService sedanService;

    @Override
    public CarService getService() {
        return sedanService ;
    }
}
