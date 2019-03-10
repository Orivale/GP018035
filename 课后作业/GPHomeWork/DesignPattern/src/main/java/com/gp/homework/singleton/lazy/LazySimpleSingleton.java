package com.gp.homework.singleton.lazy;

/**
 * @ProjectName: GPHomeWork
 * @Package: com.gp.homework.singleton.lazy
 * @ClassName: LazySingleton
 * @Author: Administrator
 * @Description: 问题最多的简单懒汉式
 * @Date: 2019/3/10 11:51
 * @Version: 1.0
 */
public class LazySimpleSingleton {
    private static  LazySimpleSingleton lazySimpleSingleton =null;
    private LazySimpleSingleton(){}
    public static LazySimpleSingleton getLazySimpleSingletonInstance(){
        if(lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
