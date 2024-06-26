package com.cn.bdth.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 添加文生图
 *
 * 
 * @version 1.0
 */
@Data
@Accessors(chain = true)
@SuppressWarnings("all")
public class DrawingSdDto {

   @NotBlank(message = "模型值不能为空")
   private String modelName;

   @NotBlank(message = "模型名称不能为空")
   private String textName;

}
