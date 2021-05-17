package com.example.springdocker.repository;

import com.example.springdocker.model.Car;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-05-14
 * Time: 14:34
 * Project: springDockerDemo
 * Copyright: MIT
 */
@DataMongoTest
class CarRepositoryTest {

    //@Mock
    @Autowired
    CarRepository carRepository;

    List<Car> actual;

    @DisplayName("Test if CarObject by added by Drivable")
    @Test
    void findCarsByCanIDriveIt() {
        String expectedId = "1";
        String expectedName = "Delorean";
        Boolean expectedStylish = true;
        Boolean expectedDriveable = true;

        Car newCar1 = new Car();
        newCar1.setId(expectedId);
        newCar1.setName(expectedName);
        newCar1.setStylish(expectedStylish);
        newCar1.setCanIDriveIt(expectedDriveable);

        carRepository.save(newCar1);

        if(expectedDriveable) {
            actual = carRepository.findCarsByCanIDriveIt(expectedDriveable);
        };
        System.out.println(actual);
        //assertEquals(newCar1, actual);
        assertTrue(actual.contains(newCar1));

    }

}