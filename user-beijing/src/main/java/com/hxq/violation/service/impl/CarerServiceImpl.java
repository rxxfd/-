/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CarerServiceImpl
 * Author:   hxq
 * Date:     2019/5/21 22:54
 * Description: 车主的服务实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.violation.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hxq.violation.bean.Carer;
import com.hxq.violation.mapper.CarerMapper;
import com.hxq.violation.service.CarerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈车主的服务实现类〉
 *
 * @author hxq
 * @create 2019/5/21
 * @since 1.0.0
 */
@Service(group = "bJCarerService")
@Component
public class CarerServiceImpl implements CarerService {

    @Autowired
    private CarerMapper carerMapper;

    @Override
    public void insertCarer(Carer carer) {
        carerMapper.insertCarer(carer);
    }

    @Override
    public List<Carer> findAllCarers() {

        List<Carer> carers=carerMapper.findAllCarers();
        return carers;
    }

    @Override
    public Carer findCarerByIdPass(Integer id, String password) {
        Carer carer=carerMapper.findCarerByIdPass(id,password);
        return carer;
    }

    @Override
    public void deleteCarerById(Integer id) {
           carerMapper.deleteCarerById(id);
    }

    @Override
    public Carer findCarerByName(String name) {
        Carer carer=carerMapper.findCarerByName(name);
        return carer;
    }

    @Override
    public Carer findCarerByCarNumber(String carNumber) {
        Carer carer=carerMapper.findCarerByCarNumber(carNumber);
        return carer;
    }

    @Override
    public void updateCarer(Carer carer) {
          carerMapper.updateCarer(carer);
    }

    /**
     * 通过id查找一个车主
     *
     * @param id
     * @return
     */
    @Override
    public Carer findCarById(Integer id) {
        return carerMapper.findCarById(id);
    }
}

