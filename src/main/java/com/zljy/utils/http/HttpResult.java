package com.zljy.utils.http;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(description = "接口返回结果")
public class HttpResult<ResultType> {

    @ApiModelProperty("返回代码")
    private long code;

    @ApiModelProperty("返回信息")
    private String msg;

    @ApiModelProperty("错误消息")
    private String failedMsg;

    @ApiModelProperty("结果内容")
    private ResultType result;

}
