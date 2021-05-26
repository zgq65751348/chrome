package com.google.chrome.tools.model.mall;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Processor implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "品牌")
    private String brand;

    @ApiModelProperty(value = "毛重")
    private Double grossWeight;

    @ApiModelProperty(value = "制作工艺")
    private String processTechnology;

    @ApiModelProperty(value = "产地")
    private String placeOfOrigin;

    @ApiModelProperty(value = "核心数量")
    private String coreQuantity;

    @ApiModelProperty(value = "适用场景")
    private String applicableScenarios;

    @ApiModelProperty(value = "接口")
    private String interfaces;

    @ApiModelProperty(value = "型号")
    private String model;

    @ApiModelProperty(value = "质保年限")
    private String warrantyPeriod;

    private String mainFrequency;

    @ApiModelProperty(value = "缓存")
    private String cache;

    @ApiModelProperty(value = "功率")
    private String power;

    private static final long serialVersionUID = 1L;
}