package com.github.pokemon.user.center.pojo.dto;

import com.github.pokemon.user.center.pojo.entity.SystemUserDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

/**
 * TODO
 * <p>
 * create in 2021/1/13 11:22 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class SimpleUserDTO {

    private String username;

    private String phone;

    private String email;

    public SystemUserDO toSystemUser(){
        SystemUserDO user = new SystemUserDO();
        BeanUtils.copyProperties(user, this);
        return user;
    }

}
