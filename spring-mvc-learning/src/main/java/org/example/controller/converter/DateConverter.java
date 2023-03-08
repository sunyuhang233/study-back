package org.example.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Ahang
 * @version 1.0
 * @description 日期转换类型
 * @date 2023/3/7 22:31
 */
public class DateConverter implements Converter<String, Date> {
    private final String PATTERN = "yyyy-MM-dd HH:mm:ss";

    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            {
                throw new IllegalArgumentException("日期转换错误");
            }
        }
    }
}
