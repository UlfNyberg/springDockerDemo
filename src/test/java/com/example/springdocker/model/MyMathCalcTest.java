package com.example.springdocker.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-05-14
 * Time: 13:54
 * Project: springDockerDemo
 * Copyright: MIT
 */
class MyMathCalcTest {

    MyMathCalc calcy;

    @BeforeEach
    public void init(){
        calcy = new MyMathCalc();
    }

    @DisplayName("Test for Add")
    @Test
    void add() {
        int sum = calcy.add(2, 3);

        if (sum != 5){
            System.out.println("Test failed!");
        }
    }

    @DisplayName("Test for Multiply")
    @Test
    void multiply() {
        int sum = calcy.multiply(2, 3);

        if (sum != 6){
            System.out.println("Test failed!");
        }
    }

    @DisplayName("Test for Division")
    @Test
    void divide() {
        double sum = calcy.divide(10, 2);

        if (sum != 5){
            System.out.println("Test failed!");
        }
    }

    @DisplayName("Test for DivisionAssert")
    @Test
    void divide_throws() {

        assertThrows(ArithmeticException.class, () -> calcy.divide(10,0));

    }

}