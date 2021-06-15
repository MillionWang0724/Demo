package com.huami.effective.mybatis.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * log_info
 * @author 
 */
@Data
public class LogInfo implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 服务
     */
    private String service;

    /**
     * 单位字节
     */
    private Integer s3Size;

    /**
     * error数
     */
    private Integer esErrorCount;

    /**
     * info数
     */
    private Integer esInfoCount;

    /**
     * 总数
     */
    private Integer esCountCount;

    /**
     * warn数
     */
    private Integer esWarnCount;

    /**
     * 当天零点到该时间获取到的数据
     */
    private Date timestamp;

    private static final long serialVersionUID = 1L;
}
