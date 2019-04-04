package com.yhr.dubbo.one.server.controller;

import com.yhr.dubbo.one.api.enums.StatusCode;
import com.yhr.dubbo.one.api.response.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: dubboOne
 * @BelongsPackage: com.yhr.dubbo.one.server.controller
 * @Author: yang
 * @CreateTime: 2019-04-04 09:24
 * @Description: ${Description}
 */

@RestController
public class BaseController {

    private static final Logger log= LoggerFactory.getLogger(BaseController.class);

    private static final String prefix = "base";

    /**
     * 测试
     * @param param
     * @return
     */
    @RequestMapping(value = prefix+"/one",method = RequestMethod.GET)
    public BaseResponse one(@RequestParam String param){
        BaseResponse response=new BaseResponse(StatusCode.Success);
        try {
            response.setData(param);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponse((StatusCode.Fail));
        }
        return  response;

    }
}
