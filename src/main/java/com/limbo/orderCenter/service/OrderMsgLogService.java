package com.limbo.orderCenter.service;

import com.limbo.orderCenter.entity.OrderMsgLog;

import java.util.List;

/**
 * Created by Administrator on 2018/4/1 0001.
 */
public interface OrderMsgLogService {

    /**
     * 根据Id查询
     * @param orderMsgLog
     * @return
     * @throws Exception
     */
    List<OrderMsgLog> findById(OrderMsgLog orderMsgLog)throws Exception;

    /**
     * 新增
     * @param orderMsgLog
     * @return
     * @throws Exception
     */
    int insert(OrderMsgLog orderMsgLog)throws Exception;

    /**
     * 更新订单日志
     * @param orderMsgLog
     * @return
     */
    int updateOrderMsgLog(OrderMsgLog orderMsgLog);
}
