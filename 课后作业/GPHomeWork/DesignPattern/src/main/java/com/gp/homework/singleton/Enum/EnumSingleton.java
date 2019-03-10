package com.gp.homework.singleton.Enum;

/**
 * @ProjectName: GPHomeWork
 * @Package: com.gp.homework.singleton.Enum
 * @ClassName: EnumSingleton
 * @Author: Administrator
 * @Description: 枚举单例,1、不需要考虑线程问题，因为枚举式创建类的时候进行实例的
 * 2、不需要考虑反射和序列化问题，因为jdk已经做好优化
 * @Date: 2019/3/10 14:01
 * @Version: 1.0
 */
public enum EnumSingleton {
    INSTACNE;
    public EnumSingleton getInstacne(){
        return INSTACNE;
    }

}
