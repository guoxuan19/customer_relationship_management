package com.qf.contract.common.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
    * 行业表
    */
@Data
@TableName(value = "t_industry")
public class IndustryVo {
    /**
     * 主键
     */
    @TableId(value = "industry_id", type = IdType.INPUT)
    private Integer industryId;

    /**
     * 行业名称
     */
    @TableField(value = "industry_name")
    private String industryName;


}