package com.limy.service.impl;

import com.limy.service.TestService;

/**
 * Created by limengyang on 2018/9/3.
 */
public class TestServiceImpl implements TestService{

    @Override
    public String sayHello(String str) {
        return "hello 欢迎"+str;
    }
}
