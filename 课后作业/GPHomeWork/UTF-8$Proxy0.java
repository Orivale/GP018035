package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy;
import com.gupaoedu.vip.pattern.proxy.Person;
import java.lang.reflect.*;
public class $Proxy0 implements com.gp.homework.proxy.common.IOrderService{
GPInvocationHandler h;
public $Proxy0(GPInvocationHandler h) { 
this.h = h;}
public int createOrder(com.gp.homework.proxy.common.Order order) {
try{
Method m = com.gp.homework.proxy.common.IOrderService.class.getMethod("createOrder",new Class[]{com.gp.homework.proxy.common.Order.class});
return ((java.lang.Integer)this.h.invoke(this,m,new Object[]{order})).intValue();
}catch(Error _ex) { }catch(Throwable e){
throw new UndeclaredThrowableException(e);
}return 0;}}
