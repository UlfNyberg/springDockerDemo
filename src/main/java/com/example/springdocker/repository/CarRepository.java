package com.example.springdocker.repository;

import com.example.springdocker.model.Car;
import com.example.springdocker.model.Food;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-05-11
 * Time: 11:39
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@Repository
public interface CarRepository extends MongoRepository<Car, String> {
    List<Car> findCarsByCanIDriveIt(boolean canDrive);
}
