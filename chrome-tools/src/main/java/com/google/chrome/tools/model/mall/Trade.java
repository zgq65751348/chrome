package com.google.chrome.tools.model.mall;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Trade implements Serializable {
    private Long id;

    @ApiModelProperty(value = "商品id")
    private Long commodityId;

    @ApiModelProperty(value = "状态 0：未支付  1：已支付 2：待退款 3：已完成")
    private Integer states;

    @ApiModelProperty(value = "添加时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}