package com.jhou.testService;

import com.jhou.dubbo_service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: huangdejie
 * @Date: 2018/8/31 0031 下午 2:46
 */
public class TestService {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        context.start();
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.getString("nihao").size());
        try {
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
