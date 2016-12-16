package org.test.service;

import org.test.entity.Seckill;

/**
 * 1.方法的粒度，不要过于关注方法的实现
 * 2.参数尽量简洁明了
 * 3.返回值类型
 * Created by OUC on 2016/12/10.
 */
public interface SeckillService {

    /**
     * 查询单个秒杀记录
     *
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);


}
