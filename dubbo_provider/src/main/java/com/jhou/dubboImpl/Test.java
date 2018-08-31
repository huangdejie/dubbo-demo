package com.jhou.dubboImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: huangdejie
 * @Date: 2018/8/31 0031 下午 2:37
 */
public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        context.start();
        System.out.println("************Dubbo Provider Start*************");
        try {
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
