package com.hxq.violation.service;

import com.hxq.violation.bean.Police;

import java.util.List;

/**
 * Created by hxq on 2019/5/21.
 */
public interface PoliceService {

    /**
     * 注册警察信息，由管理员进行操作
     * @param police
     * @return
     */
    public void insertPolice(Police police);

    /**
     * 通过id和password查询一个警察，用于登陆
     * @param id
     * @param password
     * @return
     */
    public Police findPoliceByIdPass(Integer id,String password);

    /**
     * 查询所有的警擦
     * @return
     */
    public List<Police> findAllPolices();

    /**
     * 更新警察信息，管理员操作
     * @param police
     * @return
     */
    public void updetePolice(Police police);

    /**
     * 通过id删除警察
     * @param id
     * @return
     */
    public void deletePolice(Integer id);

    /**
     * 通过id查询警察
     * @param id
     * @return
     */
    public Police findPoliceById(Integer id);



}
