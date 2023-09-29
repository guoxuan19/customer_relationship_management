package com.qf.common.utils;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    /**
     *将Page<po>  -->  转换为  Page<Vo>
     */
    public static <S,T> Page<T> copyList(Page<S> source, Page<T> page,Supplier<T> target){
        //第一步复制除了集合的其它属性
        copyProperties(source,page);
        //第二步复制集合
        List<T> list = beanToList(source.getRecords(), target);
        //第三步给目标vo对象赋值
        page.setRecords(list);
        return page;
    }

}
