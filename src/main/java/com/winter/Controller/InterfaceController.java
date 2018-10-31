package com.winter.Controller;

import com.winter.utils.HttpClientUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class InterfaceController {

    /**
     * 调用第三方接口入口，可根据需求新建controller入口
     * @param sessionId
     * @param param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/trans", method = RequestMethod.POST)
    public String transInterface(String sessionId,String param){
        String url="http://localhost:1111/user/add"; // 调用第三方地址
        //组织参数
        Map paramMap=new HashMap();
        paramMap.put("userName","哈哈1");
        paramMap.put("password","123456");
        paramMap.put("phone","1234561234");
        return HttpClientUtil.sendHttpPost(url,paramMap);//在此选择map组织参数，util中有其他选择
    }

}
