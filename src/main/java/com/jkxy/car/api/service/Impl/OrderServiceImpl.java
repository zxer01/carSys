package com.jkxy.car.api.service.Impl;

import com.jkxy.car.api.dao.CarDao;
import com.jkxy.car.api.dao.OrderDao;
import com.jkxy.car.api.pojo.Car;
import com.jkxy.car.api.pojo.CarOrders;
import com.jkxy.car.api.pojo.CarOrdersDetails;
import com.jkxy.car.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    @Transactional
    public void buyCar(Car car,int count,String userid) {
        CarOrders carOrders = new CarOrders();

        carOrders.setId(orderDao.getLastedId() + 1);
        carOrders.setNumber(System.currentTimeMillis()+"_"+userid);
        carOrders.setPrice(count * Integer.parseInt(car.getPrice()));
        carOrders.setUserid(userid);
        orderDao.order(carOrders);

        CarOrdersDetails carOrdersDetails = new CarOrdersDetails();
        carOrdersDetails.setId(orderDao.getDetailLastedId() + 1);
        carOrdersDetails.setOrderId(carOrders.getId());
        carOrdersDetails.setGoodsName(car.getCarName());
        carOrdersDetails.setNum(count);
        carOrdersDetails.setPrice(count * Integer.parseInt(car.getPrice()));
        carOrdersDetails.setProduce("北京");
        orderDao.orderDetail(carOrdersDetails);
    }


}
