package com.limbo.orderCenter.mapper;

import com.limbo.orderCenter.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/12/17 0017.
 */

@Repository
public interface GoodsMapper {
    /**
     * 根据条件查询商品信息
     * @return
     */
    List<Goods> queryGoodsByInfo(Goods goods);

    /**
     * 新增商品
     * @param goods
     * @return
     */
    int insertGoods(@Param("goods") Goods goods);

    int updateGoods(@Param("goods") Goods goods);
}
