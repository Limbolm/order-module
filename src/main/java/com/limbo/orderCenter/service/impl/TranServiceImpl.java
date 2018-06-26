package com.limbo.orderCenter.service.impl;

import com.limbo.orderCenter.entity.Tran;
import com.limbo.orderCenter.service.TranService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 事务表，订单生成前插入,插入后把事务记录进消息队列
 * Created by Administrator on 2018/4/1 0001.
 */
public class TranServiceImpl implements TranService{
    @Override
    public List<Tran> findByInfo(Tran tran) throws Exception {
        return null;
    }

    @Override
    public int insert(Tran tran) throws Exception {
        return 0;
    }

    public int updateTran(Tran tran){
        return 0;
    }

}
