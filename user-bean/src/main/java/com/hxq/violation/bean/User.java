/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: User
 * Author:   hxq
 * Date:     2019/5/22 22:05
 * Description: 登陆实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.violation.bean;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈登陆实体类〉
 *
 * @author hxq
 * @create 2019/5/22
 * @since 1.0.0
 */
public class User implements Serializable {
   private Integer id;
   private String password;
   private String shenfen;
   private String initCity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInitCity() {
        return initCity;
    }

    public void setInitCity(String initCity) {
        this.initCity = initCity;
    }

    public String getShenfen() {
        return shenfen;
    }

    public void setShenfen(String shenfen) {
        this.shenfen = shenfen;
    }
}

