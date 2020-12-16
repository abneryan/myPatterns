package com.abner.structure.proxy;

import com.abner.service.OrderService;
import com.abner.service.impl.OutOrderServiceImpl;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/20 17:28
 * @Description:
 */
public class ProxyOrder implements OrderService {
    //真实的订单服务
    private OrderService orderService = new OutOrderServiceImpl();

    @Override
    public int saveOrder() {
        System.out.println("海外的订单走起！！！！");
        return orderService.saveOrder();
    }
}
