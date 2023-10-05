package com.qf.business.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 产品表
    */
@Data
@TableName(value = "t_product")
public class Product {
    /**
     * id主键
     */
    @TableId(value = "product_id", type = IdType.INPUT)
    private Integer productId;

    /**
     * 产品SKU编号
     */
    @TableField(value = "product_skuId")
    private Long productSkuid;

    /**
     * 产品名称
     */
    @TableField(value = "product_name")
    private String productName;

    /**
     * 产品品牌
     */
    @TableField(value = "product_brand")
    private String productBrand;

    /**
     * 会员价
     */
    @TableField(value = "membership_price")
    private BigDecimal membershipPrice;

    /**
     * 批发价
     */
    @TableField(value = "wholesale_price")
    private BigDecimal wholesalePrice;

    /**
     * 产品型号
     */
    @TableField(value = "product_model")
    private String productModel;

    /**
     * 产品分类
     */
    @TableField(value = "product_level")
    private Integer productLevel;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 产品状态 0表示停用 1表示正常 
     */
    @TableField(value = "product_status")
    private Integer productStatus;

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_PRODUCT_SKUID = "product_skuId";

    public static final String COL_PRODUCT_NAME = "product_name";

    public static final String COL_PRODUCT_BRAND = "product_brand";

    public static final String COL_MEMBERSHIP_PRICE = "membership_price";

    public static final String COL_WHOLESALE_PRICE = "wholesale_price";

    public static final String COL_PRODUCT_MODEL = "product_model";

    public static final String COL_PRODUCT_LEVEL = "product_level";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_PRODUCT_STATUS = "product_status";
}