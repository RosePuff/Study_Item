package com.ll.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @ClassName: IdUtils
 * @Description: TODO
 * @Author: LQH
 * @Date: 2020/07/07
 * @Version: 1.0
 **/
public class IdUtils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Test
    public void test() {
        System.out.println(IdUtils.getId());
    }
}
