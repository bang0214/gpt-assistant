package com.cn.bdth.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 雨纷纷旧故里草木深
 *
 *
 * @version 1.0
 */
@Data
@Accessors(chain = true)
public class DrawingTaskVo implements Serializable {

    private Long drawingId;

    private Long location;


}
