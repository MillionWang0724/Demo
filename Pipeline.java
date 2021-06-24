/*
 * Copyright (c) 2014-2019 Huami, Inc. All Rights Reserved.
 */

package com.huami.effective.mybatis.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class Pipeline implements Serializable {
    /**
     * gitlab项目id
     */
    private Integer projectId;

    /**
     * gitlab merge request id
     */
    private Integer mergeIid;

    /**
     * pipeline 执行状态，success failed cancel等
     */
    private String pipelineStatus;

    /**
     * pipeline 创建时间
     */
    private String pipelineCreatetime;

    /**
     * pipeline 开始时间
     */
    private String pipelineStarttime;

    /**
     * pipeline 结束时间
     */
    private String pipelineEndtime;

    /**
     * pipeline 类型 CI CD other
     */
    private String pipelineType;

    /**
     * 开发者名称
     */
    private String developerName;

    /**
     * 微服务名称
     */
    private String serviceName;

    /**
     * pipeline 执行耗时
     */
    private Double pipelineDuration;

    /**
     * 新代码覆盖率
     */
    private Double newCodeCoverage;

    /**
     * 新代码分支覆盖率
     */
    private Double newBranchCoverage;

    /**
     * jira issue id
     */
    private String jiraIssue;

    /**
     * 扩展字段1
     */
    private String extendedFiled1;

    /**
     * 扩展字段2
     */
    private String extendedFiled2;

    /**
     * 扩展字段3
     */
    private String extendedFiled3;

    /**
     * 扩展字段4
     */
    private String extendedFiled4;

    /**
     * 扩展字段5
     */
    private String extendedFiled5;

    /**
     * 扩展字段6
     */
    private String extendedFiled6;

    private static final long serialVersionUID = 1L;
}
