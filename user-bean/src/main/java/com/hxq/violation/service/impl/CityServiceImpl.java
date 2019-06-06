/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CityServiceImpl
 * Author:   hxq
 * Date:     2019/5/23 11:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.violation.service.impl;

import com.hxq.violation.bean.City;
import com.hxq.violation.service.CityService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hxq
 * @create 2019/5/23
 * @since 1.0.0
 */
@Service
public class CityServiceImpl implements CityService {

    @Override
    public ArrayList<City> findAllCity() {
        City c1=new City();
        City c2=new City();
        City c3=new City();

        c1.setName("北京");
        c2.setName("上海");
        c3.setName("广州");

        ArrayList<City> cities=new ArrayList<City>();
        cities.add(c1);
        cities.add(c2);
        cities.add(c3);

        return cities;
    }
}
