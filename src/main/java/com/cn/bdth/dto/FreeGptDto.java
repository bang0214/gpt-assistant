package com.cn.bdth.dto;

import com.cn.bdth.model.GptModel;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 雨纷纷旧故里草木深
 *
 * 
 * @version 1.0
 */
@Data
@Accessors(chain = true)
public class FreeGptDto {


    @NotEmpty(message = "消息数据不能为空")
    private List<GptModel.Messages> messages;

}
