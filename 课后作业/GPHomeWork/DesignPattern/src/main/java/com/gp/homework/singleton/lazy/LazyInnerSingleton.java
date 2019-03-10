package com.gp.homework.singleton.lazy;

/**
 * @ProjectName: GPHomeWork
 * @Package: com.gp.homework.singleton.lazy
 * @ClassName: LazyInnerSingleton
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2019/3/10 13:47
 * @Version: 1.0
 */
public class LazyInnerSingleton {
    public static LazyInnerSingleton getLazyInnerSingletonInstance(){
        return LazyHolder.lazyInnerSingleton;
    }
    private static class LazyHolder{
        private static final LazyInnerSingleton lazyInnerSingleton = new LazyInnerSingleton();
    }
}
