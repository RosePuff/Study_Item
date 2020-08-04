package com.chin.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @ClassName: JsonUtils
 * @Description: Json简单工具类
 * @Author: LQH
 * @Date: 2020/08/04
 * @Version: 1.0
 **/
public class JsonUtils {

    public static String getJson(Object o, String s) {
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(s);
        mapper.setDateFormat(simpleDateFormat);
        try {
            return mapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getJson(Object object) {
        return getJson(object, "yyyy-MM-dd HH:mm:ss");

    }
}
