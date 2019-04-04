package com.yhr.dubbo.one.api.service;

import com.yhr.dubbo.one.api.request.PushOrderDto;
import com.yhr.dubbo.one.api.response.BaseResponse;

/**
 * Created by Administrator on 2019/1/14.
 */
public interface IDubboRecordService {

    public BaseResponse pushOrder(PushOrderDto dto);

}
