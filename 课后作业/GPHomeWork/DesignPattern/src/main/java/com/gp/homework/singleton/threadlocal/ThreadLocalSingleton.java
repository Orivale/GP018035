package com.gp.homework.singleton.threadlocal;

/**
 * @ProjectName: GPHomeWork
 * @Package: com.gp.homework.singleton.threadlocal
 * @ClassName: ThreadLocalSingleton
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2019/3/10 16:06
 * @Version: 1.0
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return super.initialValue();
                }
            };
    public ThreadLocalSingleton getThreadLocalSingletonInstance(){
        return threadLocalInstance.get();
    }
}
