package com.jkxy.car.api.service;

import com.jkxy.car.api.pojo.Car;

import java.util.List;


public interface CarService {

    List<Car> findAll();

    Car findById(int id);

    List<Car> findByCarName(String carName);

    void deleteById(int id);

    void updateById(Car car);

    void insertCar(Car car);

    /**购买车辆*/
    List<Car> buyCar(Car car,int count);

    /**分页查询*/
    List<Car> findCarBySplitPage(int currentPage,int pageSize);
}
