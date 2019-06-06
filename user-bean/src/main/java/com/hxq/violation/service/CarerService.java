package com.hxq.violation.service;

import com.hxq.violation.bean.Carer;

import java.util.List;

/**
 * 车主服务接口
 * Created by hxq on 2019/5/21.
 */
public interface CarerService {
    /**
     * 注册一个车主信息
     * @param carer
     * @return
     */
    public void insertCarer(Carer carer);

    /**
     * 查询所有车主的信息
     * @return
     */
    public List<Carer> findAllCarers();


    /**
     * 通过id和password查询一个车主，用于登陆
     * @param id
     * @param password
     * @return
     */
    public Carer findCarerByIdPass(Integer id,String password);

    /**
     * 通过id删除车主信息，由管理员操作
     * @param id
     * @return
     */
    public void deleteCarerById(Integer id);

    /**
     * 通过名字查询车主信息，警察操作
     * @param name
     * @return
     */
    public Carer findCarerByName(String name);

    /**
     * 通过车牌号查询车主信息
     * @param carNumber
     * @return
     */
    public Carer findCarerByCarNumber(String carNumber);


    /**
     * 更新车主信息，车主修改个人信息
     * @param carer
     * @return
     */
    public void updateCarer(Carer carer);

    /**
     * 通过id查找一个车主
     * @param id
     * @return
     */
    public Carer findCarById(Integer id);


}
