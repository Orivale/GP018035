package com.gp.homework.proxy.common;

/**
 * @ProjectName: GPHomeWork
 * @Package: com.gp.homework.proxy.common
 * @ClassName: OrderService
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2019/3/17 23:36
 * @Version: 1.0
 */
public class OrderService implements  IOrderService{

    private OrderDao orderDao;

    public OrderService() {
        orderDao = new OrderDao();
    }

    public int createOrder(Order order) {
        System.out.println("OrderService调用orderDao创建订单");
        return orderDao.insert(order);
    }
}
