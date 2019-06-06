/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PoliceServiceImpl
 * Author:   hxq
 * Date:     2019/5/21 23:18
 * Description: 警察服务实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.violation.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hxq.violation.bean.Police;
import com.hxq.violation.mapper.PoliceMapper;
import com.hxq.violation.service.PoliceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈警察服务实现类〉
 *
 * @author hxq
 * @create 2019/5/21
 * @since 1.0.0
 */
@Service(group = "bJPoliceService")
@Component
public class PoliceServiceImpl implements PoliceService {

    @Autowired
    private PoliceMapper policeMapper;

    @Override
    public void insertPolice(Police police) {
    policeMapper.insertPolice(police);
    }

    @Override
    public Police findPoliceByIdPass(Integer id, String password) {
        Police police=policeMapper.findPoliceByIdPass(id,password);
        return police;
    }

    @Override
    public List<Police> findAllPolices() {
        List<Police> polices=policeMapper.findAllPolices();
        return polices;
    }

    @Override
    public void updetePolice(Police police) {
        policeMapper.updetePolice(police);

    }

    @Override
    public void deletePolice(Integer id) {
        policeMapper.deletePolice(id);
    }

    @Override
    public Police findPoliceById(Integer id) {
        Police police=policeMapper.findPoliceById(id);
        return police;
    }
}

