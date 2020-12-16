package com.abner.service.impl;

import com.abner.service.OrderService;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/20 17:13
 * @Description:
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public int saveOrder() {
        System.out.println("下单成功，订单号： 888888");
        return 888888;
    }
}
