package com.maple.system.api.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author maple
 * @since 2019-08-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Microservices对象", description = "微服务备案")
public class MicroservicesVo {

    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "微服务名称")
    private String serviceName;

    @ApiModelProperty(value = "微服务部署机器ip")
    private String serviceIp;

    @ApiModelProperty(value = "微服务端口号")
    private String servicePort;

    @ApiModelProperty(value = "是否启动")
    private Integer isStart;

    @ApiModelProperty(value = "使用状态（0：未使用  1：已使用）")
    private Integer status;

    @ApiModelProperty(value = "是否默认创建config配置信息")
    private Integer isCreateConfig;

    @ApiModelProperty(value = "是否使用数据库")
    private Integer isUseMysql;

    @ApiModelProperty(value = "是否使用redis")
    private Integer isUseRedis;

    @ApiModelProperty(value = "是否使用Rabbitmq")
    private Integer isUseRabbitmq;

    @ApiModelProperty(value = "mysql信息")
    private Integer mysqlInfo;

    @ApiModelProperty(value = "redis信息")
    private Integer redisInfo;

    @ApiModelProperty(value = "rabbitmq信息")
    private Integer rabbitmqInfo;

    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    @ApiModelProperty(value = "修改时间")
    private Date modifyDate;

    @ApiModelProperty(value = "创建人")
    private Integer createId;

    @ApiModelProperty(value = "修改人")
    private Integer modifyId;

    @ApiModelProperty(value = "备注")
    private String remark;

}
