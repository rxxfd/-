package com.hxq.violation.mapper;

import com.hxq.violation.bean.Police;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 警察持久层mapper
 * Created by hxq on 2019/5/21.
 */
public interface PoliceMapper {
    /**
     * 注册警察信息，由管理员进行操作
     * @param police
     * @return
     */
    public void insertPolice(@Param("police")Police police);

    /**
     * 通过id和password查询一个警察，用于登陆
     * @param id
     * @param password
     * @return
     */
    public Police findPoliceByIdPass(@Param("id") Integer id,@Param("password") String password);

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
    public void updetePolice(@Param("police") Police police);

    /**
     * 通过id删除警察
     * @param id
     * @return
     */
    public void deletePolice(@Param("id") Integer id);

    /**
     * 通过id找出警察
     * @param id
     * @return
     */
    public Police findPoliceById(@Param("id") Integer id);
}
