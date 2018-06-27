package com.limbo.orderCenter.service;

import com.limbo.orderCenter.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/1/5 0005.
 * 每隔一段时间,由后台程序,查看 tran_log和msg_log,如果发现有缺失的数据,则进行事务补偿.

 扩展的时候,则新增维度索引表即可.

 因为所有的表,都是按月的分区表,可以将过去的冷数据,在一个服务器集中存放,这个实例就同时存放64个数据库.毕竟都是冷数据,访问量很小.
 */
public interface OrderService {
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
    int insertOrder(Order order);

    int updateOrder(Order order);
}
