package com.qf.business.common.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class ProductVo {
    /**
     * id主键
     */
    private Integer productId;

    /**
     * 产品SKU编号
     */
    private Long productSkuid;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品品牌
     */
    private String productBrand;

    /**
     * 会员价
     */
    private BigDecimal membershipPrice;

    /**
     * 批发价
     */
    private BigDecimal wholesalePrice;

    /**
     * 产品型号
     */
    private String productModel;

    /**
     * 产品分类
     */
    private Integer productLevel;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 产品状态 0表示停用 1表示正常
     */
    private Integer productStatus;
}

