package com.cn.bdth.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @version 1.0
 */
@Data
@Accessors(chain = true)
public class SdModelPageVo implements Serializable {

    private Long sdModelId;

    private String modelName;

    private String textName;

    private LocalDateTime createdTime;

}
