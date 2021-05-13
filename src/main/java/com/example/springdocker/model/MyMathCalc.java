package com.example.springdocker.model;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-05-13
 * Time: 08:12
 * Project: springDockerDemo
 * Copyright: MIT
 */
public class MyMathCalc {
    private int num1, num2, result;
    private double doubleResult;



    public int add(int a, int b){

        return a+b;
    }

    public int multiply(int a, int b){

        return a * b;
    }


    public double divide(int a, int b){
        doubleResult = a / b;
        return doubleResult;
    }

    /*
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void add(){
        setResult(num1 + num2);
    }

    public void subtract(){
        setResult(num1 - num2);
    }

    public void multiply(){
        setResult(num1 * num2);
    }

    public void divide(){
        setResult((num1) / (num2));
    }
     */

}
