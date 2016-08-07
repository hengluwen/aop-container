package com.aop.client;

import com.aop.proxy.dynamic.LogHandler;
import com.aop.service.Register;
import com.aop.service.impl.RegisterImpl;

import java.lang.reflect.Proxy;

/**
 * Dynamic proxy
 * Created by HengLuwen on 2016-8-7.
 */
public class DynamicProxyClient {

    public static void main(String[] args){
        Register register = new RegisterImpl();
        LogHandler lh = new LogHandler(register);
        //此处的三个参数意义 ： 第一个是定义代理类型的一个加载者。第二个是要被代理对象的实现的接口列表，第三个是代理处理器对象
        Register proxy = (Register)Proxy.newProxyInstance(register.getClass().getClassLoader(),register.getClass().getInterfaces(),lh);
        proxy.register("zhang san");
    }

}
