/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Police
 * Author:   hxq
 * Date:     2019/5/21 14:45
 * Description: 警察实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.violation.bean;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈警察实体类〉
 *
 * @author hxq
 * @create 2019/5/21
 * @since 1.0.0
 */
public class Police implements Serializable{
    private Integer id;
    private String name;
    private String password;
    private Integer phone;
    private String city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Police{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                ", city='" + city + '\'' +
                '}';
    }
}

