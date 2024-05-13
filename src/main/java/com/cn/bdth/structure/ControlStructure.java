
package com.cn.bdth.structure;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * BOT配置类
 *
 *
 * @version 1.0
 */
@Data
@Accessors(chain = true)
public class ControlStructure {

    private String proxyIp;

    private Integer proxyPort;

    private String wechatAppEnv;

    private String sensitiveWords;

    private Boolean enableSensitive;

    private Boolean enableGptPlus;

    private Boolean enableWechatAppMain;

    private Boolean enableProxy;

}
