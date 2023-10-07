package com.qf.commons.base.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.qf.commons.base.exception.EquipmentException;
import com.qf.commons.base.resp.ResponseStatus;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class PageUtils<T> {
    @JsonIgnore
    private List<T> allData;//所有的数据

    private Integer currentPage;//当前页

    private Integer pageSize;//页量

    private Integer dataCount;//总数据量

    private Integer pageCount;//总页数

    private List<T> data;//当前页的数据

    public void startPage(Integer currentPage,Integer pageSize,List<T> allData){
        this.allData = allData;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.dataCount = allData.size();
        List<T> list = new ArrayList<>();
        if (allData.size() <= pageSize && currentPage == 1){
            this.pageCount = 1;
            for (int i = 0; i < allData.size(); i++) {
                list.add(allData.get(i));
            }
        }
        if (allData.size() < pageSize && currentPage != 1){
            throw new EquipmentException(ResponseStatus.SYS_ERROR);
        }
        if (allData.size() > pageSize){
            this.pageCount = dataCount%pageSize == 0 ? dataCount/pageSize : dataCount/pageSize+1;
            if ((currentPage < pageCount) || (currentPage==pageCount && dataCount%pageSize == 0)){
                for (int i = (currentPage-1)*pageSize; i < (currentPage-1)*pageSize+pageSize; i++) {
                    list.add(allData.get(i));
                }
            }else if (currentPage == pageCount){
                for (int i = (currentPage-1)*pageSize; i < (currentPage-1)*pageSize+dataCount%pageSize; i++) {
                    list.add(allData.get(i));
                }
            }else {
                throw new EquipmentException(ResponseStatus.SYS_ERROR);
            }
        }
        this.data = list;
    }
}
