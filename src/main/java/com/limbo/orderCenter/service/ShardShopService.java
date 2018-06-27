package com.limbo.orderCenter.service;

import com.limbo.orderCenter.entity.ShardShop;

import java.util.List;

/**
 * Created by Administrator on 2018/4/1 0001.
 * 这样,作为商户维度查询的时候,先根据商户的ID mod 64 找到 维度索引表,获取该商户的订单信息
 select * from shard_shop_1 where shopid=? and state=2 order by ts limit 300,10;
 */
public interface ShardShopService {
    /**
     * 根据Id查询
     * @param shardShop
     * @return
     * @throws Exception
     */
    List<ShardShop> findById(ShardShop shardShop)throws Exception;

    /**
     * 新增
     * @param shardShop
     * @return
     * @throws Exception
     */
    int insert(ShardShop shardShop)throws Exception;

    /**
     * 更新维度索引
     * @param shardShop
     * @return
     */
    int updateShardShop(ShardShop shardShop);
}
