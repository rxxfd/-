/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Violation
 * Author:   hxq
 * Date:     2019/5/21 14:48
 * Description: 违章罚单实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.violation.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈违章罚单实体类〉
 *
 * @author hxq
 * @create 2019/5/21
 * @since 1.0.0
 */
public class Violation implements Serializable {
    private Integer id;
    private Integer cId;
    private String cName;
    private String carNumber;
    private Integer cPhone;
    private Integer pId;
    private String pName;
    private String description;
    private Integer isPay;
    private String city;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss a")
    private Date time;

    public Integer getcPhone() {
        return cPhone;
    }

    public void setcPhone(Integer cPhone) {
        this.cPhone = cPhone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Violation{" +
                "id=" + id +
                ", cId=" + cId +
                ", cName='" + cName + '\'' +
                ", carName='" + carNumber + '\'' +
                ", cPhone=" + cPhone +
                ", pId=" + pId +
                ", pName='" + pName + '\'' +
                ", description='" + description + '\'' +
                ", idPay=" + isPay +
                ", time=" + time +
                '}';
    }
}

