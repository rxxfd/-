package com.hxq.violation.mapper;

import com.hxq.violation.bean.Carer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 车主持久层Mapper
 * Created by hxq on 2019/5/21.
 */
public interface CarerMapper {
    /**
     * 注册一个车主信息
     * @param carer
     * @return
     */
    public void insertCarer(@Param("carer") Carer carer);

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
    public Carer findCarerByIdPass(@Param("id") Integer id, @Param("password") String password);

    /**
     * 通过id删除车主信息，由管理员操作
     * @param id
     * @return
     */
    public void deleteCarerById(@Param("id") Integer id);

    /**
     * 通过名字查询车主信息，警察操作
     * @param name
     * @return
     */
    public Carer findCarerByName(@Param("name") String name);

    /**
     * 通过车牌号查询车主信息
     * @param carNumber
     * @return
     */
    public Carer findCarerByCarNumber(@Param("carNumber") String carNumber);


    /**
     * 更新车主信息，车主修改个人信息
     * @param carer
     * @return
     */
    public void updateCarer(@Param("carer") Carer carer);

    /**
     * 通过id查找一个车主
     * @param id
     * @return
     */
    public Carer findCarById(@Param("id") Integer id);

}
