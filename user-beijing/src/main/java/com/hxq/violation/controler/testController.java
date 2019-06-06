/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: testController
 * Author:   hxq
 * Date:     2019/5/23 4:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.violation.controler;

import com.hxq.violation.bean.Carer;
import com.hxq.violation.service.CarerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hxq
 * @create 2019/5/23
 * @since 1.0.0
 */
@Controller
public class testController {

    @Autowired
    private CarerService carerService;
    @RequestMapping("/test")
    @ResponseBody
    public void test(){
        Carer carer=carerService.findCarerByIdPass(11111,"chebei");
        System.out.println(carer);
    }
}

