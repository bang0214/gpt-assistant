package com.cn.bdth.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 雨纷纷旧故里草木深
 *
 * 
 * @version 1.0
 */
@Data
@Accessors(chain = true)
public class EmailLoginDto {

    @NotBlank(message = "邮箱不能为空")
    private String email;

    @Size(min = 1, max = 20, message = "登陆密码格式错误")
    private String password;

}
