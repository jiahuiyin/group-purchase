package cn.yinjiahui.group_purchase.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum SystemErrorType implements ErrorType {

    SUCCESS(0, "成功"),
    SYSTEM_ERROR(10001, "系统异常");

    private Integer code;

    private String msg;
}
