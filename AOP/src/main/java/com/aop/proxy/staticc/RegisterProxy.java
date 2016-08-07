package com.aop.proxy.staticc;

import com.aop.service.Register;
import org.apache.log4j.Logger;


/**
 * Created by HengLuwen on 2016-8-7.
 */
public class RegisterProxy {

    Logger logger = Logger.getLogger(this.getClass().getName());

    private Register register;

    public RegisterProxy(Register register){
        this.register = register;
    }

    public void register(String name){
        this.doBefore();
        register.register(name);
        this.doAfter();
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
