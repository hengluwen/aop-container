package com.aop.service.impl;

import com.aop.service.Register;

/**
 * Created by HengLuwen on 2016-8-7.
 */
public class RegisterImpl implements Register{

    @Override
    public void register(String name) {
        System.out.println(name + " is registering...");
    }

}
