package org.test.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.test.dao.TestDao;
import org.test.entity.Seckill;
import org.test.service.SeckillService;

import javax.annotation.Resource;

/**
 * Created by OUC on 2016/12/10.
 */
@Service
public class SeckillServiceImpl implements SeckillService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());//注意日志
    @Resource
    private TestDao testDao;
    @Override
    public Seckill getById(long seckillId) {
        return testDao.queryById(seckillId);
    }
}
