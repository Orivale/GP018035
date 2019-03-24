package com.gp.homework.prototype;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @ProjectName: GPHomeWork
 * @Package: com.gp.homework.prototype
 * @ClassName: Order
 * @Author: Administrator
 * @Description: 数据库
 * @Date: 2019/3/17 17:40
 * @Version: 1.0
 */
public abstract class DataBaseData implements Prototype,Serializable{
    //通过反射来进行浅复制,浅复制规则：对可更改的属性进行复制：int age -> setAge(int age)
    public Object simpleClone() {
        try {
            Class clazz = this.getClass();
            Field[] fields = clazz.getDeclaredFields();
            Object newInstance = clazz.newInstance();
            for(Method method : clazz.getMethods()){
                if(method.getName().startsWith("set")){
                    String paramName = method.getName().replace("set","");
                    for(Field field : fields){
                        if(field.getName().equalsIgnoreCase(paramName)){
                            field.setAccessible(true);
                            method.invoke(newInstance,field.get(this));
                        }
                    }
                }
            }
            return newInstance;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //通过流来进行深度复制
    public Object deepClone() {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream obs = new ObjectOutputStream(out);
            obs.writeObject(this);
            obs.close();
            ByteArrayInputStream ios = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(ios);
            Object cloenObj = ois.readObject();
            ois.close();
            return cloenObj;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
