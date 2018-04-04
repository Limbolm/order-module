package com.limbo.orderCenter.mapper;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.ibatis.annotations.Param;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户信息 mapper
 * @author  ray
 * @date 2017/11/19
 */
@Repository
public interface OrderMapper {
    /**
     * 根据条件查询订单信息
     * @return
     */
    List<Order> queryOrderByInfo(Order order);

    /**
     * 新增订单
     * @param order
     * @return
     */
    int insertOrder(@Param("order") Order order);

    int updateOrder(@Param("order") Order order);


}
