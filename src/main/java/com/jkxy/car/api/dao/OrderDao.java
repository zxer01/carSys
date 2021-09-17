package com.jkxy.car.api.dao;

import com.jkxy.car.api.pojo.Car;
import com.jkxy.car.api.pojo.CarOrders;
import com.jkxy.car.api.pojo.CarOrdersDetails;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface OrderDao {
    @Select("select max(id) from car_orders")
    int getLastedId();

    @Select("select max(id) from car_orders_details")
    int getDetailLastedId();

    @Insert("insert into car_orders(id,number,price,userid) values(#{id},#{number},#{price},#{userid})")
    void order(CarOrders carOrders);

    @Insert("insert into car_orders_details(id,goods_name,num,produce,price,order_id) values(#{id},#{goods_name},#{num},#{produce},#{price},#{orderId})")
    void orderDetail(CarOrdersDetails CarOrdersDetails);


}
