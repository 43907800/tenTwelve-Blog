package com.tentwelve.framework.exception;

import com.tentwelve.framework.model.response.ResultCode;

/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/23 10:56 上午
 * @Description:
 */
public class ExceptionCast {

    public static void cast(ResultCode resultCode){
        throw new CustomException(resultCode);
    }
}
