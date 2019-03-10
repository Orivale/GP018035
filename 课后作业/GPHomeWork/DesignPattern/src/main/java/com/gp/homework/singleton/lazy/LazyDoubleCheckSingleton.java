package com.gp.homework.singleton.lazy;

/**
 * @ProjectName: GPHomeWork
 * @Package: com.gp.homework.singleton.lazy
 * @ClassName: LazyDoubleCheckSingleton
 * @Author: Administrator
 * @Description: 相对于LazySynchronizeSingleton，性能会有所提高，但存在指令重排序的问题
 * @Date: 2019/3/10 13:30
 * @Version: 1.0
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){}
    public static  LazyDoubleCheckSingleton getLazyDoubleCheckSingletonInstacne(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
