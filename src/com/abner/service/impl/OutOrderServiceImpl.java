package com.abner.service.impl;

import com.abner.service.OrderService;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/20 17:14
 * @Description:
 */
public class OutOrderServiceImpl implements OrderService {
    @Override
    public int saveOrder() {
        System.out.println("下单成功，订单号： 666666");
        return 666666;
    }
}
