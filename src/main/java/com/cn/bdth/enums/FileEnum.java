package com.cn.bdth.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 文件夹名
 *
 * 
 * @version 1.0
 */
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public enum FileEnum {

    //头像
    AVATAR("avatar"),
    //绘图
    PAINTING("painting"),
    //视频
    AUDIO("audio");
    String dec;

}
