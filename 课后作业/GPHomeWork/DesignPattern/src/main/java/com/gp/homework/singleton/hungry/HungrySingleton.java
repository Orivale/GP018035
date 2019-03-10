package com.gp.homework.singleton.hungry;

/**
 * @ProjectName: GPHomeWork
 * @Package: com.gp.homework.singleton.hungry
 * @ClassName: HungrySingleton
 * @Author: Administrator
 * @Description: 饿汉式单例实现类
 * @Date: 2019/3/10 11:23
 * @Version: 1.0
 */
public class HungrySingleton {
    private HungrySingleton(){}
    private static final HungrySingleton hungrySingleton ;
//    类初始化的时候进行实例，没有线程安全问题
    static {
        hungrySingleton = new HungrySingleton();
    }
//    暴露获取实例对象的入口
    public HungrySingleton getHungrySingletonInstance(){
        return hungrySingleton;
    }
}
