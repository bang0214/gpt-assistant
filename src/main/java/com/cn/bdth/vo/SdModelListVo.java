package com.cn.bdth.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 *
 * @version 1.0
 */
@Data
@Accessors(chain = true)
public class SdModelListVo implements Serializable {

    private String modelName;

    private String textName;

}
