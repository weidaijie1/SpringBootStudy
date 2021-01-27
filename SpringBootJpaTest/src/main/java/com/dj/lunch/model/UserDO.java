package com.dj.lunch.model;

import lombok.Data;
import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor;


import javax.persistence.Column;
import javax.persistence.*;

import java.util.Date;

/**
 * 用户实体类
 * */
@Data
@Entity
@Table(name="t_user")
public class UserDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String password;
    @Column(name = "sex", columnDefinition = "TINYINT(1)")
    private Integer sex;
    private Date lastLoginTime;
}


