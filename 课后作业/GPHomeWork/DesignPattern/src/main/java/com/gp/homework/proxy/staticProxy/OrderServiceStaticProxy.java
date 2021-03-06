package com.gp.homework.proxy.staticProxy;

import com.gp.homework.proxy.common.IOrderService;
import com.gp.homework.proxy.common.Order;
import com.gp.homework.proxy.common.db.DynamicDataSourceEntity;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tom on 2019/3/10.
 */
public class OrderServiceStaticProxy implements IOrderService {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;
    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    public int createOrder(Order order) {
//----------------绽放代理的色彩------------------
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" +  dbRouter + "】数据源处理数据" );
        DynamicDataSourceEntity.set(dbRouter);
//------------------------------------------------
        this.orderService.createOrder(order);
        DynamicDataSourceEntity.restore();

        return 0;
    }
}
