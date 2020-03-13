package com.nowcoder.community.util;

/**
 * 整个项目中需要使用到的常量
 */
public interface CommunityConstant {

    /**
     * 激活成功
     */
    int ACTIVE_SUCCESS = 0;

    /**
     * 重复激活
     */
    int ACTIVE_REPEAT = 1;

    /**
     * 激活失败
     */
    int ACTIVE_FAILURE = 2;

    /**
     * 默认状态的登录凭证的超时时间，单位是秒
     * 12个小时
     */
    int DEFAULT_EXPIRED_SECONDS = 3600 * 12 ;

    /**
     * 记住状态的登录凭证超时时间，单位是秒
     * 100天
     */
    int REMEMBER_EXPIRED_SECONDS = 3600 * 24 * 100;
}