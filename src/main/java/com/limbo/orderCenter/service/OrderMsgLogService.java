package com.limbo.orderCenter.service;

import com.limbo.orderCenter.entity.OrderMsgLog;

import java.util.List;

/**
 * Created by Administrator on 2018/4/1 0001.
 * 作为用户维度,
 先根据用户ID mod 64 找到最终落地的数据库,查询那个数据库的消息表msg_log,在用户维度,是否存在这个事务ID,如果存在,则不予处理.
 (select count(*) from msg_log_XX where shardKey='订单创建:用户维度' and tran_id=?)
 如果不存在,则开启一个事务
 插入订单表,我觉得可以用tran_id直接作为订单的ID,
 并且插入消息表 insert msg_log_XX(tran_id,shardKey) values(?,'订单创建:用户维度');
 提交事务,commit.

 作为商户维度,
 则根据商户ID mod 64 找到最终的数据库,和用户维度的数据库,可能不是同一台服务器.
 同样,也是先查询落地数据库的消息表,
 (select count(*) from msg_log_XXX where shardKey='订单创建:商户维度' and tran_id=?)
 如果不存在记录,则开启事务,
 插入维度索引表,
 insert into shard_shop_XXX（shopid,ts,state,dbid,orderid) values(......)
 shopid,ts,state 商户ID,订单时间,订单状态都是根据订单的原始信息.
 dbid 指的是 根据用户维度(主维度),订单数据所在的数据库ID,
 orderid 指的是 在用户维度(主维度),订单表的主键.

 插入消息表,insert msg_log_XX(tran_id,shardKey) values(?,'订单创建:商户维度');
 最后提交.
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
