/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ViolationServiceImpl
 * Author:   hxq
 * Date:     2019/5/21 23:24
 * Description: 罚单服务实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.violation.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hxq.violation.bean.Violation;
import com.hxq.violation.mapper.ViolationMapper;
import com.hxq.violation.service.ViolationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈罚单服务实现类〉
 *
 * @author hxq
 * @create 2019/5/21
 * @since 1.0.0
 */
@Service(group = "gDViolationService")
@Component
public class ViolationServiceImpl implements ViolationService {

    @Autowired
    private ViolationMapper violationMapper;
    @Override
    public void insertViolation(Violation violation) {
       violationMapper.insertViolation(violation);
    }

    @Override
    public List<Violation> findAllByCid(Integer cId) {
        List<Violation> violations=violationMapper.findAllByCid(cId);
        return violations;
    }

    @Override
    public List<Violation> findAllByCname(String cName) {
        List<Violation> violations=violationMapper.findAllByCname(cName);
        return violations;
    }

    @Override
    public List<Violation> findAllByCarNumber(String carNumber) {
        List<Violation> violations=violationMapper.findAllByCarNumber(carNumber);
        return violations;
    }

    @Override
    public void updateIsPay1(Integer id) {
        violationMapper.updateIsPay1(id);
    }

    /**
     * 通过警察的id查找自己开的罚单，用于警察界面查找自己的所有开过的罚单
     *
     * @param pId 警察的id
     * @return罚单集合
     */
    @Override
    public List<Violation> findAllByPid(Integer pId) {
        return violationMapper.findAllByPid(pId);
    }
}

