package com.limbo.orderCenter.service.impl;

import com.limbo.orderCenter.entity.Order;
import com.limbo.orderCenter.mapper.OrderMapper;
import com.limbo.orderCenter.service.OrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * Created by Administrator on 2018/1/5 0005.
 */
public class OrderServiceImpl implements OrderService{
    Logger logger = Logger.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> queryOrderByInfo(Order order) {
        return orderMapper.queryOrderByInfo(order);
    }

    @Override
    public int insertOrder(Order order) {
        return orderMapper.insertOrder(order);
    }

    @Override
    public int updateOrder(Order order) {
        return orderMapper.updateOrder(order);
    }

    protected String buildOrderId(){
        String orderId = new String();
        
        return orderId;
    }
}
