package com.yupi.yuoj.model.dto.question;

import lombok.Data;

/**
 * 题目配置
 */
@Data
public class JudgeConfig {
    /**
     * 时间限制(ms)
     */
    private String timeLimit;
    /**
     * 内存限制(KB)
     */
    private String memoryLimit;

    /**
     * 堆栈限制(KB)
     */
    private Long stackLimit;
}
