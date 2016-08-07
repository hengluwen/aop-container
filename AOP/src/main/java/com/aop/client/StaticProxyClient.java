package com.aop.client;

import com.aop.proxy.staticc.RegisterProxy;
import com.aop.service.Register;
import com.aop.service.impl.RegisterImpl;

/**
 * Static proxy
 * Created by HengLuwen on 2016-8-7.
 */
public class StaticProxyClient {

    public static void main(String[] args){
        Register register = new RegisterImpl();
        RegisterProxy proxy = new RegisterProxy(register);
        proxy.register("zhang san");
    }
}
