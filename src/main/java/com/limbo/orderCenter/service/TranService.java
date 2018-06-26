package com.limbo.orderCenter.service;

import com.limbo.orderCenter.entity.Tran;


import java.util.List;

/**
 * Created by Administrator on 2018/4/1 0001.
 */
public interface TranService {
    /**
     * 根据Id查询
     * @param tran
     * @return
     * @throws Exception
     */
    List<Tran> findByInfo(Tran tran)throws Exception;

    /**
     * 新增
     * @param tran
     * @return
     * @throws Exception
     */
    int insert(Tran tran)throws Exception;


    /**
     * 更新事务
     * @param tran
     * @return
     */
    int updateTran(Tran tran);
}
