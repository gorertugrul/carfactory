package com.carfactory;

import com.carfactory.cabrio.controller.CabrioController;
import com.carfactory.hatchback.cotroller.HatchbackController;
import com.carfactory.sedan.controller.SedanController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ContextConfiguration
@AutoConfigureMockMvc
public class CarControllerTest {

    @Autowired
    private CabrioController cabrioController;

    @Autowired
    private SedanController sedanController;

    @Autowired
    private HatchbackController hatchbackController;


    @Test
    public void when_produceCabrio_should_returnCabrioMessage() {
        ResponseEntity<String> result = cabrioController.produce();
        assertEquals("OK", result.getStatusCode().name());
        assertTrue(result.getBody().startsWith("Cabrio"));
    }

    @Test
    public void when_produceSedan_should_returnSedanMessage() {
        ResponseEntity<String> result = sedanController.produce();
        assertEquals("OK", result.getStatusCode().name());
        assertTrue(result.getBody().startsWith("Sedan"));
    }


    @Test
    public void when_produceHatchback_should_returnHatchbackMessage() {
        ResponseEntity<String> result = hatchbackController.produce();
        assertEquals("OK", result.getStatusCode().name());
        assertTrue(result.getBody().startsWith("Hatchback"));
    }

}
