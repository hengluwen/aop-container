package com.aop.proxy.dynamic;

import org.apache.log4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by HengLuwen on 2016-8-7.
 */
public class LogHandler implements InvocationHandler{

    Logger logger = Logger.getLogger(this.getClass().getName());

    Object obj;

    public LogHandler(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        this.doBefore();
        Object o = method.invoke(obj,args);
        this.doAfter();
        return o;
    }

    public void doBefore(){
        System.out.println("doing something before ...");
        logger.debug(" 正在审核...");
    }

    public void doAfter(){
        System.out.println("doing something after...");
        logger.debug("注册完毕...");
    }

}
