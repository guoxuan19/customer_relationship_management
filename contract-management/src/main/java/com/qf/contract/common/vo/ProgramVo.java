package com.qf.contract.common.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
    * 项目表
    */
@Data
@TableName(value = "t_program00")
public class ProgramVo {
    /**
     * 项目id
     */
    @TableId(value = "program_id", type = IdType.INPUT)
    private Integer programId;

    /**
     * 项目名
     */
    @TableField(value = "program_name")
    private String programName;

    /**
     * 客户id
     */
    @TableField(value = "customer_id")
    private Integer customerId;

    private CustomerVo customerVo;//关联属性，客户

}