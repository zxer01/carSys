package com.jkxy.car.api.service;

import com.jkxy.car.api.pojo.Car;


public interface OrderService {
    /**购买车辆*/
    void buyCar(Car car, int count, String userid);
}
