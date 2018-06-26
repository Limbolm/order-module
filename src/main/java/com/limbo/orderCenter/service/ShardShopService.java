package com.limbo.orderCenter.service;

import com.limbo.orderCenter.entity.ShardShop;

import java.util.List;

/**
 * Created by Administrator on 2018/4/1 0001.
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
