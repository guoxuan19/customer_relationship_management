package com.qf.common.utils;



import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MyBeanUtils extends BeanUtils {

    /**
     * 转换集合
     */
    public static <S, T> List<T> beanToList(List<S> source, Supplier<T> target) {
        return source.stream()
                .map(s -> copyBean(s, target))
                .collect(Collectors.toList());
    }

    /**
     * 转换对象
     */
    public static <S, T> T copyBean(S source, Supplier<T> target) {
        T t = target.get();
        copyProperties(source, t);
        return t;
    }

}
