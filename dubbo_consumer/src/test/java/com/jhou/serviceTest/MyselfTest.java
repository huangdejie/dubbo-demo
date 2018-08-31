package com.jhou.serviceTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: huangdejie
 * @Date: 2018/8/31 0031 下午 3:46
 */
public class MyselfTest {

    @Test
    public void testA(){
        List<String> list = new ArrayList<String>();
        list.add("nihao");
        list.add("hellp");
        list.add("world");
        list.add("I");
        list.add("want");
        list.add("dream");
        for(int i = 0;i<list.size();++i){
            System.out.println(list.get(i));
        }
    }

}
