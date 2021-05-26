package com.google.chrome.tools.model.mall;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
public class BrokerMessageLog implements Serializable {
    private String messageId;

    private String message;

    private Integer tryCount;

    private String status;

    private Date nextRetry;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}