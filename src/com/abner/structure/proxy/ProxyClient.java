package com.abner.structure.proxy;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/20 17:59
 * @Description:
 */
public class ProxyClient {
    public static void main(String[] args) {
        ProxyOrder proxyOrder = new ProxyOrder();
        proxyOrder.saveOrder();
    }
}
