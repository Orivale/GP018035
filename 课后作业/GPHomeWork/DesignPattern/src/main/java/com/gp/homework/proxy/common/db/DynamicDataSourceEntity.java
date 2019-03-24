package com.gp.homework.proxy.common.db;

import javax.xml.bind.annotation.XmlType;

/**
 * @ProjectName: GPHomeWork
 * @Package: com.gp.homework.proxy.common.db
 * @ClassName: DynamicDataSourceEntity
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2019/3/17 23:42
 * @Version: 1.0
 */
public class DynamicDataSourceEntity {

    public final static String DEFAULT_SOURCE = null;

    private final static ThreadLocal<String> local  = new ThreadLocal<String>();

    private DynamicDataSourceEntity(){}

    public static String get(){
        return local.get();
    }

    public static void restore(){
        local.set(DEFAULT_SOURCE);
    }

    public static void set(String source){
        local.set(source);
    }

    public static void set(int year){
        local.set("DB_" + year);
    }
}
