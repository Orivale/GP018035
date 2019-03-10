package test.testmain;

import com.gp.homework.singleton.lazy.LazyDoubleCheckSingleton;
import com.gp.homework.singleton.lazy.LazyInnerSingleton;
import com.gp.homework.singleton.lazy.LazySimpleSingleton;
import com.gp.homework.singleton.lazy.LazySynchronizeSingleton;

import java.lang.reflect.Constructor;

/**
 * @ProjectName: GPHomeWork
 * @Package: java
 * @ClassName: LazySimpleSingletonTest
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2019/3/10 11:57
 * @Version: 1.0
 */
public class LazySingletonTest {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(LazyDoubleCheckSingleton.getLazyDoubleCheckSingletonInstacne());
//            }
//        };
//        Thread t1 = new Thread(runnable);
//        Thread t2 = new Thread(runnable);
//        t1.start();
//        t2.start();
//        System.out.println("end");
        try {
            Class<?> clazz = LazyDoubleCheckSingleton.class;
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            System.out.println(constructor.newInstance());
            System.out.println(LazyDoubleCheckSingleton.getLazyDoubleCheckSingletonInstacne());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
