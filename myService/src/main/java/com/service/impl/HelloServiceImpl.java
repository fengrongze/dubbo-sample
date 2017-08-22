package com.service.impl;

import com.service.HelloService;

/**
 * Created by fengrongze on 2017/8/15.
 */
public class HelloServiceImpl implements HelloService {
    public String speakHello(String name) {
        System.out.println("yes, i am!");
      /*  try {
            Thread.sleep(90);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "你好：" + name;
    }
}
