package com.jhou.dubboImpl;

import com.jhou.dubbo_service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: huangdejie
 * @Date: 2018/8/31 0031 下午 2:31
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    public List<String> getString(String id) {
        List<String> list = new ArrayList<String>();
        list.add("id"+"******1");
        list.add("id"+"******2");
        list.add("id"+"******3");
        list.add("id"+"******4");
        list.add("id"+"******5");
        list.add("id"+"******6");
        return list;
    }

    public int queryCount() {
        return 300;
    }
}
