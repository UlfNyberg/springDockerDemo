package com.example.springdocker.service;

import com.example.springdocker.model.Car;
import com.example.springdocker.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-05-11
 * Time: 11:33
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@RequiredArgsConstructor
@Service
public class CarService {
    private final CarRepository repository;

    public List<Car> getCars() {
        return repository.findAll();
    }

    public void saveNewCar(Car car) {
        repository.save(car);
    }

    public List<String> getRunnableCars() {
        // hämtar alla Cars som vi kan köra
        List<Car> runnableCars = repository.findCarsByCanIDriveIt(true);

        // returnerar endast cars namnen i en lista
        return runnableCars.stream()
                .map(food -> food.getName())
                .collect(Collectors.toList());
    }
}
