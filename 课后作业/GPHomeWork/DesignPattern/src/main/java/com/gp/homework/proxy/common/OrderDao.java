package com.gp.homework.proxy.common;

/**
 * @ProjectName: GPHomeWork
 * @Package: com.gp.homework.proxy.common
 * @ClassName: OrderDao
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2019/3/17 23:55
 * @Version: 1.0
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}
