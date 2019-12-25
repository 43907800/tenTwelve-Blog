package com.tentwelve.framework.model.response;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/23 10:55 上午
 * @Description:
 */
@Data
@ToString
public class QueryResult<T> {
    //数据列表
    private List<T> list;
    //数据总数
    private long total;
}
