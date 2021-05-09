package com.carfactory.hatchback.cotroller;

import com.carfactory.car.controller.CarController;
import com.carfactory.car.service.CarService;
import com.carfactory.hatchback.service.HatchbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hatchback")
@CrossOrigin(origins = "*")
public class HatchbackController extends CarController {

    @Autowired
    HatchbackService service;

    @Override
    public CarService getService() {
        return service;
    }
}
