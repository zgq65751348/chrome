package com.google.chrome.tools.model.legends;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Legends implements Serializable {
    private Long id;

    @ApiModelProperty(value = "称号")
    private String designation;

    @ApiModelProperty(value = "名字")
    private String name;

    @ApiModelProperty(value = "被动技能")
    private String passiveSkill;

    private String skillQ;

    private String skillW;

    private String skillE;

    private String skillR;

    @ApiModelProperty(value = "生命值")
    private Integer lifeValue;

    @ApiModelProperty(value = "伤害")
    private Integer hurt;

    @ApiModelProperty(value = "1.蓝  2.能量 3.怒气")
    private Byte energyType;

    @ApiModelProperty(value = "法力值")
    private Integer energyValue;

    @ApiModelProperty(value = "护甲")
    private Integer armor;

    @ApiModelProperty(value = "魔抗")
    private Integer magicResistance;

    @ApiModelProperty(value = "生命恢复")
    private Integer lifeRecovery;

    @ApiModelProperty(value = "移速")
    private Integer movingSpeed;

    @ApiModelProperty(value = "点劵")
    private Integer pointCoupon;

    private Integer gold;

    @ApiModelProperty(value = "头像")
    private String avatar;

    private static final long serialVersionUID = 1L;
}