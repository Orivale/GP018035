package com.gp.homework.singleton.lazy;

/**
 * @ProjectName: GPHomeWork
 * @Package: com.gp.homework.singleton.lazy
 * @ClassName: LazySynchronizeSingleton
 * @Author: Administrator
 * @Description: 同步锁，可以解决线程安全问题，
 * @Date: 2019/3/10 12:08
 * @Version: 1.0
 */
public class LazySynchronizeSingleton {
    private static  LazySynchronizeSingleton lazySynchronizeSingleton =null;
    private LazySynchronizeSingleton(){
        if(lazySynchronizeSingleton !=null ){
            throw new RuntimeException("不能重复实例化");
        }
    }
    public synchronized static LazySynchronizeSingleton getLazySimpleSingletonInstance(){
        if(lazySynchronizeSingleton == null){
            lazySynchronizeSingleton = new LazySynchronizeSingleton();
        }
        return lazySynchronizeSingleton;
    }
}
