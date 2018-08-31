package com.jhou.dubbo_service;

import java.util.List;

/**
 * @Author: huangdejie
 * @Date: 2018/8/31 0031 下午 2:29
 */
public interface UserService {

    /**
     * 获取
     * @param id
     * @return
     */
    List<String> getString(String id);

    int queryCount();

}
